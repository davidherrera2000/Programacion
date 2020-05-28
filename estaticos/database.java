package estaticos;
import java.util.ArrayList;

public class database {

    ArrayList<equipo>listaequipo;

    public static database newinstance(){
        database objeto= new database();
        return objeto;
    }

    public ArrayList<equipo> getEquiposEspaña(){
        ArrayList<equipo> equipos = new ArrayList<>();
        equipos.add(new equipo("FC Barcelona",1));
        equipos.add(new equipo("Reeal Madrid",2));
        equipos.add(new equipo("Sevilla",3));
        equipos.add(new equipo("Real Sociedad",4));
        equipos.add(new equipo("Getafe",5));
        equipos.add(new equipo("Real Sociedad",6));
        return equipos;}

        public ArrayList<equipo> getEquposItalia(){
            ArrayList<equipo> equipos = new ArrayList<>();
            equipos.add(new equipo("Juventus",1));
            equipos.add(new equipo("Lazio",2));
            equipos.add(new equipo("Inter de Milán",3));
            equipos.add(new equipo("Atalanta",4));
            equipos.add(new equipo("Roma",5));
            equipos.add(new equipo("Nápoles",6));
            return equipos;
        }
    }
