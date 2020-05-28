package ejercicios;

import ejercicios.utils.Usuario;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Juegodeadivinar {

    private Scanner teclado;
    ArrayList<Usuario>listausuarios;

    public Juegodeadivinar(){
        listausuarios= new ArrayList<>();
        teclado= new Scanner(System.in);
    }

    public void iniciarjuego(){
        String nombrejugador;
        int intentos=0;
        int numerointro=-1;
        int aleatorio=10;
        System.out.println("Aleatorio: "+aleatorio);
        System.out.println("introduce nombre");
        nombrejugador=teclado.next();
        do{
            intentos++;
            System.out.println("introduce numero");
            numerointro=teclado.nextInt();
        }while (numerointro!=aleatorio);
            exportarResultado();

    }

    private void exportarResultado() {
        File f= new File("scr/ejercicios/documentos/ej1.txt");
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(f,true);
            bw=new BufferedWriter(fw);
            for(Usuario usuario:listausuarios){
                bw.write(usuario.formatojuego());
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fw.close();
                bw.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }


}
