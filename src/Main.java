public class Main {
    public static void main(String[] args) {
        int inputData = matchResult(1, 1, 2, 1);
        System.out.println(inputData);
    }

    public static int matchResult(int result1, int result2, int bet1, int bet2) {

        if (result1 == bet1 && result2 == bet2) {
            return 2;
        }
        if (result1 > result2 && bet1 > bet2) {
            return 1;
        } else if (result2 > result1 && bet2 > bet1) {
            return 1;
        } else if (result1 == result2 && bet1 == bet2) {
            return 1;

        } else {
            return 0;
        }
    }
}