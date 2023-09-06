
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DamianArkusz2 {
    Random rand = new Random();

    public int[] zad1() {
        int[] returnedTab = new int[10];

        for (int i = 0; i < returnedTab.length; i++) {
            returnedTab[i] = i;
        }
        //Zwróć tablice 'returnedTab' wypełnioną 10 cyframi od 0 do 9;
        return returnedTab;
    }


    public int[] zad2() {
        String[] wrongTab = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int[] correctTab = new int[wrongTab.length];

        for (int i = 0; i < wrongTab.length; i++) {
            correctTab[i] = Integer.parseInt(wrongTab[i]);
        }
        //Każdy indeks tablicy 'wrongTab' przypisz do tego samego indeksu tablicy 'correctTab' tak aby były typu Integer.
        return correctTab;
    }


    public String zad3() {
        char[] wrongTab = {'K', 'O', 'C', 'H', 'A', 'M', ' ', 'P', 'R', 'O', 'G', 'R', 'A', 'M', 'O', 'W', 'A', 'N', 'I', 'E'};
        String ans = "";

        for (char letter : wrongTab) {
            ans += letter;
        }
        //Zmienna 'ans' ma zwrócić każdy indeks tablicy 'wrongTab' jako jeden spójny tekst
        return ans;
    }


    public char[] zad4() {
        String wrongText = "KOCHAM PROGRAMOWANIE";
        char[] ans = new char[wrongText.length()];

        for (int i = 0; i < wrongText.length(); i++) {
            ans[i] = wrongText.charAt(i);
        }
        //Zmienna 'wrongText' ma zostać podzielona tak aby każda literka znajowała sie w oddzielnym indeksie tablicy 'ans';
        return ans;
    }


    public int[] zad5() {
        int[] randomTabNumber = new int[50];

        for (int i = 0; i < randomTabNumber.length; i++) {
            randomTabNumber[i] = rand.nextInt(0, 51);
        }
        //Każdy indeks tablicy 'randomTabNumber' ma zwracać losową liczbę z przedziłu 0 - 50;
        return randomTabNumber;
    }


    public int[][] zad6() {
        int[][] randomTabNumber = new int[10][10];
        for (int i = 0; i < randomTabNumber.length; i++) {
            for (int j = 0; j < randomTabNumber.length; j++) {
                randomTabNumber[i][j] = rand.nextInt(0, 51);
            }
        }
        //Każdy indeks tablicy 'randomTabNumber' ma zwracać losową liczbę z przedziłu 0 - 50;
        return randomTabNumber;
    }


    public boolean[] zad7() {
        int[] checkTab = {54, 67, 23, 78, 32, 23, 65, 99, 65, 10, 62, 33, 41, 48, 23, 12};
        boolean[] isCorrect = new boolean[checkTab.length];

        for (int i = 0; i < checkTab.length; i++) {
            isCorrect[i] = checkTab[i] % 3 == 0;
        }
        //Jeżeli indeks tablicy 'checkTab' jest podzielny przez 3 to w tym samym indeksie tablicy 'isCorrect' wstaw true.
        return isCorrect;
    }


    public int[] zad8() {
        String[] firstTab = {"23", "49", "11", "99", "12", "122", "62", "21", "40", "67"};
        char[] secondTab = {'2', '4', '6', '2', '2', '9', '9', '1', '0', '1'};

        int[] finalTab = new int[firstTab.length];

        for (int i = 0; i < finalTab.length; i++) {
            finalTab[i] = Integer.parseInt(firstTab[i]) * Character.getNumericValue(secondTab[i]);
        }
        //Każdy indeks tablicy 'firstTab' pomnóż przez ten sam indeks tablicy 'secondTab'. Wynik mnożenia przypisz do indeksu tablicy
        // 'finalTab'.
        return finalTab;
    }


    public boolean[] zad9() {
        String checkNumbers = "92as2dW23Wsc4WP59";
        boolean[] isDigit = new boolean[checkNumbers.length()];
        char[] splitedStrng = checkNumbers.toCharArray();

        for (int i = 0; i < checkNumbers.length(); i++) {
            isDigit[i] = Character.isDigit(splitedStrng[i]);
        }
        //Sprawdź każdy indeks zmiennej 'checkNumbers' czy jest to cyfra, jeśli tak to temu samemu indeksowi tablicy 'isDigit' przypisz
        // true, w innym wypadku przypisz false.
        return isDigit;
    }


    public double zad10() {
        String[] firstTab = new String[]{"764.14", "850.56", "665.41", "879.12", "451.02", "352.79", "980.83", "87.80", "332.92", "193.38"};
        String[] secondTab = new String[]{"283.47", "37.77", "150.45", "884.20", "44.90", "82.84", "401.22", "162.05", "874.62", "291.80"};
        String[] thirdTab = new String[]{"762.90", "347.51", "288.07", "955.72", "284.61", "915.33", "970.52", "460.72", "284.51", "828.57"};

        double sum = 0;
        for (int i = 0; i < firstTab.length; i++) {
            sum += Double.parseDouble(firstTab[i]) + Double.parseDouble(secondTab[i]) + Double.parseDouble(thirdTab[i]);
        }
        //Zsumuj wszytskie indeksy tablic 'firstTab', 'secondTab', 'thirdTab' do zmiennej 'sum'.
        return sum;
    }

    //TABLICE DWUWYMIAROWE
    public int[][] zad11() {
        int[][] tab = new int[5][5];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                tab[i][j] = rand.nextInt(0, 21);
            }
        }
        //Wypełnij tablice losowymi liczbami z przedziału 0 - 20;
        return tab;
    }


    public List<Integer> zad12() {
        int[][] tab = {{54, 36, 76, 99, 23},
                {65, 22, 87, 18, 10},
                {14, 59, 84, 64, 63}};

        List<Integer> numbersDivisibleByTwo = new LinkedList<>();

        for (int[] x : tab) {
            for (int j = 0; j < tab.length; j++) {
                if (x[j] % 2 == 0) {
                    numbersDivisibleByTwo.add(x[j]);
                }
            }
        }

        //Do listy 'numbersDivisibleByTwo' zapisz te Liczby tablicy 'tab' które są podzielne przez dwa.

        return numbersDivisibleByTwo;
    }


    public List<Integer> zad13() {
        int[][] tab = {{54, 36, 76, 99, 23, 14, 22},
                {65, 22, 87, 18, 10},
                {14, 59, 84, 64, 88, 91, 10, 24}};

        List<Integer> numbersDivisibleByTwo = new LinkedList<>();

        for (int[] x : tab) {
            for (int i : x) {
                if (i % 2 == 0) {
                    numbersDivisibleByTwo.add(i);
                }
            }
        }

        //Do listy 'numbersDivisibleByTwo' zapisz te Liczby tablicy 'tab' które są podzielne przez dwa.

        return numbersDivisibleByTwo;
    }


    public int[][] zad14() {
        int[] tab1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tab2 = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int[] tab3 = {21, 22, 23, 24, 25, 26, 27, 28, 29};

        int[][] finalTab = new int[3][9];

        finalTab[0] = tab1;
        finalTab[1] = tab2;
        finalTab[2] = tab3;

        //Wszytskie indeksy z tablic 'tab1', 'tab2', 'tab3' umieść w tej samej kolejności w tablicy 'finalTab'.

        return finalTab;
    }
}
