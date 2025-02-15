package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);

        System.out.println("hashCode('A') = " + hashCode("A"));
        System.out.println("hashCode('B') = " + hashCode("B"));
        System.out.println("hashCode('AB') = " + hashCode("AB"));

        System.out.println("hasIndex(A) = " + hasIndex(hashCode("A")));
        System.out.println("hasIndex(B) = " + hasIndex(hashCode("B")));
        System.out.println("hasIndex(AB) = " + hasIndex(hashCode("AB")));
    }

    static int hashCode(String str) {
        char[] CharArray = str.toCharArray();
        int sum =0;
        for (char c : CharArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hasIndex(int value) {
        return value % CAPACITY;
    }
}
