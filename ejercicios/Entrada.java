package ejercicios;

import java.io.File;

public class Entrada {

    public static void main(String[]args){
        Datosbasicos datosbasicos=new Datosbasicos();
        datosbasicos.agregarusuario();
        Lecturabasica lecturabasica=new Lecturabasica();
        lecturabasica.leercontenido();
        PalabrasOraciones palabrasOraciones=new PalabrasOraciones();
        palabrasOraciones.leercontenido();
        TextoASCII textoASCII=new TextoASCII();
        textoASCII.traducirtextoascii();
        ASCIItexto asciItexto=new ASCIItexto();
        asciItexto.leerContenidoASCII();
        Juegodeadivinar juegodeadivinar=new Juegodeadivinar();
        juegodeadivinar.iniciarjuego();
        Listadorecursivo listadorecursivo=new Listadorecursivo();
        listadorecursivo.listarpeticion(new File("scr"));
        Listarobjetos listarobjetos=new Listarobjetos();
        listarobjetos.agregarusuario();

    }


}
