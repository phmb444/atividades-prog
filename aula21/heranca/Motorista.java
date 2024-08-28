package aula21.heranca;

public class Motorista extends Funcionario{
    private String cnh;

    public Motorista(String nome, String sobrenome){
        super(nome, sobrenome);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
}
