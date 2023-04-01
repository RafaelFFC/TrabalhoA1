package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Frota extends BaseTransporte {
    private List<Veiculo> veiculo;

    public List<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(List<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    public Frota() {
    }

    public Frota(int codigo, String descricao, LocalDate dataInsert) {
        super(codigo, descricao, dataInsert);
    }

}
