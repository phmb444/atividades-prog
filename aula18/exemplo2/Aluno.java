package aula18.exemplo2;

public class Aluno {
    String nome;
    String sobrenome;
    String eMail;
    int codigo;
    float notaUm;
    float notaDois;

    float obterMedia(){
        return (notaUm+notaDois)/2;
    }

    String obterStatus(){
        float media = obterMedia();
        if(media>=8)
            return "foi aprovado.";
        else if(media>=6)
            return "está em recuperação.";
        else
            return "foi reprovado.";
    }
}
