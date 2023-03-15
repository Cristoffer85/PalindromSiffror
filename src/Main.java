//Textpalindrom
//Termer för övningen:
//    Palimdome är ett ord som är samma framifrån och bakifrån. Exempel på palindrom är "anna", "kajak" och "radar".
//    charAt() är en metod som tar en sträng som argument och returnerar ett tecken på den angivna positionen. Exempel:
//    "anna".charAt(0) returnerar "a".
//
//    length() är en metod som returnerar längden på en sträng. Exempel: "anna".length() returnerar 4.
//
//Instruktioner
//Skapa en metod som tar en sträng som argument och returnerar true om strängen är ett palindrom, annars false.
//I main-metoden, ska du fråga användaren om ett ord och sedan skriva ut om det är ett palindrom eller inte.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Hämta information ifrån användaren, scanner 1 - Fråga användaren om en siffra
        Scanner Palindrom1 = new Scanner(System.in);
        System.out.println("Skriv nummer här nedan för kontrollera om Palindrom eller ej: "); // Fråga användaren
        int number = Palindrom1.nextInt();


        int reversedNumber = 0;

        while (number > 0) {              //While-loop > 0 förhindrar att loopen kör på i evighet

            int lastDigit = number % 10;      //Få ut sista siffran i numret

            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;

        }

        public static reversedNumber() {
            if (number == reversedNumber) {
                System.out.println("Är en palindrom");
                return true;
            } else {
                System.out.println("Är inte en palindrom");
                return false;
            }
        }
    }
}
