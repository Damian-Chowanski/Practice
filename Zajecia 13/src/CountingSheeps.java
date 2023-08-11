public class CountingSheeps {


    public static void main(String[] args) {
        int quantity = 5;
        System.out.println(goToSleep(quantity));
    }

    private static String goToSleep(int quantity) {
        String result = "";
        for (int i = 1; i <= quantity; i++) {
            result += i + " sheep..., ";
        }
        return result;
    }
}
