import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String tmp = "";
        Scanner incoming = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String expression = incoming.nextLine();
        Scanner in = new Scanner(expression); // Получение из консоли строки

          if (Calcul.checkExpression(expression)) {
            tmp = Calcul.calculateExpression(expression);
        } else {
            tmp = Calcul.calculateExpression(Calcul.convertRomanExpression(expression));

        } if (tmp != "Error") {
              if (Calcul.checkExpression(expression)) {
                  System.out.println(tmp);
              } else {
                  System.out.println(RomanNumber.arabicToRoman(Double.parseDouble(tmp)));
              }
        } else {
            System.out.println("Неверное выражение");
        }               // System.out.println(RomanArabic.arabicToRoman(1985));
        // System.out.println(RomanArabic.romanToArabic("mcmlxxxv"));






    }
}

