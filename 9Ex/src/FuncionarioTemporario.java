class FuncionarioTemporario extends Funcionario {
    int horasExtras;

    FuncionarioTemporario(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 15.0);
    }
}