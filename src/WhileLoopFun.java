public class WhileLoopFun {
    public WhileLoopFun() { }
    public void printDigits(int number) {
        String num = "" + number;
        int length = num.length();
        int count = 0;
        while (num.length() > count) {
            length--;
            System.out.println(num.substring(length, length + 1));
            count++;
        }
    }
    public int countLetter(String word, String letter) {
        int count = 0;
        int num = 0;
        int length = word.length();
        while (word.length() > count) {
            length--;
            count++;
            if (word.substring(length, length + 1).equals(letter)) {
                num += 1;
            }
        }
        return num;
    }
    public int maxDoubles(int number, int threshold) {
        int count = 0;
        int doubleNum = 2 * number;
        while (threshold >= doubleNum) {
            doubleNum *= 2;
            count++;
        }
        return count;
    }
    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int count = 0;
        int num = 1;
        while (number > num) {
            if (number % num == 0) {
                count++;
            }
            num++;
        }
        return (count <= 1);
    }
}