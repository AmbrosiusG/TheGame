package launcher;

import character.Fighter;
import character.Warrior;
import gui.MainWindow;
import java.awt.Color;
import java.util.List;
import map.Map;
import map.Player;
import music.Music;

import javax.swing.SwingUtilities;

/**
 *
 * Programm startet hier
 * Kann, soll und darf nicht importiert werden
 * 
 */
public class Start {

    // Spielerarray
    public static Player[] players = new Player[2];
    
    // Spiel vorbei
    private static boolean gameend;

    
    public static void main(String[] args) {
        //Reihenfolge wichtig!

        //Init der Spieler + des Spielerarrays
        Player spieler1 = new Player("Spieler1", Color.cyan);
        Player spieler2 = new Player("Spieler2", Color.RED);
        players[0] = spieler1;
        players[1] = spieler2;
        
        // Erster Spieler fängt an
        spieler1.setAtTurn(true);
        
        Music m = new Music();
        m.playSound();
                
        // neuer Thread, wenn alles geladen ist
        Map map = new Map(50, 50);
        SwingUtilities.invokeLater(() -> new MainWindow(map));
        
        //Test der movement-Methode
        Warrior w = new Warrior("dfg",0,0);
        w.movementrange(w.getXPosition(), w.getYPosition(), map);
        
        for (int i = 0; i < w.getMovementrange().size(); i++) {
            System.out.println(w.getMovementrange().get(i)[0]+"  "+w.getMovementrange().get(i)[1]);
        }
        
    }
    
    public static Player[] getPlayers(){
        return players;
    }
}
