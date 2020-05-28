package ficheros;
import java.io.*;

public class Trabajoficheros {

    public void evaluarfichero(File f){

        String rutacompleta= f.getAbsolutePath();
        File filacompleta=f.getAbsoluteFile();
        String rutacontenedor=f.getParent();
        System.out.println(rutacompleta);
        System.out.println(filacompleta);
        System.out.println(rutacontenedor);
        if(f.exists()){
            try{
                f.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }else{
            System.out.println("El fichero ya existe");
        }
    }

    public void listarficheros(File f){
        File file=new File("scr/Documentos/Carpeta");
        file.mkdir();
        if(f.isDirectory()){
            System.out.println();
            String[]listarficheros=f.list();
        }
    }

    public void leerficheros(File f){
        try {
            FileReader fileReader = new FileReader(f);
            int codigo=0;
            while ((codigo=fileReader.read())>0){
                System.out.println(Character.toChars(codigo));
            }
        }catch (FileNotFoundException e){
            System.out.println("El fichero no existe");
        }catch (IOException e){
            System.out.println("Lectura no posible");
        }
    }

    public void leerficherosbuffer(File f){
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader = new FileReader(f);
            bufferedReader= new BufferedReader(fileReader);
            String linea=bufferedReader.readLine();
                System.out.println(linea);
            while ((linea=bufferedReader.readLine())!=null){
                System.out.println(linea);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    public void leerASCII(File f){
        FileReader fileReader=null;
        try {
            fileReader = new FileReader(f);
        int codigo=fileReader.read();
            System.out.println(String.valueOf(codigo));
    }catch (FileNotFoundException e){
            e.printStackTrace();
    }catch (IOException e){
            e.printStackTrace();
    }
    }

    public void escribirFichero(File f){

        String contenido="";
        String[] concursante=contenido.split("1");

        FileWriter fileWriter=null;
        try{
            fileWriter =new FileWriter(f);
            fileWriter.write("adsf");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void escribirBuffer(File f){
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try{
            fileWriter =new FileWriter(f,true);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Perverso de escritura de fichero");
            bufferedWriter.newLine();
            bufferedWriter.write("Perverso de escritura de fichero en una nueva linea");
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void escribirObjeto(File file)throws FileNotFoundException{
        FileOutputStream fileOutputStream=new FileOutputStream(file);
                try{
                    ObjectOutputStream obj=new ObjectOutputStream(fileOutputStream);
                    obj.writeObject(new Almacen());
                }catch (IOException e){
                    e.printStackTrace();
                }
    }

    }
