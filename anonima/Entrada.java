package anonima;

public class Entrada {
    public static void main(String[] args) {

        ClaseC claseC = new ClaseC();
        claseC.registrarMensajeElemento(new ClaseA() {
            @Override
            public void mostrarMensajeAbstracto() {
                System.out.println("mensaje lanzado desde la clase main");
            }
        });

    }
}
