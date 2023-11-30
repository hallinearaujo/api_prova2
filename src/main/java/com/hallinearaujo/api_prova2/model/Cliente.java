package com.hallinearaujo.api_prova2.model;

import jakarta.persistence.*;

//criação das classes da aplicação de vendas com base nas tabelas criadas no script data.sql
@Entity
@Table
public class Cliente {
    @Id //definir qual a primary key da entidade
    @GeneratedValue(strategy = GenerationType.AUTO) //autoincremento
    @Column (name = "id") //fazer definições da coluna
    private Integer id;
    @Column(name="nome", length = 100)
    private String nome;


    //lembrar: construtor da lista de mapeamento
    public Cliente() {
    }


    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
