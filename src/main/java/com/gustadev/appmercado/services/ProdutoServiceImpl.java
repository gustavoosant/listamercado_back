package com.gustadev.appmercado.services;

import com.gustadev.appmercado.model.Produto;
import com.gustadev.appmercado.repository.ProdutoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProdutoServiceImpl implements IProdutoService{

    @Autowired
    private ProdutoRepo repository;

    @Override
    public Produto criarNovoProduto(Produto prod) {
        return repository.save(prod);
    }

    @Override
    public List<Produto> listarTodos() {
        return null;
    }

    @Override
    public List<Produto> buscarPorPalavraChave(String key) {
        return null;
    }

    @Override
    public Produto buscarPorId(Integer id){
        return null;
    }
}
