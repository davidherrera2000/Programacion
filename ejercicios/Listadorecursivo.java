package ejercicios;

import ejercicios.utils.Usuario;

import java.io.*;
import java.util.Scanner;

public class Listadorecursivo {

    private Scanner teclado;
    private int elementos;

    public Listadorecursivo(){
        teclado = new Scanner(System.in);
        elementos=0;
    }

    public void listarec(File file){
        if(file.isDirectory()){
            File[] listaficheros=file.listFiles();
            for (File fileitem: listaficheros){
                if(fileitem.isDirectory()){
                    System.out.printf("Es un directorio con nombre %s y contenido: %n",fileitem.getName());
                    listarec(fileitem);
                }
            }
        }
    }

    public void listarRecmanual(){
        File file= new File("scr");
        if(file.isDirectory()){
            File[] listaficheros1= file.listFiles();
            for(File file1:listaficheros1){
                if(file1.isDirectory()){
                    File[]listaficheros2=file1.listFiles();
                    for (File file2:listaficheros2){
                    }
                }else{
                    System.out.println(file1.getName());
                }
            }
        }else{
            System.out.println(file.getName());
        }
}

    public void listarpeticion(File file){
        int opcion=0;
        File[] listaDirectorios=file.listFiles();
        for (int i=0; i<listaDirectorios.length;i++){
            System.out.printf("%d -%s %n",i,listaDirectorios[i].getName());
        }

        System.out.printf("%d -%s %n",listaDirectorios.length,"Volver");
        System.out.println("introduce cual quieres ver");
        opcion=teclado.nextInt();

        if(opcion == listaDirectorios.length) {
            listarpeticion(file.getParentFile());
        }else{
                if (!listaDirectorios[opcion].isDirectory()) {
                    System.out.println("Se trata de un fichero");
                } else {
                    if (opcion == listaDirectorios.length) {
                        listarpeticion(file);
                    } else {
                        listarpeticion(listaDirectorios[opcion]);
                    }
                }
            }

    }




}