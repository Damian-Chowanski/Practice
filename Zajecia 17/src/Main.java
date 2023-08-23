public class Main {
    public static void main(String[] args) {
        //zadanie1();
        zadanie2();
    }

    private static void zadanie2() {

    }

    private static void zadanie1() {
        for (int i = 0; i < 101; i++) {
            if (i != 0 && i != 1) {
                int dividers = 0;
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        dividers++;
                    }
                }
                if (dividers == 1) {
                    System.out.println(i);
                }
            }
        }
    }
}