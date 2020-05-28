package ficheros;

import java.io.File;

public class Entrada {

    public static void main(String[]args){

        Trabajoficheros trabajoficheros= new Trabajoficheros();
        trabajoficheros.listarficheros(new File("scr/esdanda"));
        File f=new File("scr/Documentos/ejemplo.txt");
        File f2=new File("scr/Documentos/ejemplo2.txt");
        trabajoficheros.evaluarfichero(f);
        trabajoficheros.listarficheros(f2);
        trabajoficheros.leerficheros(f);
        trabajoficheros.leerficherosbuffer(f);
        trabajoficheros.leerASCII(f);
        trabajoficheros.escribirFichero(new File("scr/Documentos/escritura.txt"));
        trabajoficheros.escribirBuffer(f);

    }

}
