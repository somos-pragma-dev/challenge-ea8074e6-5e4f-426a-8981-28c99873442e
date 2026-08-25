package com.example.productapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void testGetAllProducts() throws Exception {
        mockMvc.perform(get("/api/products"))
               .andExpect(status().isOk());
    }

    @Test
    void testCreateProduct() throws Exception {
        ProductDTO productDTO = new ProductDTO(null, "Producto 1", BigDecimal.valueOf(10.99), 100, "Electrónica");
        String productJson = new ObjectMapper().writeValueAsString(productDTO);

        when(productService.createProduct(any(ProductDTO.class))).thenReturn(productDTO);

        mockMvc.perform(post("/api/products")
               .contentType(MediaType.APPLICATION_JSON)
               .content(productJson))
               .andExpect(status().isCreated());
    }
}