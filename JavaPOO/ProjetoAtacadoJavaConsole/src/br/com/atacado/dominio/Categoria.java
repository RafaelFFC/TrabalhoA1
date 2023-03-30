package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Categoria {
    private int codigo;
    private String descricao;
    private LocalDate dataDeInclusao;
    private List<Subcategoria> subcategorias;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }
    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }
    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }
    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }


    public Categoria() {
    }
    public Categoria(int codigo, String descricao, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataDeInclusao = dataDeInclusao;
    }
    
}
