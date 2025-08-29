public class Solution {
    public static double converterStringParaDouble(String valor) {
        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            return -1.0;
        }
    }
}
