import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.atacado.dominio.*;
import br.com.atacado.fakeDB.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        CategoriaFakeDB db = new CategoriaFakeDB();

        for(Categoria c : db.getTabela()){
            System.out.println(c.toString());
        }
    }}
