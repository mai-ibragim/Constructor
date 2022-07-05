
import java.util.Arrays;

public class Class {
    private int num;
    private String word;
    private int[] arrays;

    public Class(int num, String word, int[] arrays) {
        this.num = num;
        this.word = word;
        this.arrays = arrays;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getArrays() {
        return arrays;
    }

    public void setArrays(int[] arrays) {
        this.arrays = arrays;
    }

    @Override
    public String toString() {
        return "Class{" +
                "num=" + num +
                ", word='" + word + '\'' +
                ", arrays=" + Arrays.toString(arrays) +
                '}';
    }
}
