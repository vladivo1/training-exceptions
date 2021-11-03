import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestTryCatchCatch {

    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println("Опп-а, файл не найден");
        } catch (IOException e) {
            System.out.println("IOEXCEOTION");
        }

    }
}
