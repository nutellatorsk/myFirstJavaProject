package exam;

public class Logic {

        private int lines = 0; //Variabel som representerar rader
        private int chars = 0; //Variabel som representerar tecken


        public void sumLines(String line) { //Konstruktor. För att räkna rader

            lines++;          // Ökning av rader, för varje rad läggs det på en till.

        }

        public void sumChars(String line){ //Konstruktor. För att räkna tecken.
            chars += line.length();  // Räknar tecken
        }


        public int getLines() { //Metod för att kunna anropa lines (mängden rader) från main.
            return lines;
        }


        public int getChars() {//Metod för att kunna anropa chars (mängden tecken) från main.
            return chars;
        }
    }


