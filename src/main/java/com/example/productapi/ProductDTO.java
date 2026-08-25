package com.example.productapi;

import io.swagger.v3.oas.annotations.media.Schema;

public class ProductDTO {

    @Schema(description = "ID del producto", example = "1")
    private Long id;

    @Schema(description = "Nombre del producto", example = "Producto 1")
    private String name;

    @Schema(description = "Precio del producto", example = "10.99")
    private BigDecimal price;

    @Schema(description = "Stock del producto", example = "100")
    private Integer stock;

    @Schema(description = "Categoría del producto", example = "Electrónica")
    private String category;

    // Constructor, getters and setters
}