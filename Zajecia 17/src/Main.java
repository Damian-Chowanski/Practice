import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static char [][] square = new char[7][7];
    public static void main(String[] args) throws FileNotFoundException {
        //zadanie1();
        //zadanie2();
        zadanie3();
        displayTab();
    }

    private static void displayTab() {
        for (int i = 0; i < square.length; i++){
            for (int j = 0; j < square.length; j++) {
                if (square[i][j] != 'X') {
                    System.out.print("-");
                } else {
                    System.out.print(square[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static void zadanie3() {
        Random rnd = new Random();
        int qty = rnd.nextInt(5,15);
        for (int i = 0; i < qty;i++){
            int x = rnd.nextInt(0,6);
            int y = rnd.nextInt(0,6);
            if(square[x][y] == 'X'){
                i--;
            } else {
                square[x][y] = 'X';
            }
        }


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