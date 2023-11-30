package com.hallinearaujo.api_prova2.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table (name = "pedido")
public class Pedido {
    @Id //para identificar a chave primaria
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne //muitos pedidos para um cliente
    @JoinColumn(name = "cliente_id") //onde é feito o mapeamento de um relacionamento
    private Cliente cliente;
    @Column(name = "data_pedido")
    private LocalDate dataPedido;
    @Column(name="total", length = 20, precision = 2)
    private BigDecimal total;

    //listar itens de pedido fazendo referência a tabela itemPedido
    @OneToMany(mappedBy = "pedido")
    private List<ItemPedido> itens;

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
