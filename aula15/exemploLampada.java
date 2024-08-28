package Aula1505;
import java.util.Scanner;
public class exemploLampada {
    String marca;
    String modelo;
    String cor;
    boolean estaLigada;

    void ligar(){
        estaLigada=true;//ta deixando
    }
    void desligar(){
        estaLigada=false;//
    }
    boolean isEstaLigada(){
        return estaLigada;
    }
}
