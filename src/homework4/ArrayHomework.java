package homework4;

public class ArrayHomework {
    public static void main(String[] args) {
        //Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                count++;
            }
        }
        System.out.println("Count of 6: " + count);
        //Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int startIndex = 0;
        int endIndex = numbers.length - 1;
        while (startIndex < endIndex) {

            int tmp = numbers[endIndex];
            numbers[startIndex] = numbers[endIndex];
            numbers[endIndex] = tmp;
            startIndex++;
            endIndex--;
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը
        int[] j = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int g = 0;
        int y = 0;

        for (int i = 0; i < j.length; i++) {
            y = 0;
            for (int l = 0; l < i; l++) {
                if (j[i] == j[l]) {
                    y++;
                }
            }
            if (y == 0) {
                for (int l = i + 1; l < j.length; l++) {
                    if (j[i] == j[l]) {
                        g++;
                        break;
                    }
                }
            }
        }

        System.out.println("Repeated numbers count: " + g);

        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        {
            char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
            int vowelsCount = 0;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'ա' || chars[i] == 'ե' || chars[i] == 'է' || chars[i] == 'ը' || chars[i] == 'ի' || chars[i] == 'ո' || chars[i] == 'օ') {
                    vowelsCount++;
                }
            }
            System.out.print("Vowels count: " + vowelsCount);
            System.out.println();
        }
        //Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը
        int[] num = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int firstMax = num[0];
        int secondMax = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > firstMax) {
                secondMax = firstMax;
                firstMax = num[i];
            } else if (num[i] > secondMax && num[i] != firstMax) {
                secondMax = num[i];

            }
        }
        System.out.print("Second max " + secondMax);

    }
}

