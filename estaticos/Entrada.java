package estaticos;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args){
        database Database =new database();
        ArrayList<equipo> listaitalia=database.newinstance().getEquposItalia();
        ArrayList<equipo>listaequipo=Database.newinstance().getEquiposEspaña();
    }

}
