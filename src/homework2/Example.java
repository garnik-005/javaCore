package homework2;

public class Example {
    public static void main(String[] args) {
        // Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        System.out.print("All elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Խնդիր 2 — Տպել առաջին էլեմենտը
        System.out.println("First element: " + numbers[0]);

        // Խնդիր 3 — Տպել վերջին էլեմենտը
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Խնդիր 4 — Տպել զանգվածի երկարությունը
        System.out.println("Array length: " + numbers.length);

        // Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);

        // Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        if (numbers.length <= 2) {
            System.out.println("Can't print middle values for small arrays.");
        } else {
            if (numbers.length % 2 != 0) {
                int mid = numbers.length / 2;
                System.out.println("Middle element: " + numbers[mid]);
            } else {
                int mid1 = (numbers.length / 2) - 1;
                int mid2 = numbers.length / 2;
                System.out.println("Middle elements: " + numbers[mid1] + " " + numbers[mid2]);
            }
        }

        // Խնդիր 7 — Հաշվել զույգ թվերի քանակը
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);

        // Խնդիր 8 — Հաշվել կենտ թվերի քանակը
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddCount);

        // Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        // Խնդիր 10 — Հաշվել միջին թվաբանականը
        double average = (double) sum / numbers.length;
        System.out.println("Average: " + average);

        // Bonus 1 — Մաքսիմում թիվ
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum: " + max);

        // Bonus 2 — Դրական, բացասական և զրո թվերի քանակը
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive number count: " + positiveCount);
        System.out.println("Negative number count: " + negativeCount);
        System.out.println("Zero number count: " + zeroCount);

        // Bonus 3 — Տպել հակառակ հերթականությամբ
        System.out.print("Reversed array: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
