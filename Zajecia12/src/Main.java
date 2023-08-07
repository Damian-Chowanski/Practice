import java.util.Random;

public class Main {
    static int [][] randomNumbers = new int[10][10];
    static int [] longList = new int[1000];
    static Random rand = new Random();

    public static void main(String[] args) {

        /*ganarateList();
        System.out.println("Liczba 0 występuje: " + countOccurrences(0) +
                "\nLiczba 13 występuje: " + countOccurrences(13) +
                "\nLiczba 82 występuje: " + countOccurrences(82));*/
        //generate();
        //display();
    }

    private static int countOccurrences(int number) {
        int sum = 0;
        for (int j : longList) {
            if (j == number) {
                sum++;
            }
        }

        return sum;
    }

    private static void ganarateList() {
        for (int i = 0; i < longList.length; i++){
            longList[i] = rand.nextInt(0,83);
        }
    }

    private static void display() {
        for (int[] randomNumber : randomNumbers) {
            for (int j = 0; j < randomNumbers.length; j++) {
                System.out.print(randomNumber[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void generate() {

        for (int i=0; i < randomNumbers.length; i++){
            for(int j = 0; j < randomNumbers.length; j++){
                randomNumbers[i][j] = rand.nextInt(-10,21);
            }
        }
    }
}