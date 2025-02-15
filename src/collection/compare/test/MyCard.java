package collection.compare.test;

public class MyCard implements Comparable<MyCard>{

    private int num;
    private String shape;

    public MyCard(int num, String shape) {
        this.num = num;
        this.shape = shape;
    }

    public int getNum() {
        return num;
    }

    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return num + "(" + shape + ")";
    }

    @Override
    public int compareTo(MyCard o) {
        return Integer.compare(this.num, o.num);
    }
}
