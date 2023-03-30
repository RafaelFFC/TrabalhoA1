package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa {
    private String cpf;
    private String rg;
    private String sexo;
    private String raca;
    private String nacionalidade;
    private String naturalidade;
    private String nomePai;
    private String nomeMae;

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNaturalidade() {
        return naturalidade;
    }
    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }
    public String getNomePai() {
        return nomePai;
    }
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getNomeMae() {
        return nomeMae;
    }
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public PessoaFisica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae) {
        super(codigoPessoa, nome, email, site, dataInclusao);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.raca = raca;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
    }

        @Override
    public void Imprimir() {
        System.out.println("Código da Pessoa: " + this.codigoPessoa);
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
        System.out.println("Site: " + this.site);
        System.out.println("Data de inclusão: " + this.dataInclusao);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Raça: " + this.raca);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Naturalidade:" + this.naturalidade);
        System.out.println("Nome do Pai: " + this.nomePai);
        System.out.println("Nome da Mãe: " + this.nomeMae);
    }

}
