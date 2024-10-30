package com.gustadev.appmercado.model;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_item_lista")
public class ItemLista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item")
    private Integer numSeq;
    @Column(name="qt_item",nullable = false)
    private Double quantidade;
    @Column(name="vl_preco_total", nullable = false)
    private Double precoTotal;
    @Column(name="ie_concluido")
    private Integer concluido;
    @ManyToOne
    @JoinColumn(name="tbl_produto_id_produto")
    private Produto produto;
    @ManyToOne
    @JoinColumn(name="tbl_lista_id_list")
    private Lista lista;

    public Integer getNumSeq() {
        return numSeq;
    }

    public void setNumSeq(Integer numSeq) {
        this.numSeq = numSeq;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Integer getConcluido() {
        return concluido;
    }

    public void setConcluido(Integer concluido) {
        this.concluido = concluido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Lista getLista() {
        return lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }
}


