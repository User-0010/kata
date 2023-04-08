public class Obrabotka2 {
    // операции по вычислению чисел, которые в основном классе
    public static int poluchenie(int chislo1, String operand, int chislo2) {

        int otvetObrabotan = 0;


        switch (operand) {
            case "+":
                otvetObrabotan = chislo1 + chislo2;
                break;
            case "-":
                otvetObrabotan = chislo1 - chislo2;
                break;
            case "*":
                otvetObrabotan = chislo1 * chislo2;
                break;
            case "/":
                otvetObrabotan = chislo1 / chislo2;
                break;
        }
        return otvetObrabotan;
    }
}
