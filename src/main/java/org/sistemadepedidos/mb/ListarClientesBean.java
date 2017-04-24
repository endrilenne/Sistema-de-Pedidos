/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sistemadepedidos.mb;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.sistemadepedidos.dao.ClienteDAO;
import org.sistemadepedidos.modelo.Cliente;


@Named(value = "mbListarClientes")
@RequestScoped
public class ListarClientesBean {
    
    
   @Inject
    private ClienteDAO dao;
    private List<Cliente> clientes;

    @PostConstruct
    private void init(){
        this.clientes = dao.buscarTodos();
    }
    
    public List<Cliente> getCliente() {
        return clientes;
    }
    
}

    


