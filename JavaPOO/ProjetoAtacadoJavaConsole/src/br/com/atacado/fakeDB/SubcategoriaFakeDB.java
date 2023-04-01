package br.com.atacado.fakeDB;

import java.time.LocalDate;
import br.com.atacado.dominio.Subcategoria;

public class SubcategoriaFakeDB extends BaseFakeDB<Subcategoria>{

    @Override
    public void AutoFill() {
        this.tabela.add(new Subcategoria(1, 
        1,
        "Papinha",
        LocalDate.now()));
        
        this.tabela.add(new Subcategoria(1, 
        1, 
        "Papinha",
        LocalDate.now()));

        this.tabela.add(new Subcategoria(1,
        1, 
        "Papinha",
        LocalDate.now()));

        this.tabela.add(new Subcategoria(1, 
        1, 
        "Papinha",
        LocalDate.now()));

        this.tabela.add(new Subcategoria(1, 
        1, 
        "Papinha",
        LocalDate.now()));
}
