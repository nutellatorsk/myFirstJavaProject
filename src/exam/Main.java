package exam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //Skapat en skanner för att kunna läsa in rader från kommandoraden
        Logic texts = new Logic(); //Skapat ett objekt.


        //Skriver ut instruktion till användare
        System.out.println("Enter words or letters you want to count. Type \"Stop\" to exit");
        //Whileloop som körs så länge den är true, dvs tills användaren skriver stop.
        while (true) {
            String textTwo = scan.nextLine();  // Läser in en rad från användaren
            if (textTwo.equalsIgnoreCase("stop")) {  // Jämför texten. Om användaren skrivit stop så avslutas loopen.
                break;
            }
            texts.sumLines(textTwo);  // Beräkning av varv som görs i logikklassen
            texts.sumChars(textTwo);// Beräkning av tecken som görs i logikklassen
            }
                int chars = texts.getChars();  // Anropar på räknaren för tecken
                int lines = texts.getLines();  // Anropar på räknaren för rader

                System.out.println("You wrote " + chars+ " chars");
                System.out.println("You wrote " + lines + " lines if we exclude \"stop\"");

        }
    }

