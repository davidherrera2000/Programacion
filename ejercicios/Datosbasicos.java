package ejercicios;

import ejercicios.utils.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Datosbasicos {

    Scanner teclado;
    ArrayList<Usuario> listaUsuarios;

    public Datosbasicos(){
        teclado= new Scanner(System.in);
        listaUsuarios=new ArrayList<>();
    }

    public void agregarusuario(){
        String nombre,apellido,dni;
        int telefono,edad;
        String continuar;
        do {
            System.out.println("Intro nombre");
            nombre = teclado.next();
            System.out.println("Intro apellido");
            apellido=teclado.next();
            System.out.println("Intro dni");
            dni=teclado.next();
            System.out.println("Intro telefono");
            telefono=teclado.nextInt();
            System.out.println("Intro edad");
            edad=teclado.nextInt();
            listaUsuarios.add(new Usuario(nombre,apellido,dni,telefono,edad));
            System.out.println("¿Quieres continuar? (SI/NO)");
            continuar=teclado.next();
        }while (continuar.toUpperCase().equals("SI"));
        exportarlista();
    }

    public void exportarlista(){
        File f= new File("scr/ejercicios/documentos/ej1.txt");
        FileWriter fw=null;
        BufferedWriter bw=null;
        try{
            fw=new FileWriter(f);
            bw=new BufferedWriter(fw);
            if(listaUsuarios.isEmpty()){
                System.out.println("La lista está vacía");
            }else{
                for(Usuario item:listaUsuarios){
                    bw.write(item.toString());
                    bw.newLine();
                }
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
