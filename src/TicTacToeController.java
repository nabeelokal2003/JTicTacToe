import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToeController extends JPanel {
    TicTacToeModel model;
    TicTacToeView view;
    private char mark = ' ';

    TicTacToeController(TicTacToeModel model, TicTacToeView view) {
        this.model = model;
        this.view = view;

        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (mark == ' ') {
                    mark = 'X';
                    repaint();
                }
            }
        });
    }
}