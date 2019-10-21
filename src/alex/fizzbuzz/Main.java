package alex.fizzbuzz;

public class Main {

    public static void main(String[] args) {
        StringBuilder word = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 11 == 0) {
                System.out.println("Bong");
                continue;
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

            if (word.length() > 0) {
                System.out.println(word.toString());
            } else {
                System.out.println(i);
            }
            word.delete(0, word.length());
        }

    }
}
