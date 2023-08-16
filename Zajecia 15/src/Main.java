public class Main {
    static int[] numbers = {5, 14, 38, 34, 15, 7, -45, -25, 7, 34, 0, -31, -15, -2, 22, 42, -33, -36, 41, -31, 13, -4, -30, 28, -29, 35, 34, 18, 15, -16, -6, 48, -23, 0, -21, 49, -31, 1, 27, -5, -19, -6, -38, -6, 12, 29, 27, -49, -49, 48};

    public static void main(String[] args) {
        int qtyOfEvenPlus = evenPlus();
        int qtyOfOddMinus = oddMinus();

        System.out.println("parzyste dodatnie: " + qtyOfEvenPlus + "\n" +
                "Nieparzyste ujemne:" + qtyOfOddMinus);
    }
    private static int oddMinus() {
        int result = 0;
        for (int j : numbers) {
            if (j % 2 != 0 && j < 0) {
                result++;
            }
        }
        return result;
    }
    private static int evenPlus() {
        int result = 0;
        for (int j : numbers) {
            if (j % 2 == 0 && j > 0) {
                result++;
            }
        }
        return result;
    }
}