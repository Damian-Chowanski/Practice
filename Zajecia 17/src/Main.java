import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //zadanie1();
        zadanie2();
    }

    private static void zadanie2() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ProtectedData.txt"));
        String result = "";
        while (sc.hasNextLine()) {
            result += (char) Integer.parseInt(sc.nextLine());

        }
        System.out.println(result);
    }
    //
            /*if (x == 32){
                newLineAfterSeven++;
            }
            if (enterAfterSeven == 7){
                System.out.println();
                newLineAfterSeven=0;
            }*/


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