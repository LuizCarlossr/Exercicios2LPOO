//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Solution.realizarOperacao(10, 5, "somar"));
            System.out.println(Solution.realizarOperacao(10, 5, "subtrair"));
            System.out.println(Solution.realizarOperacao(10, 5, "multiplicar"));
            System.out.println(Solution.realizarOperacao(10, 5, "dividir"));

            System.out.println(Solution.realizarOperacao(10, 5, "modulo"));
        } catch (OperacaoInvalidaException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}