package ejercicios;

import java.io.*;

public class PalabrasOraciones {

    public void leercontenido(){

        File f = new File("scr/ejercicios/documentos/ej2.txt");
        FileReader fr = null;
        BufferedReader br = null;
        int numerooraciones= 0;
        int numeroLetras=0;
        int numeroPalabras=0;
        String[] oraciones= null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea = null;

            while ((linea = br.readLine()) != null) {
                oraciones=linea.split("\\.");
                numerooraciones+=oraciones.length;
            }
            System.out.println(oraciones);
            for(String oracion:oraciones){
                String[]palabras=oracion.split(" ");
                char [] letras=oracion.trim().toCharArray();
                numeroLetras+=letras.length;
                numeroPalabras+=palabras.length;
            }
            System.out.println("El numero de oraciones es:"+numerooraciones);
            System.out.println("El numero de letras es:"+numeroLetras);
            System.out.println("El numero de palabras es:"+numeroPalabras);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }



    }


}
