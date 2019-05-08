package school.cesar.salarios;

public class FuncionarioExtras extends Funcionario {
    private final int CARGA_HORARIA = 40;
    private final double BONUS_EXTRA = 1.5;
    private int horasExtra;
    private double remuneracaoBase;

    public FuncionarioExtras(String nome, String CPF, double remuneracaoBase, int horasExtra) {
        super(nome, CPF);
        this.remuneracaoBase = remuneracaoBase;
        this.horasExtra = horasExtra;
    }

    public double getSalario(){
        double valorHoraExtra = remuneracaoBase/CARGA_HORARIA * BONUS_EXTRA;
        return this.remuneracaoBase + valorHoraExtra * horasExtra;
    }

}
