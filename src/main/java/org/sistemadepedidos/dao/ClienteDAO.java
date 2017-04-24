/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemadepedidos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.sistemadepedidos.modelo.Cliente;
import org.sistemadepedidos.modelo.Produto;

public class ClienteDAO {
  



    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Cliente cliente) {
        em.persist(cliente);
    }

//    public List<Produto> listar() {
//        TypedQuery<Produto> query = em.
//                createQuery("select c from Contratante c", Produto.class);
//        return query.getResultList();
//    }
    public List<Cliente> buscarTodos() {
        TypedQuery<Cliente> query = em.
                createQuery("select c from Cliente c", Cliente.class);
        return query.getResultList();
    }

}

