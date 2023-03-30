package br.com.atacado.dominio;

import java.time.LocalDate;

public class Produto {
    private int codigo;
    private int codigoSubcategoria;
    private String descricao;
    private LocalDate dataDeInlcusao;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigoSubcategoria() {
        return codigoSubcategoria;
    }
    public void setCodigoSubcategoria(int codigoSubcategoria) {
        this.codigoSubcategoria = codigoSubcategoria;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDeInlcusao() {
        return dataDeInlcusao;
    }
    public void setDataDeInlcusao(LocalDate dataDeInlcusao) {
        this.dataDeInlcusao = dataDeInlcusao;
    }

    public Produto() {
    }

    public Produto(int codigo, int codigoSubcategoria, String descricao, LocalDate dataDeInlcusao) {
        this.codigo = codigo;
        this.codigoSubcategoria = codigoSubcategoria;
        this.descricao = descricao;
        this.dataDeInlcusao = dataDeInlcusao;
    }
    

}
