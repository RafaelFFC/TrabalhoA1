//atributo para classe real e atributo protected para classe abstrata.

package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codigoPessoa;
    protected String nome;
    protected String email;
    protected String site;
    protected LocalDate dataInclusao;

    public int getCodigoPessoa() {
        return codigoPessoa;
    }

    public void setCodigoPessoa(int codigoPessoa) {
        this.codigoPessoa = codigoPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public BasePessoa() {

    }

    public BasePessoa(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao) {
        this.codigoPessoa = codigoPessoa;
        this.nome = nome;
        this.email = email;
        this.site = site;
        this.dataInclusao = dataInclusao;
    }

    public abstract void Imprimir();
}
