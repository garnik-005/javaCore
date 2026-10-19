package homework;

public class Zvaes {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int count = 0;
        int prevCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            prevCount = 0;
            for (int k = 0; k < i; k++) {
                if (numbers[i] == numbers[k]) {
                    prevCount++;
                }
            }

            if (prevCount == 0) {
                for (int k = i + 1; k < numbers.length; k++) {
                    if (numbers[i] == numbers[k]) {
                        count++;
                        break;
                    }
                }
            }
        }

        System.out.println("Repeated numbers count: " + count);



    }
}
