package com.example.productapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(this::convertToDTO).toList();
    }

    public ProductDTO getProductById(Long id) {
        return convertToDTO(productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException()));
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        if (productRepository.existsByName(productDTO.getName())) {
            throw new ProductAlreadyExistsException();
        }
        Product product = convertToEntity(productDTO);
        productRepository.save(product);
        return convertToDTO(product);
    }

    public ProductDTO updateProduct(Long id, ProductDTO productDTO) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setStock(productDTO.getStock());
        product.setCategory(productDTO.getCategory());
        productRepository.save(product);
        return convertToDTO(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    private ProductDTO convertToDTO(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getPrice(), product.getStock(), product.getCategory());
    }

    private Product convertToEntity(ProductDTO productDTO) {
        return new Product(productDTO.getId(), productDTO.getName(), productDTO.getPrice(), productDTO.getStock(), productDTO.getCategory());
    }
}