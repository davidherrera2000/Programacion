package Objetos;

import javax.sound.midi.ShortMessage;
import java.io.*;

public class Entrada {

    public static void main(String[] args){
    TrabajarObjetos trabajarObjetos = new TrabajarObjetos();
    Trabajarobjetocompleto trabajarobjetocompleto= new Trabajarobjetocompleto();
    trabajarObjetos.escribirdatos(new File("scr/Objetos/ficheros/ejemplo.bin"));
    trabajarObjetos.escribirdatofinal(new File("scr/Objetos/ficheros/datos.dat"));
    trabajarObjetos.leerdatofinal(new File("scr/Objetos/ficheros/datos.dat"));
    trabajarobjetocompleto.escribirobjeto(new File("scr//Objetos/ficheros/obj.dat"));
    trabajarobjetocompleto.leerobjeto(new File("scr//Objetos/ficheros/obj.dat"));
    trabajarobjetocompleto.escribirArray(new File("scr//Objetos/ficheros/obj.dat"));
}


}
