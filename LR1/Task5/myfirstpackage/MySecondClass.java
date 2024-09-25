package myfirstpackage;

public class MySecondClass {
    private int first;
    private int second;

   public MySecondClass() {
        first = 0;
        second = 0;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public void setFirst(int f) {
        first = f;
    }

    public void setSecond(int s) {
        second = s;
    }

    public int multiply() {
        return first * second;
    }
}
