package org.sistemadepedidos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.sistemadepedidos.modelo.Produto;


public class ProdutoDAO {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public void salvar(Produto produto) {
        em.persist(produto);
    }

//    public List<Produto> listar() {
//        TypedQuery<Produto> query = em.
//                createQuery("select c from Contratante c", Produto.class);
//        return query.getResultList();
//    }
    public List<Produto> buscarTodos() {
        TypedQuery<Produto> query = em.
                createQuery("select c from Produto c", Produto.class);
        return query.getResultList();
    }

}