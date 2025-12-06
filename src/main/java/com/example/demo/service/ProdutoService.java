package com.example.demo.service;

import com.example.demo.dtos.CriarProdutoDTO;
import lombok.RequiredArgsConstructor;
import com.example.demo.model.Produto;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ProdutoRepository;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public Produto salvarProduto(CriarProdutoDTO dto) {
        Produto p = new Produto();
        p.setName(dto.name());
        p.setPrice(dto.price());
        p.setDescription(dto.description());
        p.setImg(dto.img());
        return produtoRepository.save(p);
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public Produto atualizarProduto(Long id, CriarProdutoDTO dto) {

        Produto p = buscarPorId(id);

        p.setName(dto.name());
        p.setPrice(dto.price());
        p.setDescription(dto.description());

        return produtoRepository.save(p);
    }

    public void deletarProduto(Long id) {
        Produto p = buscarPorId(id);
        produtoRepository.delete(p);
    }
}
