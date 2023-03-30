package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {
    protected int codigo;
    protected String descricao;
    protected LocalDate dataInsert;

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

    public LocalDate getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(LocalDate dataInsert) {
        this.dataInsert = dataInsert;
    }

    public BaseTransporte(int codigo, String descricao, LocalDate dataInsert) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.dataInsert = dataInsert;
    }

}
