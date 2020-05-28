package Excepciones;

import java.io.*;
import java.io.FileReader;
import java.io.IOException;

public class Claseex1 {

    public int realizardivision(int op1,int op2){
        int division;
        try{
            division=op1/op2;
        }catch(ArithmeticException e){
            division=0;
        }return division;
        }

    public void leerfichero(File file){
        try {
            FileReader fileReader = new FileReader(file);
            fileReader=null;
            fileReader.read();
        }catch(IOException e){
            System.out.println("Fichero no encontrado");
        }catch(NullPointerException e){
            System.out.println("Algo es nulo");
        }
    }

    public void lanzarmiExcept(int numero) throws Exception{
        if (numero<0){
            throw new Exception("Excepción lanzada por el programador");
        }
        System.out.println(numero);
    }

    public void lanzarmiExceptperso(int numero) throws Miexception{
        if (numero<0){
            throw new Miexception("Excepción lanzada por el programador");
        }
        System.out.println(numero);
    }


}
