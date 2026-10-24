package homework6;

public class CharArrayUtil {

    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };
        //Խնդիր 1 — Տպել բոլոր սիմվոլները
        for (int i = 0; i > chars.length; i++) {

        }
        System.out.println(chars);

        // Խնդիր 2 — Հաշվել սիմվոլների քանակը
        int count = chars.length;
        System.out.println("Characters count: " + count);
        if (count > 0) {
            System.out.println("First character: " + chars[0]);
            System.out.println("Last character: " + chars[chars.length - 1]);
        }
        //Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը
        char c = 'a';
        int count3 = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count3++;
            }
        }
        System.out.println("Character 'a' count: " + count3);
        //Խնդիր 4 — Հաշվել ձայնավորների քանակը
        int vowlesCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ||
                    chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U')
                vowlesCount++;
        }
        System.out.println("Vowles count: " + vowlesCount);
        //Խնդիր 5 — Հաշվել բաղաձայնների քանակը
        int consonantsCount = 0;
        for (int i = 0; i < chars.length; i++) {
            char x = chars[i];
            if ((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {
                if (!(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ||
                        chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U'))
                    consonantsCount++;
            }
        }
        System.out.println("Consonants count: " + consonantsCount);
        //Խնդիր 6 — Հաշվել բացատների քանակը
        int spacesCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spacesCount++;
            }
        }
        System.out.println("Spacec count: " + spacesCount);

        //Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)
        int left = 0;
        int right = chars.length - 1;
        for (; left < right; left++, right--) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }
        System.out.print("Reserved array: ");
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
        //Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը
        char[] charss = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'};


        System.out.print("Uppercase: ");
        for (int i = 0; i < charss.length; i++) {
            char y = charss[i];
            if (y >= 'a' && y <= 'z') {
                y = (char) (y - 32);
            }
            System.out.print(y);
        }
        System.out.println();

        System.out.print("Lowercase: ");
        for (int i = 0; i < charss.length; i++) {
            char y = charss[i];
            if (y >= 'A' && y <= 'Z') {
                y = (char) (y + 32);
            }
            System.out.print(y);
        }
        System.out.println();

        //Խնդիր 9 — Փոխարինել տրված սիմվոլը
        char oldChar = 'a';
        char newChar = '*';
        for (int i = 0; i < charss.length; i++) {
            if (charss[i] == oldChar) {
                charss[i] = newChar;
            }
        }
        System.out.println("Expected array: ");
        System.out.println(charss);

        //Խնդիր 10 — Ստուգել Palindrome-ը
        char[] chars3 = {'l', 'e', 'v', 'e', 'l'};
        boolean isPalindrome = true;
        for (int i = 0; i < chars3.length / 2; i++) {
            if (chars3[i] != chars3[chars3.length - 1 - i]) ;
            isPalindrome = false;
            break;

        }
        System.out.println("Is palindrome: " + isPalindrome);

        //Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը
        char[] charsb = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int firstIndex = -1;
        for (int i = 0; i < charsb.length; i++) {
            if (charsb[i] == target) {
                firstIndex = i;
                break;
            }
        }
        System.out.println("First index: " + firstIndex);

        //Bonus 2 — Համեմատել երկու char զանգված
        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};
        boolean areEqual = true;
        if (first.length != second.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    areEqual = false;
                    break;
                }
            }
        }
        System.out.println("Arrays are equal: " + areEqual);
        //Bonus 3 — Հեռացնել կրկնվող սիմվոլները
        char[] chars4 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};
        System.out.print("Expected output: ");
        for (int i = 0; i < chars4.length; i++) {
            boolean Sequence = false;
            for (int j = 0; j < i; j++) {
                if (chars4[i] == chars4[j]) {
                    Sequence = true;
                    break;
                }
            }
            if (!Sequence) {
                System.out.print(chars4[i] + " ");
            }
        }
    }
}



