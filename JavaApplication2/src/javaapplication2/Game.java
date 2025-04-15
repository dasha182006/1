package javaapplication2;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.JPanel;
import java.awt.Graphics; // Import Graphics

public class Game extends JFrame {
    
    private static Game game_game;
    
    public static void main(String[] args) {
        game_game = new Game();
        game_game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game_game.setLocation(200, 50);
        game_game.setSize(900, 600);
        game_game.setResizable(false);
        GameField game_field = new GameField();
        game_game.add(game_field); // Add the GameField to the JFrame
        game_game.setVisible(true);
    }
    
    public static void onRepaint(Graphics g) {
        g.fillOval(10, 10, 200, 100);
    }
    
    public static class GameField extends JPanel {
        
        
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Call the superclass method
            onRepaint(g); // Corrected method name
        }
        
    }
}

