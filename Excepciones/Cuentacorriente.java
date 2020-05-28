package Excepciones;

public class Cuentacorriente {

    private int saldo;

    public Cuentacorriente(){}

    public void Agregarsaldo(int ingreso){
        this.saldo+=ingreso;
    }

    public void Sacarsaldo(int sacar) throws Saldoinsuficienteex{
        if(sacar<=0||(this.saldo - sacar)<0){
            throw new Saldoinsuficienteex("Saldo insuficiente");
        }

        this.saldo-=sacar;

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
