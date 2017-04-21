/**
 * This file was generated by the Jeddict
 */
package org.sistemadepedidos.modelo;

import java.sql.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @author Enisval
 */
@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private double valor;

    @Basic
    private Date data;

    @OneToMany(targetEntity = Produto.class)
    private List<Produto> produtoes;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public List<Produto> getProdutoes() {
        return this.produtoes;
    }

    public void setProdutoes(List<Produto> produtoes) {
        this.produtoes = produtoes;
    }

}