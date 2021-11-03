public class TestWithThrow {
    public static void main(String[] args) throws IllegalAccessException {

        System.out.println(getAreaValue(-1,100));

    }
    public static int getAreaValue (int x, int y) throws IllegalAccessException {
        if (x < 0 || y < 0) throw new IllegalAccessException("value of 'x' or 'y' is negative");
        return x*y;
    }
}

