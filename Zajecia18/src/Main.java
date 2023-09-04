

public class Main {
    public static void main(String[] args) {

    }

    public int zad1() {
        String cyf1 = "50";
        int cyf2 = Integer.parseInt(cyf1);       //Zmień cyf1 na zmienną typu Integer

        System.out.println(cyf2);
        return cyf2;
    }


    public String zad2() {
        int cyf1 = 50;
        String cyf2 = String.valueOf(cyf1);  //Zmień cyf1 na zmienną typu String

        System.out.println(cyf2);
        return cyf2;
    }


    public int zad3() {
        String a = "50";
        String b = "1024";

        int c = Integer.parseInt(a) + Integer.parseInt(b);  //Zsumuj zmienne 'a' i 'b' do zmiennej c (zmieniając ich typy)

        System.out.println(c);
        return c;
    }


    public String zad4() {
        int a = 1024;
        int b = 2044;

        String c = a + "-" + b;  //Zmień podane zmienne 'a' i 'b' na typy string a potem wyświetl je z myślnikiem pomiędzy aby uzystkac 1024-2044

        System.out.println(c);
        return c;
    }


    public int zad5() {
        String a = "50";
        String b = "34";

        String c = "200";
        String d = "12";

        int sum = Integer.parseInt(a + b + c + d);

        //Zsumuj wszytskie stringi ze sobą a następnie zwróć ich w zmiennej 'sum';
        System.out.println(sum);

        return sum;
    }


    public int zad6() {
        char a = '5';
        char b = '2';
        char c = '8';

        int n = Character.getNumericValue(a) + Character.getNumericValue(b) + Character.getNumericValue(c);   //Zmień typy char tak aby po zsumowaniu wszytskich do zmiennej 'n' otrzymać wynik 15

        System.out.println(n);
        return n;
    }


    public int zad7() {
        double a = 74.123;
        double b = 00.63;
        double c = 44.24;

        int sum = (int) (a + b + c);

        //Uwtórz zmienną która zsumuję zmienne 'a', 'b', 'c' i zwróci wynik bez liczb po przecinku
        return sum;
    }


    public double zad8() {
        int a = 50;
        int b = 34;
        double c = 99.68;
        double d = 12.67;

        double ans = a + b + c + d;

        //Zsumuj wszystkie zmienne ze sobą tak aby zwrócić wynik z liczbami po przecinku

        return ans;
    }


    public double zad9() {
        char a = '5';
        char b = '7';
        double c = 16.98;
        double d = 5.99;
        int e = 13;
        int f = 20;
        String g = "12";
        String h = "6.99";


        double ans = Character.getNumericValue(a) + Character.getNumericValue(b) + c + d + e + f + Double.parseDouble(g) + Double.parseDouble(h);

        //Dodaj wszystkie zmienne aby zwrócic ich sumę wraz z liczbami po przecinku

        return ans;
    }


    public String zad10() {
        double a = 149.99;
        double b = 258.61;
        double c = 1099.99;
        double d = 25999.99;

        String sum = a + "zł, " + b + "zł, " + c + "zł, " + d + "zł";

        //Wyświetl wszytskie zmienne w jednym ciągu z dodatkiem waluty 'zł' tak by zwrócić wynik -> 149.99zł, 258.61zł, 1099.99zł, 25999.99zł
        return sum;
    }


    public int zad11() {
        String a = "23";
        String b = "48";
        char c = '9';

        int sum = Integer.parseInt(a) + Integer.parseInt(b) + Character.getNumericValue(c);

        //Zwróć sume zmiennych 'a', 'b', 'c' w typie integer
        return sum;
    }


    public boolean zad12() {
        char a = '6';

        //Sprawdz czy zmienna 'a' to cyfra i zwórć true lub false;
        return Character.isDigit(a);
    }


    public boolean zad13() {
        String a = "b";

        boolean isTrue;
        try {
            Integer.parseInt(a);
            isTrue = true;
        } catch (NumberFormatException error) {
            isTrue = false;
        }

        System.out.println(isTrue);
        //Sprawdź czy zmienna 'a' to cyfra, zwróć true lub false
        return isTrue;
    }


    public int zad14() {
        String a = "53";
        char b = '9';
        double c = 12.00;
        char d = 'I';

        int z = 0;
        try {
            z += Integer.parseInt(a);
        } catch (NumberFormatException error) {
            z += 0;
        }

        if (Character.isDigit(b)) {
            z += Character.getNumericValue(b);
        }

        z += (int) c;

        if (Character.isDigit(d)) {
            z += Character.getNumericValue(d);
        }

        //Sprawdz każdą zmienną czy jest liczbą, jeśli tak zsumuj do zmiennej 'z' i zwróc.

        System.out.println(z);
        return z;
    }

    public int zad15() {
        char a = '6';
        char b = '9';
        char c = '2';
        char d = '5';

        int z = a * b * c * d;
        //Pomnóż zmienne 'a', 'b', 'c', 'd' a sumę przypisz do zmiennej 'z' i zwróć

        return z;
    }
}