package Objetos;

import java.io.*;
import java.util.ArrayList;

import Objetos.utils.Usuario;

public class Trabajarobjetocompleto {

    public void escribirobjeto(File file) {
        Usuario usuario = new Usuario("DAvid", "Herrera", "1234", 912445310);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(usuario);
            oos.writeUTF("asdasd");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void leerobjeto(File file) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Usuario obj = (Usuario) ois.readObject();
            System.out.println(obj.getNombre());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Tipos inconpatibles");
        }
    }

    public void escribirArray(File file) {
        ArrayList<Usuario> listausuarios = new ArrayList();
        listausuarios.add(new Usuario("lol","lol","124",954));
        listausuarios.add(new Usuario("Davi", "Herrea", "1284", 942534530));
        listausuarios.add(new Usuario("Dav", "Herre", "1244", 942534530));
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            for (Usuario usuario : listausuarios) {
                oos.writeObject(usuario);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}