public class Main {

    static int [][] multiplication = new int [10][10];

    public static void main(String[] args) {
        generate();
        print();
    }

    private static void print() {
        for (int i=0; i< multiplication.length;i++){
            for (int j =0; j < multiplication.length; j++) {
                if(multiplication[i][j] < 10 || j==9 && multiplication[i][j]%10==0 && i!=9){
                    System.out.print(" ");
                }
                System.out.print(multiplication[i][j]+ " ");
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