package main;

import br.ol.dq1.infra.Game;
import br.ol.dq1.infra.View;
import br.ol.dq1.test.TestGame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Main class.
 * 
 * @author Leonardo Ono (ono.leo@gmail.com)
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Working Directory = " +
                      System.getProperty("user.dir"));

        SwingUtilities.invokeLater(() -> {
            Game game = new TestGame();
            View view = new View();
            JFrame frame = new JFrame();
            frame.setTitle("Java Dragon Quest 1 / Test #1");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(view);
            frame.setResizable(false);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            view.requestFocus();
            view.start(game);
        });
    } 
    
} 
