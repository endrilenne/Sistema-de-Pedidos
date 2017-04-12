/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemadepedidos.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.sistemadepedidos.modelo.Produto;

/**
 *
 * @author Enisval
 */
public class ProdutoDAO {
    @PersistenceContext
    private EntityManager em;
    
    @Transactional
    public void salvar(Produto produto){
        em.persist(produto);
    }
    
    
            
}
