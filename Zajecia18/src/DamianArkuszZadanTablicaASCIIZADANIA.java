import java.util.Arrays;

public class DamianArkuszZadanTablicaASCIIZADANIA {

    public int zad1() {
        char x = 'Z';
        char y = 'a';
        char z = 'o';

        //Zsumuj wszystkie liczby reprezentujące pojedyńcze litery i ją zwróć

        return x + y + z;
    }

    public int[] zad2() {
        char[] letters = new char[]{'g', 'o', 'o', 'g', 'l', 'e'};
        int[] numLett = new int[letters.length];

        //Skopiuj tablicę 'letters' do tablicy 'numLett' tak aby każdy jej indeks był numeryczną reprezentacja litery
        for (int i = 0; i < letters.length; i++) {
            numLett[i] = letters[i];
        }

        return numLett;
    }

    public char[] zad3() {
        String letters = "PROGRAMOWANIE";
        char[] result = letters.toCharArray();

        /*
        for (int i=0; i < letters.length(); i++){
            result[i] = letters.charAt(i);
        }*/

        //Stwórz tablicę char[] a w jej indeksach umieść litery ze zmiennej 'letters'.

        return result;
    }

    public String zad4() {
        char[] result = {'P', 'R', 'O', 'G', 'R', 'A', 'M', 'O', 'W', 'A', 'N', 'I', 'E'};
        String letters = "";

        //W zmiennej 'letters' umieść wszystkie litery z tablicy 'result' tak aby tworzyły jednolite słowo.

        for (char x : result) {
            letters += x;
        }

        return letters;
    }

    public int zad5() {
        char[] result = {'O', 'B', 'I', 'E', 'K', 'T', 'O', 'W', 'O', 'S', 'C'};
        int suma = 0;

        //W zmiennj 'suma' umieść sumę liczb reprezentujących litery z tablicy 'result'.

        for (char x : result) {
            suma += x;
        }

        return suma;
    }


    public int zad6() {
        int[] isLetter = {79, 33, 37, 47, 80, 44, 123, 80};
        int suma = 0;

        //W zmiennej 'suma' zsumuj TYLKO te liczby które reprezentują litery.
        for (int i : isLetter) {
            if (('A' <= i && i <= 'Z') || ('a' <= i && i <= 'z')) {
                suma += i;
            }
        }

        return suma;
    }


    public int zad7() {
        int[] isLetter = {122, 120, 64, 83, 118, 86, 111, 102, 64, 64, 120, 115, 77, 83, 91, 64, 77, 115, 74, 90, 64, 79, 90, 77, 74, 85, 93, 73, 101, 81, 76, 64, 64, 85, 102, 64, 100, 101, 106, 64, 122, 64, 92, 72, 98, 95, 64, 78, 121, 66, 64};
        int suma = 0;

        //W zmiennej 'suma' zsumuj ilość wystąpień znaku '@'.

        for (int x : isLetter) {
            if ((char) x == '@') {
                suma++;
            }
        }

        return suma;
    }


    public boolean zad8() {
        int[] isLetter = {82, 89, 74, 67, 74, 78, 84, 80, 69, 75, 65, 78, 90, 87, 75, 86, 68, 78, 72, 89, 67, 84, 69, 71, 66, 71, 88, 74, 80, 73, 77, 77, 90, 67, 69, 85, 89, 81, 85, 84, 84, 67, 79, 66, 72, 74, 82, 83, 68, 89, 73};

        //W tablicy 'isLetter' sprawdź czy są indeksy zawierające numeryczny odpowiednik dla 'A', 'G', 'X' i przypisz ich zmiennym
        // true/false,
        boolean isA = false;
        boolean isG = false;
        boolean isX = false;

        for (int x : isLetter) {
            if ((char) x == 'A') {
                isA = true;
            }
            if ((char) x == 'G') {
                isG = true;
            }
            if ((char) x == 'X') {
                isX = true;
            }
        }

        return isA && isG && isX;
    }


    public char[] zad9() {
        char[] alfabet = new char[26];

        //Uzupełnij tablice 'alfabet' tab aby całość reprezentowała alfabet (Tylko duże litery).

        for (int i = 0; i < alfabet.length; i++) {
            alfabet[i] = (char) (i + 'A');
        }


        return alfabet;
    }


    public char[] zad10() {
        char[] alfabet = new char[26];

        //Uzupełnij tablice 'alfabet' tab aby całość reprezentowała alfabet (Tylko małe litery).
        for (int i = 0; i < alfabet.length; i++) {
            alfabet[i] = (char) (i + 'a');
        }
        return alfabet;
    }


    public char[] zad11() {
        char[] znaki = new char[6];

        //Wyświetl te znaki które w tablicy ASCII znajdują się miedędzy dużymi literami alfabetu a małymi.
        for (int i = 0; i < znaki.length; i++) {
            znaki[i] = (char) (i + 'Z' + 1);
        }

        return znaki;
    }

    public String zad12() {
        int[][] tab = {{30, 7, 30},
                {30, 5, 30},
                {30, 40, 12}};

        String outText = "";

        for (int[] x : tab) {
            int sum = 0;
            for (int y : x) {
                sum += y;
            }
            outText += (char) sum;
        }

        //Suma każdego rzędu tablicy dwuwymiarowej 'tab' reprezentuje literę, zmienna 'outText' ma zwracać słowo ukryte w tej tablicy.

        return outText;
    }

    public int zad13() {
        int[] tab = {54, 58, 73, 100, 101, 48, 63, 115, 32, 68, 126, 81, 38, 98, 12, 120, 23, 103, 108, 113, 86, 89, 106, 89, 105, 31, 32, 123, 32, 83, 93, 98, 74, 10, 115, 115, 83, 41, 89, 21, 96, 36, 19, 56, 120, 59, 45, 96, 107, 47, 117};

        //Do zmiennej 'itx' zwróć ILOŚC WYSTĄPIEN tych liczb które w tablicy ASCII reprezentują duże litery alfabetu.

        int itx = 0;

        for (int x : tab) {
            if ('A' <= x && x <= 'Z') {
                itx++;
            }
        }

        return itx;
    }
}