import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Class klass = new Class(25, "Word", arr);
        System.out.println(klass.getNum() + " " + klass.getWord() + " " + Arrays.toString(klass.getArrays()));
    }
}