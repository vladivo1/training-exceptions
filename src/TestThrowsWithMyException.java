import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class TestThrowsWithMyException {

    public static void main(String[] args) throws MyException {

        int result = 0;

        try {
            result = getAreaValue(-1,100);
        } catch (IllegalAccessException e) {
            Logger.getLogger(TestThrowsWithMyException.class.getName()).log(new LogRecord(Level.WARNING,"В " +
                    "метод вычисления площади был передан аргумент с негативным значением!"));
            throw new MyException(e);

        }

        System.out.println( "Result is : " + result);


    }
    public static int getAreaValue (int x, int y) throws IllegalAccessException {
        if (x < 0 || y < 0) throw new IllegalAccessException("value of 'x' or 'y' is negative");
        return x*y;
    }
}
