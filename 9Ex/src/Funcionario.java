abstract class Funcionario implements Pagavel {
    String nome;
    double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
}