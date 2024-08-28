package aula21.banco;
import java.util.Random;
import java.util.Scanner;
public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    protected float saldo;

    public Conta(String titular, String senha){
        this.titular = titular;
        this.senha = senha;
        geraIdentificador();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha(){
        return senha;
    }

    public String getIdentificador() {
        return identificador;
    }

    private void geraIdentificador() {
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0; i<4; i++){
            identificador += (char) aleatorio.nextInt(65, 90);
        }
        identificador += "_" + aleatorio.nextInt(1000, 2000);
        this.identificador = identificador;
    }


    void depositar(float valor){
        saldo += valor;
    }

    boolean validaAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }
}
