package homework3;

public class ArrayUtil2 {
    public static void main(String[] args) {
        //Խնդիր 1 — Տպել զանգվածի բոլոր էլեմենտները
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();

        //Խնդիր 2 — Տպել առաջին էլեմենտը
        System.out.println("First element: " + numbers[0]);
        //Խնդիր 3 — Տպել վերջին էլեմենտը
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        //Խնդիր 4 — Տպել զանգվածի երկարությունը
        System.out.println("Array length: " + numbers.length);
        //Խնդիր 5 — Գտնել ամենափոքր թիվը
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);
        //Խնդիր 6 — Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
        if (numbers.length <= 2) System.out.println("Can't print middle values: ");
        if (numbers.length % 2 != 0) ;
        System.out.println("Middle element: " + numbers.length / 2);
        if (numbers.length % 2 == 0) ;
        int mid1 = (numbers.length / 2);
        int mid2 = (numbers.length / 2) - 1;
        System.out.println("Middle elements: " + numbers[mid1] + " " + numbers[mid2]);
        //Խնդիր 7 — Հաշվել զույգ թվերի քանակը
        int cout = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                cout++;

            }
        }
        System.out.println("Even numbers count: " + cout);
        //Խնդիր 8 — Հաշվել կենտ թվերի քանակը

        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("Odd numbers count: " + odd);
        //Խնդիր 9 — Հաշվել զանգվածի էլեմենտների գումարը
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        //Խնդիր 10 — Հաշվել միջին թվաբանականը
        {
            int sum2 = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum2 += numbers[i];
            }
            double average = (double) sum2 / numbers.length;
            System.out.println("Average: " + average);

        }
        //Bonus 1
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum " + max);
        //Bonus 2
        {
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
        }
        //Bonus 3
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");


        }
    }
}