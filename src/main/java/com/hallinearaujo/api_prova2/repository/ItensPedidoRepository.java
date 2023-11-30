package com.hallinearaujo.api_prova2.repository;

import com.hallinearaujo.api_prova2.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
