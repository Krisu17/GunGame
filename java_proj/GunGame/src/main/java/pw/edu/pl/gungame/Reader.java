package pw.edu.pl.gungame;

import java.io.File;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Reader {

    File in;
    Scanner inputScanner;
    Inserter inserter;
    Board board;

    public Reader(Inserter inserter, File in, Scanner inputScanner, Board board) {
        this.inserter = inserter;
        this.in = in;
        this.inputScanner = inputScanner;
        this.board = board;
    }

    public int readFile() {

        String inputString = trimLine(inputScanner);
        if (inputString == null || inputString.length() > 8) {
            return 1;
        }
        Board.playerLeft.playerName = inputString;

        inputString = trimLine(inputScanner);
        if (inputString == null || inputString.length() > 8) {
            return 2;
        }
        Board.playerRight.playerName = inputString;

        inputString = trimLine(inputScanner);
        if (inputString == null || parseInt(inputString) < -2147483645 || parseInt(inputString) > 2147483646) {
            return 3;
        }
        Board.playerLeft.playerPoints = parseInt(inputString);

        inputString = trimLine(inputScanner);
        if (inputString == null || parseInt(inputString) < -2147483645 || parseInt(inputString) > 2147483646) {
            return 4;
        }
        Board.playerRight.playerPoints = parseInt(inputString);

        inputString = trimLine(inputScanner);
        if (inputString == null || parseDouble(inputString) < 0 || parseDouble(inputString) > 100) {
            return 5;
        }
        inserter.speed = parseDouble(inputString);

        inputString = trimLine(inputScanner);
        if (inputString == null || parseInt(inputString) < 1 || parseInt(inputString) > 2147483646) {
            return 6;
        }
        Board.threshold = parseInt(inputString);

        inputString = trimLine(inputScanner);
        if (inputString == null || parseDouble(inputString) < 0 || parseDouble(inputString) > Math.PI) {
            return 7;
        }
        Board.playerLeft.maxGunAngle = parseDouble(inputString);
        Board.playerRight.maxGunAngle = parseDouble(inputString);

        inputString = trimLine(inputScanner);
        if (inputString == null || parseInt(inputString) < 1 || parseInt(inputString) > 200) {
            return 8;
        }
        Board.setMaxWidth(parseInt(inputString));

        inputString = trimLine(inputScanner);
        if (inputString == null || parseInt(inputString) < 1 || parseInt(inputString) > 200) {
            return 9;
        }
        Board.setMaxHeight(parseInt(inputString));

        inputString = trimLine(inputScanner);
        if (inputString == null || parseInt(inputString) < 1 || parseInt(inputString) > 2147483646) {
            return 10;
        }
        Board.numberOfBlocks = parseInt(inputString);

        Board.blockColors = new int[Board.numberOfBlocks][3];
        Board.blockPoints = new int[Board.numberOfBlocks][1];

        for (int i = 0; i < Board.numberOfBlocks; i++) {
            inputString = trimLine(inputScanner);
            if (inputString == null || parseInt(inputString) < 1 || parseInt(inputString) > 2147483646) {
                return 11;
            }
            Board.blockPoints[i][0] = parseInt(inputString);
        }

        for (int i = 0; i < Board.numberOfBlocks; i++) {
            inputString = trimLine(inputScanner);
            if (inputString == null || parseInt(inputString) < 0 || parseInt(inputString) > 255) {
                System.out.println("Zle w pierwszym");
                return 11;
            }
            Board.blockColors[i][0] = parseInt(inputString);

            inputString = trimLine(inputScanner);
            if (inputString == null || parseInt(inputString) < 0 || parseInt(inputString) > 255) {
                System.out.println("Zle w 2");
                return 11;
            }
            Board.blockColors[i][1] = parseInt(inputString);

            inputString = trimLine(inputScanner);
            if (inputString == null || parseInt(inputString) < 0 || parseInt(inputString) > 255) {
                System.out.println("zle w 3 w iteracji " + i);
                return 11;
            }
            Board.blockColors[i][2] = parseInt(inputString);
        }

        return 0;

    }

    protected String trimLine(Scanner inputScanner) {

        while (inputScanner.hasNext()) {
            String inputString = inputScanner.nextLine();
            inputString = inputString.trim();
            if (inputString.length() > 0) {
                char c1 = inputString.charAt(0);
                if (c1 == '/') {

                } else {
                    return inputString;
                }
            }
        }
        return null;
    }
}
