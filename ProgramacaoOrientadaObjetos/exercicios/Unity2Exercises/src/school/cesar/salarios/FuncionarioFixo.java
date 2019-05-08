package school.cesar.salarios;

public class FuncionarioFixo extends Funcionario {
    private double salario;

    public FuncionarioFixo(String nome, String CPF, double salario) {
        super(nome, CPF);
        this.salario = salario;
    }

    @Override
    public double getSalario(){
        return this.salario;
    }
}
