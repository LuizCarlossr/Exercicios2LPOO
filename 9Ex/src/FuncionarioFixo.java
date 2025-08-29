class FuncionarioFixo extends Funcionario {
    FuncionarioFixo(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
