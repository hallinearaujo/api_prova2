package com.hallinearaujo.api_prova2.repository;

import com.hallinearaujo.api_prova2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Integer> {
}
