package ejercicios;

import ejercicios.utils.Usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Listarobjetos {

    private Scanner teclado;
    private ArrayList<Usuario>listausuarios;

    public Listarobjetos(){
        teclado=new Scanner(System.in);
        importardatos();
        if(listausuarios.size()>0){
            System.out.println("Listado los usuarios existentes");
            listartodos();
        }
    }

    private void importardatos(){
        File f=new File("scr/ejercicios/documentos/objetos.obj");
        if(f.exists()) {
            FileInputStream fileInputStream = null;
            ObjectInputStream ois = null;
            try {
                fileInputStream = new FileInputStream(f);
                ois = new ObjectInputStream(fileInputStream);
                listausuarios=(ArrayList<Usuario>)ois.readObject();
            } catch (FileNotFoundException e) {
                System.out.println("Fichero no encontrado, inicializando arraylist...");
                this.listausuarios=new ArrayList<>();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e){
                e.printStackTrace();
            }catch (ClassCastException e){
                System.out.println("Error en el casteo del objeto recuperado");
            }
        }
    }

    public void listartodos(){
        for(Usuario usuario:listausuarios){
            System.out.println(usuario.toString());
        }
    }


    public ArrayList<Usuario>getListausuarios(){
        return listausuarios;
    }

    public void setListausuarios(ArrayList<Usuario> listausuarios) {
        this.listausuarios = listausuarios;
    }

    public void agregarusuario(){

        String continuar=null;

        do {
            String nombre, apellido;
            int telefono;
            System.out.println("Intro nombre");
            nombre = teclado.next();
            System.out.println("Intro apellido");
            apellido = teclado.next();
            System.out.println("Intro telefono");
            telefono = teclado.nextInt();
            Usuario u = new Usuario(nombre, apellido, telefono);
            listausuarios.add(u);
            System.out.println("Continuar (Si/No)");
            continuar=teclado.next();
        }while(continuar.toLowerCase().equals("Si"));

        System.out.println("¿quieres exportar la lista de los usuarios?(Si/No)");
        continuar=teclado.next();
        if (continuar.toLowerCase().equals("Si")) {
            File file= new File("scr/ejercicios/documentos/objetos.obj");
            FileOutputStream fos=null;
            ObjectOutputStream oos=null;
            try{
                fos=new FileOutputStream(file);
                oos=new ObjectOutputStream(oos);
                oos.writeObject(listausuarios);
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }finally {
                try{
                    fos.close();
                    oos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("Saliendo sin exportar");
        }
    }

    @Override
    public String toString() {
        return "Listarobjetos{" +
                "listausuarios=" + listausuarios +
                '}';
    }

}
