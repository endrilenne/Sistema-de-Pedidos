/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemadepedidos.mb;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.sistemadepedidos.dao.ClienteDAO;
import org.sistemadepedidos.modelo.Cliente;


@Named(value = "mbCadastrarClienteBean")
@RequestScoped
public class CadastrarClienteBean {

    Cliente cliente = new Cliente();

    @Inject
    ClienteDAO dao;

    public void adicionar() {
        dao.salvar(cliente);
//        System.out.println(produto);
    }

    public Cliente getCliente() {
        return cliente;
    }

}
