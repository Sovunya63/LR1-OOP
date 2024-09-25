class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass();
        int i, j;
        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                o.setFirst(i);
                o.setSecond(j);
                System.out.print(o.multiply());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class MySecondClass {
    private int first;
    private int second;

    MySecondClass() {
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
