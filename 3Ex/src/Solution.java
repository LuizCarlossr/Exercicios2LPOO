public class Solution {
    public static int realizarOperacao(int num1, int num2, String operacao) throws OperacaoInvalidaException {
        switch (operacao.toLowerCase()) {
            case "somar":
                return num1 + num2;
            case "subtrair":
                return num1 - num2;
            case "multiplicar":
                return num1 * num2;
            case "dividir":
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero não permitida");
                }
                return num1 / num2;
            default:
                throw new OperacaoInvalidaException("Operação inválida");
        }
    }
}
