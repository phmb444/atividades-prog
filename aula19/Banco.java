package aula19;

import java.util.Scanner;
public class Banco {

    public static Conta cadastraConta() {
        System.out.println("cadastro da conta:");
        System.out.println("titular da conta: ");
        String titular = new Scanner(System.in).next();
        System.out.println("Qual a senha: ");
        String senha = new Scanner(System.in).next();
        System.out.println("Qual o depósito inicial: ");
        float valor = new Scanner(System.in).nextFloat();
        return new Conta(titular, senha, valor);
    }

    public static Conta acessaConta(Conta c1) {
        System.out.println("Acessando a conta " + c1.identificador);
        char opc;
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("d - depositar");
            System.out.println("s - sacar");
            System.out.println("v - verificar saldo");
            System.out.println();

            opc = new Scanner(System.in).next().toLowerCase().charAt(0);

            switch (opc) {
                case 'd' -> {
                    System.out.println("qual valor p depositar: ");
                    float valor = new Scanner(System.in).nextFloat();
                    c1.depositar(valor);
                    System.out.println("depósito realizado");
                }
                case 's' -> {
                    System.out.println("qual valor p sacara: ");
                    float valor = new Scanner(System.in).nextFloat();
                    if (c1.sacar(valor))
                        System.out.println("saque realizado");
                    else
                        System.out.println("saldo insuficiente");
                }
                case 'v' -> {
                    System.out.println(c1.verificaSaldo());
                }
            }
        }
        while (opc != 'e') ;
        return c1;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta[] lista = new Conta[10];
        int cont = 0;
        char opc;
        do {
            System.out.println("c - cadastrar nova conta");
            System.out.println("a - acessar uma conta");
            System.out.println("l - listar contas");
            System.out.println("e - sair");
            opc = ler.next().toLowerCase().charAt(0);
            switch (opc) {
                case 'c' -> {
                    lista[cont] = cadastraConta();
                    System.out.println("conta obteve o identificador " + lista[cont].identificador);
                    cont++;
                }
                case 'a' -> {
                    System.out.println("digite o identificador: ");
                    String id = ler.next();
                    System.out.println("digite a senha: ");
                    String senha = ler.next();
                    int posicao = -1;
                    for (int i = 0; i < cont; i++) {
                        if (lista[i].identificador.equals(id) && lista[i].senha.equals(senha))
                            posicao = i;
                    }
                    if (posicao >= 0) {
                        lista[posicao] = acessaConta(lista[posicao]);
                    } else
                        System.out.println("dados de acesso inválidos");
                }
                case 'l' -> {
                    System.out.println("listagem de contas");
                    for (int i = 0; i < cont; i++) {
                        System.out.println("titular: " + lista[i].titular);
                        System.out.println("identificador: " + lista[i].identificador);
                        System.out.println("---------");
                    }
                }
            }
        }
        while (opc != 'e');
    }
}