package com.gustadev.appmercado.repository;

import org.springframework.data.repository.CrudRepository;
import com.gustadev.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {
}
