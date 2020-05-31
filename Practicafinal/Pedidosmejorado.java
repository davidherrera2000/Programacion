package Practicafinal;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Pedidosmejorado {


    static int numeros;
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws URISyntaxException, IOException {

        final double refresco = 1.50;
        final double botellagua = 1;
        final double hamburguesa = 3.25;
        final double pizza = 10.50;
        final double alitas = 2.75;
        final double china = 12.75;
        final double mexicano = 7.15;
        final double sushi = 4.05;
        double cuenta = 0;
        int cuerefresco = 0;
        int cueagua = 0;
        int cuehamburg = 0;
        int cuepizza = 0;
        int cuealitas = 0;
        int cuechina = 0;
        int cuemexicano = 0;
        int cuesushi = 0;
        int numero = 0;


        JOptionPane.showMessageDialog(null, "Bienvenido a YummyFood");
        String[] botones = {"Comer", "Registrarse", "Ver restaurantes colaboradores", "Ayuda", "Salir"};
        int ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                    cuerefresco = numero;
                    cuenta += numero * refresco;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                    cueagua = numero;
                    cuenta += numero * botellagua;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                    cuehamburg = numero;
                    cuenta += numero * hamburguesa;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                    cuepizza = numero;
                    cuenta += numero * pizza;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                    cuealitas = numero;
                    cuenta += numero * alitas;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                    cuechina = numero;
                    cuenta += numero * china;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                    cuemexicano = numero;
                    cuenta += numero * mexicano;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                    cuesushi = numero;
                    cuenta += numero * sushi;
                    System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                         JOptionPane.showMessageDialog(null, "\n" +
                                 "Año de fundación en España: 2010\n" +
                                 "Sede: Madrid\n" +
                                 "Empleados: más de 100 personas\n" +
                                 "Número de usuarios: más de 2 millón de usuarios activos\n" +
                                 "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                                 "Variedad: más de 60 tipos de comida diferentes");
                    }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
                } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                            int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                            cuenta += pack1;
                            System.out.println(cuenta);
                            JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                            int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                            pack1*=2;
                            cuenta += pack1;
                            cuenta-=5;
                            System.out.println(cuenta);
                            JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                    String[] bsalir = {"Sí", "No"};
                    int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                    if (ventanasalir == 0) {
                    } else if (ventanasalir == 1) {
                        JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                        System.exit(0);
                    }
                } else if (ventanaayuda == 3) {

                }
            } else if (ventana == 4) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        ventana = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }
        if (ventana == 0) {
            String[] botones1 = {"Refresco", "Agua", "Hamburguesa", "Pizza", "Alitas de pollo", "Comida china", "Comida mexicana", "Sushi"};
            int ventana1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones1, botones1[0]);
            if (ventana1 == 0) {
                String[] refrescos = {"0","1", "2", "3", "4","5"};
                int refrescos1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, refrescos, refrescos[0]);
                numero=refrescos1;
                cuerefresco = numero;
                cuenta += numero * refresco;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 1) {
                String[] agua = {"0","1", "2", "3", "4","5"};
                int agua1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, agua, agua[0]);
                numero=agua1;
                cueagua = numero;
                cuenta += numero * botellagua;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 2) {
                String[] hamburguesas = {"0","1", "2", "3", "4","5"};
                int hamburguesas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hamburguesas, hamburguesas[0]);
                numero=hamburguesas1;
                cuehamburg = numero;
                cuenta += numero * hamburguesa;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 3) {
                String[] pizzas = {"0","1", "2", "3", "4","5"};
                int pizzas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, pizzas, pizzas[0]);
                numero=pizzas1;
                cuepizza = numero;
                cuenta += numero * pizza;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 4) {
                String[] alita = {"0","1", "2", "3", "4","5"};
                int alita1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, alita, alita[0]);
                numero=alita1;
                cuealitas = numero;
                cuenta += numero * alitas;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 5) {
                String[] chinas = {"0","1", "2", "3", "4","5"};
                int chinas1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, chinas, chinas[0]);
                numero=chinas1;
                cuechina = numero;
                cuenta += numero * china;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 6) {
                String[] mexicanos = {"0","1", "2", "3", "4","5"};
                int mexicano1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, mexicanos, mexicanos[0]);
                numero=mexicano1;
                cuemexicano = numero;
                cuenta += numero * mexicano;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
            } else if (ventana1 == 7) {
                String[] sushis = {"0","1", "2", "3", "4","5"};
                int sushi1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos refrescos quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, sushis, sushis[0]);
                numero=sushi1;
                cuesushi = numero;
                cuenta += numero * sushi;
                System.out.println(cuenta);
                JOptionPane.showMessageDialog(null, "Cuenta de refrescos:" + (cuerefresco) +"\n"+
                        "Cuenta de agua:" + (cueagua) +"\n"+
                        "Cuenta de hamburguesa:" + (cuehamburg) +"\n"+
                        "Cuenta de pizzas:" + (cuepizza) +"\n"+
                        "Cuenta de alitas:" + (cuealitas) +"\n"+
                        "Cuenta de Comida china:" + (cuechina) +"\n"+
                        "Cuenta de Comida mexicana:" + (cuemexicano) +"\n"+
                        "Cuenta de sushi:" + (cuesushi) +"\n"+
                        "Cuenta total:"+ (cuenta));
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            }
        } else if (ventana == 1) {
            String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");
            String respuesta1 = JOptionPane.showInputDialog("Escribe tu primer apellido");
            String respuesta2 = JOptionPane.showInputDialog("Escribe tu segundo apellido");
            Object formulario = JOptionPane.showInputDialog(null, "¿Eres mayor de 18 años?",
                    "", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Sí", "No"}, "Seleccione");
            String[] formulario1 = {"Sí", "No"};
            int ventanaformulario = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Tienes mascota?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formulario1, formulario1[0]);
            if (ventanaformulario == 0) {
                Object formulariosecundario = JOptionPane.showInputDialog(null, "¿Qué mascota tienes?",
                        "", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Gato", "Perro", "Pez", "Otros"}, "Seleccione");
            } else if (ventanaformulario == 1) {
                System.out.println("");
            }
            String respuesta3 = JOptionPane.showInputDialog("Escribe tu teléfono");
            Object formulario2 = JOptionPane.showInputDialog(null, "¿Dónde vives?",
                    "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Madrid", "Sevilla", "Toledo", "Barcelona", "Murcia", "Valencia", "Segovia", "Otros"}, "Seleccione");
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
                JOptionPane.showMessageDialog(null, "Registro cancelado");
            }
            String[] bsalir = {"Sí", "No"};
            int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
            if (ventanasalir == 0) {
            } else if (ventanasalir == 1) {
                JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                System.exit(0);
            }
        } else if (ventana == 2) {
            String[] restaurante = {"Telepizza", "Ginos", "Domino's Pizza", "The Wok Garden", "Taco Bell", "Foster's Hollywood"};
            int restaurante1 = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué restaurante quieres visitar?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, restaurante, restaurante[0]);
            if (restaurante1 == 0) {
                Desktop.getDesktop().browse(new URI("https://www.telepizza.es/"));
            } else if (restaurante1 == 1) {
                Desktop.getDesktop().browse(new URI("https://www.ginos.es/"));
            } else if (restaurante1 == 2) {
                Desktop.getDesktop().browse(new URI("https://www.dominospizza.es/"));
            } else if (restaurante1 == 3) {
                Desktop.getDesktop().browse(new URI("http://wokgarden.com/"));
            } else if (restaurante1 == 4) {
                Desktop.getDesktop().browse(new URI("https://tacobell.es/"));
            } else if (restaurante1 == 5) {
                Desktop.getDesktop().browse(new URI("https://fostershollywood.es/"));
            }
        } else if (ventana == 3) {
            String[] botonesayuda = {"Mi pedido llega tarde, ¿qué hago?", "¿Quiénes somos?", "Ver Promociones", "Cancelar"};
            int ventanaayuda = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda, botonesayuda[0]);
            if (ventanaayuda == 0) {
                JOptionPane.showMessageDialog(null, "Sentimos mucho la demora. Lo más rápido para averiguar cuando llegará tu pedido es que llames al restaurante, ya que son ellos los que sabrán con más exactitud qué ocurre con tu pedido.\n" +
                        "\n" +
                        "Busca tu email de confirmación.\n" +
                        "Encontrarás el número de teléfono del restaurante justo en la parte inferior del email resaltado en rojo.\n" +
                        "Recuerda indicarles el número de tu pedido y preguntarles por qué llega tarde y cuánto tiempo le falta para llegar.\n" +
                        "Si no puedes ponerte en contacto con ellos, avísanos cuanto antes y trataremos de acelerar la entrega.");
                String[] botonesayuda1 = {"Chatear ahora", "Preferiría llamar"};
                int ventanaayuda1 = JOptionPane.showOptionDialog(null, "Tenemos un equipo estupendo de agentes preparados para chatear contigo ahora. Presiona el botón de chat para comenzar o, si lo prefieres, llámanos o\n" +
                        " envíanos un email y te responderemos a la mayor brevedad posible. Nuestro horario de Atención al Cliente es de 08:30 a 00:30 horas de lunes a miércoles;\n" +
                        " y de 08:30 a 02:00 horas de jueves a domingo.", "¿Qué quieres hacer?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botonesayuda1, botonesayuda1[0]);
                if (ventanaayuda1 == 0) {
                    String respuestaformulario = JOptionPane.showInputDialog("Escribe lo que quieras decir");
                    JOptionPane.showMessageDialog(null, "Se ha enviado a la página y ya lo hemos recibido correctamente \n" +
                            "te enviaremos nuestra respuesta/solución lo antes posible");
                } else if (ventanaayuda1 == 1) {
                    JOptionPane.showMessageDialog(null, "Puedes hablar con nuestro equipo de amantes de la comida a domicilio (no un robot), entre las 08:30 y las 00:30 de lunes a miércoles; y entre las 08:30 y las 02:00 de jueves a domingo, llamando al +34 910 507 394");
                }
            } else if (ventanaayuda == 1) {
                Object consulta = JOptionPane.showInputDialog(null, "Acerca de Just Eat",
                        "Lugar donde vives", JOptionPane.QUESTION_MESSAGE, null,
                        new Object[]{"Otros datos", "Just Eat España", "Dirección", "Datos Registrales"}, "Seleccione");
                if (consulta == "Otros datos") {
                    JOptionPane.showMessageDialog(null, "YummyFood es una plataforma online (web y app) que pone en contacto a los amantes de la comida con los restaurantes que quieren expandir su oferta\n" +
                            "gastronómica más allá de las puertas de su local. Su principal objetivo es hacer que los usuarios disfruten la experiencia de poder elegir entre una amplia variedad de\n" +
                            "opciones y desde cualquier lugar.\n" +
                            "Fundada en 2001 en Dinamarca, la compañía lidera el mercado de comida a domicilio a nivel internacional. Actualmente, Just Eat está presente en 13 mercados:\n" +
                            "Dinamarca, Reino Unido, Canadá, Irlanda, Francia, Suiza, Noruega, Italia, España, Brasil, México, Australia y Nueva Zelanda.\n" +
                            "Según los últimos datos presentados por el Grupo, la compañía aumentó sus ingresos un 45% en 2017 alcanzando los 546 millones de libras (alrededor de 612,6 millones\n" +
                            "de euros).\n" +
                            "La compañía registró un total de 172 millones de pedidos en 2017, un 26% más que el año anterior.\n" +
                            "Actualmente YummyFood cuenta con 93.700 restaurantes adheridos a su plataforma en todo el mundo y 24 millones de usuarios activos.");
                }else if(consulta =="WorldEat España") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Año de fundación en España: 2010\n" +
                            "Sede: Madrid\n" +
                            "Empleados: más de 100 personas\n" +
                            "Número de usuarios: más de 2 millón de usuarios activos\n" +
                            "Total restaurantes: más de 9.000 restaurantes adheridos\n" +
                            "Variedad: más de 60 tipos de comida diferentes");
                }else if(consulta =="Dirección") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Calle Condesa de Venadito, 1 - planta 2 - 28027 Madrid\n" +
                            "CIF: B86008539");
                }else if(consulta =="Datos Registrales") {
                    JOptionPane.showMessageDialog(null, "\n" +
                            "Tomo: 27986\n" +
                            "Libro: 0\n" +
                            "Folio: 203\n" +
                            "Sección: 8\n" +
                            "Hoja: M 504397");
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 2) {
                JOptionPane.showMessageDialog(null, "Aquí también puedes comprar;\n" +
                        "son promociones y si compras más de uno hay descuento.");
                String[] promocion = {"Pack Americano", "Pack Chino", "Pack Japonés", "Speed Pack"};
                int promociones= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Qué quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion, promocion[0]);
                if (promociones == 0) {
                    String[] promocion1 = {"1", "2", "3", "4","5"};
                    int promociones1= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion1, promocion1[0]);
                    if (promociones1 == 0) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        cuenta += pack1;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 1) {
                        int pack1 = (int) (refresco + botellagua + hamburguesa + alitas);
                        pack1*=2;
                        cuenta += pack1;
                        cuenta-=5;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 2) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=3;
                        cuenta += pack1;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 3) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=4;
                        cuenta += pack1;
                        cuenta-=15;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    } else if (promociones1 == 4) {
                        int pack1= (int) (refresco+botellagua+hamburguesa+alitas);
                        pack1*=5;
                        cuenta += pack1;
                        cuenta-=20;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 1) {
                    String[] promocion2 = {"1", "2", "3", "4","5"};
                    int promociones2= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion2, promocion2[0]);
                    if (promociones2 == 0) {
                        int pack2 = (int) (refresco + china + alitas);
                        cuenta += pack2;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 1) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=2;
                        cuenta += pack2;
                        cuenta-=12;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 2) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=3;
                        cuenta += pack2;
                        cuenta-=16.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 3) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=4;
                        cuenta += pack2;
                        cuenta-=21.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones2 == 4) {
                        int pack2 = (int) (refresco + china + alitas);
                        pack2*=5;
                        cuenta += pack2;
                        cuenta-=27.40;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 2) {
                    String[] promocion3 = {"1", "2", "3", "4","5"};
                    int promociones3= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion3, promocion3[0]);
                    if (promociones3 == 0) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        cuenta += pack3;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 1) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=2;
                        cuenta += pack3;
                        cuenta-=4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 2) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=3;
                        cuenta += pack3;
                        cuenta-=9.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 3) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=12.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones3 == 4) {
                        int pack3 = (int) (refresco + sushi + botellagua);
                        pack3*=4;
                        cuenta += pack3;
                        cuenta-=16;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                } else if (promociones == 3) {
                    String[] promocion4 = {"1", "2", "3", "4","5"};
                    int promociones4= JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Cuántos packs quieres?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, promocion4, promocion4[0]);
                    if (promociones4 == 0) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        cuenta += pack4;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 1) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=2;
                        cuenta += pack4;
                        cuenta-=10;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 2) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=3;
                        cuenta += pack4;
                        cuenta-=19.50;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 3) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=4;
                        cuenta += pack4;
                        cuenta-=25.25;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }else if (promociones4 == 4) {
                        int pack4 = (int) (refresco + hamburguesa + botellagua+pizza+hamburguesa);
                        pack4*=5;
                        cuenta += pack4;
                        cuenta-=30.75;
                        System.out.println(cuenta);
                        JOptionPane.showMessageDialog(null, cuenta, "CUENTA", JOptionPane.QUESTION_MESSAGE);
                    }
                }
                String[] bsalir = {"Sí", "No"};
                int ventanasalir = JOptionPane.showOptionDialog(null, "Pulsa un boton:", "¿Quieres seguir?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, bsalir, bsalir[0]);
                if (ventanasalir == 0) {
                } else if (ventanasalir == 1) {
                    JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
                    System.exit(0);
                }
            } else if (ventanaayuda == 3) {

            }
        } else if (ventana == 4) {
            JOptionPane.showMessageDialog(null, "Vuelva cuando quiera");
            System.exit(0);
        }

        }
    }
