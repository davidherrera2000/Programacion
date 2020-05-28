package ejercicios;

import java.io.*;

public class ASCIItexto {

    public void leerContenidoASCII() {

        File f = new File("scr/ejercicios/documentos/ej6.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader= new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);
            int codigo = 0;
            String linea=null;

            while ((linea = bufferedReader.readLine()) != null) {
                String[] letras=linea.split("");
                for(String letraCod:letras){
                    System.out.println(Character.toChars(Integer.valueOf(letraCod)));
                }
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }

}
