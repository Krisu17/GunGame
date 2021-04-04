package pw.edu.pl.gungame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class ReaderTest {

    public ReaderTest() {
    }

    @Test
    public void testTrimLine() {
        System.out.println("trimLine");
        Scanner inputScanner = null;
        Board board = new Board();
        File file = new File("src/resources/testFile.txt");
        Reader reader = new Reader(board.inserter, file, inputScanner, board);

        try {
            inputScanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Nie znaleziono pliku testowanego!");
            fail();
        }
        String first = reader.trimLine(inputScanner);
        String second = reader.trimLine(inputScanner);
        String third = reader.trimLine(inputScanner);
        String fourth = reader.trimLine(inputScanner);
        boolean successFlag = true;

        if (!first.equals("Na gorze roze,") || !second.equals("Na dole papryka,")
                || !third.equals("Testuje Readera") || !fourth.equals("kropka")) {
            successFlag = false;
        }
        assertTrue(successFlag);
    }

}
