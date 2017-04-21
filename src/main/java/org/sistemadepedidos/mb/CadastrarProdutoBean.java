package org.sistemadepedidos.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.sistemadepedidos.dao.ProdutoDAO;

import org.sistemadepedidos.modelo.Produto;

@Named(value = "cadastrarProdutoBean")
@RequestScoped
public class CadastrarProdutoBean {

    Produto produto = new Produto();

    @Inject
    ProdutoDAO dao;

    public void adicionar() {
        dao.salvar(produto);
//        System.out.println(produto);
    }

    public Produto getProduto() {
        return produto;
    }

}