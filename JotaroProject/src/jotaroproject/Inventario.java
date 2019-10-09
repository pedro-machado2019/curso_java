package jotaroproject;

public class Inventario {
    
    String arma;
    double peso;
    int moedas_O, moedas_P, moedas_B;
    
    Inventario(String arma, int peso, int moedas_O, int moedas_P, int moedas_B){
        this.arma = arma;
        this.peso = peso;
        this.moedas_O = moedas_O;
        this.moedas_P = moedas_P;
        this.moedas_B = moedas_B;
    }
    
}
