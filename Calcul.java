import java.util.Scanner;


public class Calcul  {
         public static String calculate(double num1, double num2, String operation) {
            switch (operation) {
            case "+": return (String.valueOf((num1 + num2)));
            case "-": return (String.valueOf((num1 - num2)));
            case "*": return (String.valueOf((num1 * num2)));
            case "/": if (num2 == 0) {
                return "Error";
            }   else {
                return (String.valueOf((num1 / num2)));
                            }

            default: return "Error";
           }

        }







        public static String getFirstNumber(String input){
            Scanner inputscanner = new Scanner(input);
        if (inputscanner.hasNextDouble()) {
            return String.valueOf(inputscanner.nextDouble());
        } else {
            return "Error";
        }
    }

    public static String getSecondNumber(String input){
        Scanner inputscanner = new Scanner(input);
        String result;
        for (int i = 1; i <= 2; i++){
            result = String.valueOf(inputscanner.next());
        }

        if (inputscanner.hasNextDouble()) {
            return String.valueOf(inputscanner.nextDouble());
        } else {
            return "Error";
        }
    }


    public static String getZnak(String input){
        Scanner inputscanner = new Scanner(input);
        String result;
        for (int i = 1; i <= 1; i++){
            result = String.valueOf(inputscanner.next());
        }

        if (inputscanner.hasNext("[+, \\-, *, /]")) {
            return String.valueOf(inputscanner.next("[+, \\-, *, /]"));
        } else {
            return "Error";
        }
    }

    public static boolean checkExpression(String input) {
             // StringBuffer firstargument, secondargument, znak;
             Scanner scanner = new Scanner(input);
             if (scanner.hasNextDouble()) {
                 return true;
             } else {
                 return false;
             }
    }
    public static String calculateExpression (String expression){

        if (Calcul.getFirstNumber(expression) == "Error") {
            return "Error";
        }
        if (Calcul.getSecondNumber(expression) == "Error") {
            return "Error";
        }
        else {

            return String.valueOf(Calcul.calculate(Double.parseDouble(Calcul.getFirstNumber(expression)), Double.parseDouble(Calcul.getSecondNumber(expression)), Calcul.getZnak(expression)));
        }

    }

    public static String convertRomanExpression(String expression) {
        Scanner scanner = new Scanner(expression);
        StringBuffer result = new StringBuffer();

        result.append(RomanNumber.romanToArabic(scanner.next()));
        result.append(" ");
        result.append(scanner.next());
        result.append(" ");
        result.append(RomanNumber.romanToArabic(scanner.next()));

        return result.toString();


    }


}
