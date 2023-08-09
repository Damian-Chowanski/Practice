public class Main {

    static int [][] multiplication = new int [10][10];

    public static void main(String[] args) {
        generate();
        print();
    }

    private static void print() {
        for (int[] ints : multiplication) {
            for (int j = 0; j < multiplication.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void generate() {
        for (int i = 0; i<multiplication.length; i++){
            for (int j=0; j< multiplication.length; j++){
                multiplication[i][j] = (i+1)*(j+1);
            }
        }
    }
}