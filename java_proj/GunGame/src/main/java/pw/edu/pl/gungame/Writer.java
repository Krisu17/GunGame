
package pw.edu.pl.gungame;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {

    public Writer() {
    }

    
    public boolean writeFile(String path, Board board) throws FileNotFoundException {
        File out = new File(path);
        try {
            out.createNewFile();
        } catch (IOException ex) {
            System.out.println("Nie można stworzyć pliku.");
            return false;
        }
        
        PrintWriter writer = new PrintWriter(out);
        
        writer.println("//Domyslna nazwa pierwszego gracza");
        writer.println(board.playerLeft.playerName);
        writer.println();
        writer.println("//Domyslna nazwa drugiego gracza");
        writer.println(board.playerRight.playerName);
        writer.println();
        writer.println("//Poczatkowe punkty pierwszego gracza");
        writer.println(board.playerLeft.playerPoints);
        writer.println();
        writer.println("//Poczatkowe punkty drugiego gracza");
        writer.println(board.playerRight.playerPoints);
        writer.println();
        writer.println("//Poczatkowa predkosc spadania klockow");
        writer.println(board.getBlocks().get(board.getBlocks().size()-1).getDy());
        writer.println();
        writer.println("//Prog punktow, po ktorym zwieksza sie predkosc klockow");
        writer.println(board.threshold);
        writer.println();
        writer.println("//Maksymalny kat obrotu lufy");
        writer.println(board.playerLeft.maxGunAngle);
        writer.println();
        writer.println("//Maksymalna szerokosc bloku");
        writer.println(board.getMaxWidth());
        writer.println();
        writer.println("//Maksymalna wysokosc bloku");
        writer.println(board.getMaxHeight());
        writer.println();
        writer.println("//Ilosc typow klockow");
        writer.println(board.numberOfBlocks);
        writer.println();
        
        for (int i = 1; i < board.numberOfBlocks + 1; i++) {
             writer.println("//Punkty dla " + i + " klocka");
             writer.println(board.blockPoints[i-1][0]);
             writer.println();
        }
        writer.println("//Kolory klockow podawane w schemacie 1-sza linia = R,"
                + " 2-ga linia = G, 3-cia linia = B ");
        writer.println();
        for (int i = 1; i < board.numberOfBlocks + 1; i++) {
             writer.println("//Kolory RGB dla " + i + " klocka");
             writer.println(board.blockColors[i-1][0]);
             writer.println(board.blockColors[i-1][1]);
             writer.println(board.blockColors[i-1][2]);
             writer.println();
        }
        
        writer.close();
        return true;
        
    }
}
