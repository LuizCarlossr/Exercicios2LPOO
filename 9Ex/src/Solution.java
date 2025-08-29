public class Solution {
    public static void main(String[] args) {
        FuncionarioFixo fixo = new FuncionarioFixo("Luiz", 3000);
        FuncionarioTemporario temp = new FuncionarioTemporario("Carlos", 2500, 10);

        Pagavel[] funcionarios = {fixo, temp};

        System.out.println(calcularSalarioTotal(funcionarios));
    }

    public static double calcularSalarioTotal(Pagavel[] funcionarios) {
        double total = 0;
        for (Pagavel f : funcionarios) {
            total += f.calcularSalario();
        }
        return total;
    }
}