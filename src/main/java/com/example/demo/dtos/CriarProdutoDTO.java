package com.example.demo.dtos;

public record CriarProdutoDTO(
        String name,
        Double price,
        String description,
        String img
) {
}
