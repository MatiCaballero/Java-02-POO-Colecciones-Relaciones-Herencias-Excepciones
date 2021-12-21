package Ejercicio3.entidades;

public class Operacion {

    private int numero1;
    private int numero2;

    // Metodo constrctor con  atributos pasado por parametro
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodo constructor sin los atributos pasado por parametro
    public Operacion() {
    }

    // Metodos get y set
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

}
