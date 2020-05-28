package Objetos;

import java.io.*;

public class TrabajarObjetos {

    public void escribirdatos(File file){
        FileOutputStream fos=null;
        try{
            fos=new FileOutputStream(file);
            fos.write((byte)2);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fos.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void leerdatos(File file){
        FileInputStream fis=null;
        try{
            fis=new FileInputStream(file);
            System.out.println(fis.read());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void escribirdatofinal(File file){
        FileOutputStream fos=null;
        DataOutputStream dos=null;
        try{
            fos=new FileOutputStream(file);
            dos=new DataOutputStream(fos);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void leerdatofinal(File file){
        FileInputStream fis=null;
        DataInputStream dis=null;
        try{
            fis=new FileInputStream(file);
            dis=new DataInputStream(fis);
            int lectura=dis.readInt();
            System.out.println(lectura);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fis.close();
                dis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
