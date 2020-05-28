package Practicafinal;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import javax.swing.*;
import java.util.Scanner;
import javax.xml.validation.Schema;

public class Pedidos {


    static int numeros;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws URISyntaxException, IOException {

        final double refresco= 1.50;
        final double botellagua= 1;
        final double hamburguesa= 3.25;
        final double pizza= 10.50;
        final double alitas= 2.75;
        final double china= 12.75;
        final double mexicano= 7.15;
        final double sushi= 4.05;
        double cuenta= 0;
        int cuerefresco= 0;
        int cueagua= 0;
        int cuehamburg= 0;
        int cuepizza= 0;
        int cuealitas= 0;
        int cuechina= 0;
        int cuemexicano= 0;
        int cuesushi= 0;
        int numero = 0;



        JOptionPane.showMessageDialog(null, "Bienvenido a JustEat");
        String[] botones = {"Comer", "Registrarse", "Ver restaurantes colaboradores", "Salir"};
        int ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza","Alitas de pollo","Comida china","Comida mexicana","Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                System.out.printf("¿Cuántos refrescos quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuerefresco=numero;
                    cuenta += numero*refresco;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 1) {
                System.out.printf("¿Cuántos botellas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cueagua=numero;
                    cuenta += numero*botellagua;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 2) {
                System.out.printf("¿Cuántas hamburguesas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuehamburg=numero;
                    cuenta += numero*hamburguesa;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 3) {
                System.out.printf("¿Cuántas pizzas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuepizza=numero;
                    cuenta += numero*pizza;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }else if (ventana1 == 4) {
                System.out.printf("¿Cuántas alitas quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuealitas=numero;
                    cuenta += numero*alitas;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 5) {
                System.out.printf("¿Cuántos packs de comida china quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuechina=numero;
                    cuenta += numero*china;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 6) {
                System.out.printf("¿Cuántos packs de comida mexicana quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuemexicano=numero;
                    cuenta += numero*mexicano;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            } else if (ventana1 == 7) {
                System.out.printf("¿Cuántos sushis quieres?");
                numero=teclado.nextInt();
                if (numero<0){
                    System.out.printf("Número no válido");
                }else{
                    cuesushi=numero;
                    cuenta += numero*sushi;
                    System.out.println(cuenta);
                    JOptionPane.showMessageDialog(null, cuenta,"CUENTA", JOptionPane.QUESTION_MESSAGE);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Tienes un oficio?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro","Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Inglaterra", "España","Japón","Alemania","Italia","Rusia","Estados Unidos", "Otros"}, "Seleccione");
            String respuesta4 = JOptionPane.showInputDialog("Escribe el nombre para tu cuenta");
            String[] formulario3 = {"Sí", "No"};
            int ventanaformulario1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres poner algún comentario?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario3, formulario3[0]);
            if (ventanaformulario1 == 0) {
                String respuestaformulario = JOptionPane.showInputDialog("Escribe");
            } else if (ventanaformulario1 == 1) {
                System.out.println("");
            }
            String[] formulario4 = {"Sí", "No"};
            int ventanaformulario2 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres enviar los datos para registrarte?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario4, formulario4[0]);
            if (ventanaformulario2 == 0) {
                JOptionPane.showMessageDialog(null, "Tus datos se han enviado correctamente");
                JOptionPane.showMessageDialog(null, "Ya eres usuario de nuestra página web");
            } else if (ventanaformulario2 == 1) {
                JOptionPane.showMessageDialog(null, "Registro cancelado");            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos","Domino's Pizza","The Wok Garden","Taco Bell","Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            }else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            }else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
    }
}
