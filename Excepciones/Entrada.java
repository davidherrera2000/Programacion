package Excepciones;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Entrada {

    public static void main(String []args){

        Claseex1 claseex1= new Claseex1();
        System.out.println(claseex1.realizardivision(6,0));
        File f= new File("scr/ficheros/ejemplo.txt");
        claseex1.leerfichero(f);

        try{
            claseex1.lanzarmiExcept(-10);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            claseex1.lanzarmiExceptperso(-1);
        }catch(Miexception e){
            System.out.println(e.getMessage());
        }

        Cuentacorriente cuentacorriente=new Cuentacorriente();
        cuentacorriente.Agregarsaldo(123);
        int dinerosacado=0;
        try{
            cuentacorriente.Sacarsaldo(20456);
        }catch(Saldoinsuficienteex saldoinsuficienteex){
            System.out.println(saldoinsuficienteex.getMessage());
            System.out.println("Saldo al sacar");
            dinerosacado=cuentacorriente.getSaldo();
            cuentacorriente.setSaldo(0);
        }finally {
            System.out.println("Saldo al sacar");
            System.out.println(cuentacorriente.getSaldo());
            System.out.println("El dinero sacado es:"+dinerosacado);
        }


    }

}
