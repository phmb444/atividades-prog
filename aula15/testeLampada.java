package Aula1505;
import java.util.Scanner;
public class testeLampada {
    public static void main(String[] args) {
        exemploLampada lampadaUm = new exemploLampada();
        lampadaUm.marca = "avant";
        lampadaUm.modelo = "led";
        lampadaUm.cor = "roxo";
        lampadaUm.ligar();

        exemploLampada lampadaDois = new exemploLampada();
        lampadaDois.marca = "taschibra";
        lampadaDois.modelo = "fluorescente";
        lampadaDois.cor = "branco";
        lampadaDois.desligar();

        exemploLampada lampadaTres = new exemploLampada();
        lampadaTres.marca = "foxlux";
        lampadaTres.modelo = "led";
        lampadaTres.cor = "azul";
        lampadaTres.desligar();

        exemploLampada lampadaQuatro = new exemploLampada();
        lampadaQuatro.marca = "osram";
        lampadaQuatro.modelo = "fluorescente";
        lampadaQuatro.cor = "amarelo";
        lampadaQuatro.ligar();

        exemploLampada lampadaCinco = new exemploLampada();
        lampadaCinco.marca = "philips";
        lampadaCinco.modelo = "led";
        lampadaCinco.cor = "vermelho";
        lampadaCinco.ligar();
        if(lampadaQuatro.isEstaLigada()){
            System.out.println(lampadaQuatro.modelo+" está ligada");
        }
        else{
            System.out.println("desligada");
        }

    }
}
