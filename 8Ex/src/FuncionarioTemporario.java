class FuncionarioTemporario extends Funcionario {
    private int horasExtras;

    public FuncionarioTemporario(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 20.0);
    }
}