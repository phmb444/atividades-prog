package aula22.polimorfismo.override;

public class Aluno {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String obterDados(){
        return "Nome: " + getNome() + " " + getSobrenome() + " Matrícula: " + matricula;
    }
}