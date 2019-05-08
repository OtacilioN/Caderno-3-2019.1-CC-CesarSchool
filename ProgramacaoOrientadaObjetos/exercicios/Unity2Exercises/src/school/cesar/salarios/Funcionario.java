package school.cesar.salarios;

import java.util.ArrayList;

public abstract class Funcionario {
    private String nome, CPF;

    public Funcionario(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public abstract double getSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                ", getSalario=" + getSalario() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario f1 = new FuncionarioFixo("Joao", "100.971.424-41",  2000);
        funcionarios.add(f1);

        Funcionario f2 = new FuncionarioExtras("Joao", "200.231.832-12", 3000, 10);
        funcionarios.add(f2);

        for(Funcionario pessoa:funcionarios){
            System.out.println(pessoa);
        }
    }
}
