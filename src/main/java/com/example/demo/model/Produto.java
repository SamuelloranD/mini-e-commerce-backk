package com.example.demo.model;

import com.example.demo.dtos.CriarProdutoDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    private String description;

    private String img;

    public Produto(CriarProdutoDTO produtoDTO) {
        this.name = produtoDTO.name();
        this.price = produtoDTO.price();
        this.description = produtoDTO.description();
        this.img = produtoDTO.img();
    }
}
