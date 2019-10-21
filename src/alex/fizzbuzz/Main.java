package alex.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder();
        boolean isFezz = false;
        for (int i = 1; i <= 200; i++) {
            if (i % 13 == 0) {
                word.append("Fezz ");
                isFezz = true;
            }
            if (i % 11 == 0) {
                if (word.length() > 0) {
                    word.append("Bong ");
                } else {
                    System.out.println("Bong ");
                    continue;
                }
            }
            if (i % 3 == 0) {
                word.append("Fizz ");
            }
            if (i % 5 == 0) {
                word.append("Buzz ");
            }
            if (i % 7 == 0) {
                word.append("Bang ");
            }

            if (isFezz && wordContainsCharB(word.toString()) > 0) {
                word.delete(0, 5);
                word.insert(wordContainsCharB(word.toString()), "Fezz ");
            }
            if (word.length() > 0) {
                System.out.println(word.toString());
            } else {
                System.out.println(i);
            }

            word.delete(0, word.length());
        }

    }

    private static int wordContainsCharB(String word) {
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(j) == 'B') {
                return j;
            }
        }
        return -1;
    }
}
