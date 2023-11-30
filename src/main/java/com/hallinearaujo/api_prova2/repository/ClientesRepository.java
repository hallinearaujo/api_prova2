package com.hallinearaujo.api_prova2.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hallinearaujo.api_prova2.model.Cliente;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;

//@Repository
//public class ClientesRepository {
public interface ClientesRepository extends JpaRepository <Cliente, Integer> {

    @Query (value = " select c from Cliente c where c.nome like :nome ")
    List<Cliente> encontrarClientePorNome(@Param("nome") String nome);

   /* @Autowired
    private EntityManager entityManager; //criado para fazer todas operações com as entidades

    //salvando/persistindo na tabela cliente a partir do entityManager
    @Transactional
    public Cliente salvar (Cliente cliente) {
        entityManager.persist(cliente);
        return cliente;
    }

    //atualizando a tabela cliente
    @Transactional
    public Cliente atualizar(Cliente cliente){
        entityManager.merge(cliente);
        return cliente;
    }

    //deletando da tabela cliente
    @Transactional
    public void deletar(Cliente cliente){
        if(!entityManager.contains(cliente)){
            cliente = entityManager.merge(cliente);
        }
        entityManager.remove(cliente);
    }

    //deletando da tabela cliente por id
    @Transactional
    public  void deletar(Integer id){
        Cliente cliente = entityManager.find(Cliente.class,id);
        deletar(cliente);
    }

    //buscando nome de cliente na tabela
    @Transactional(readOnly = true)
    public List<Cliente> buscarPorNome(String nome){
        String jpql = " select c from Cliente c where c.nome like :nome ";
        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
        query.setParameter("nome", "%" + nome +"%");
        return query.getResultList();
    }

    @Transactional(readOnly = true)
    public List<Cliente> obterTodos(){
        return entityManager.createQuery("from Cliente", Cliente.class).getResultList();
    }*/

    }

