package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {
   private int codigoFrota;
   private String placa;

   public Veiculo() {
      super();
   }

   public Veiculo(int codigo, String descricao, LocalDate dataInsert, int codigoFrota) {
      super(codigo, descricao, dataInsert);
      this.codigoFrota = codigoFrota;
   }

}
