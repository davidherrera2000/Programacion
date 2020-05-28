package ejercicios;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lecturabasica {

    public void leercontenido() {


        File f = new File("scr/ejercicios/documentos/ej2.txt");
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String linea = null;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }



    }
}
