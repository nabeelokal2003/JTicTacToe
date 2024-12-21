import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class  TicTacToeView extends JFrame {
    JButton resetButton;
    private char mark = ' ';
    TicTacToeView(){
        this.setTitle("Tic Tac Toe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(700, 700);
        this.setResizable(true);
        this.setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        JPanel buttonPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 3));
        buttonPanel.setLayout(new GridLayout(1, 1));

        for(int i = 0; i < 9; i++){
            JPanel cell = new JPanel();
            cell.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            mainPanel.add(cell);
            mainPanel.addMouseListener();
        }

        resetButton = new JButton("Reset");
        buttonPanel.add(resetButton);

        this.add(mainPanel);
        this.add(buttonPanel, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public JButton getResetButton(){
        return resetButton;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Call the parent class's paintComponent method
        g.setFont(new Font("Arial", Font.BOLD, 60)); // Set font size and style
        g.setColor(Color.BLACK); // Set color for the marks

        // Draw the mark (X or O)
        if (mark == 'X') {
            g.drawLine(20, 20, getWidth() - 20, getHeight() - 20); // Top-left to bottom-right
            g.drawLine(20, getHeight() - 20, getWidth() - 20, 20); // Bottom-left to top-right
        } else if (mark == 'O') {
            g.drawOval(20, 20, getWidth() - 40, getHeight() - 40); // Draw the circle
        }
    }

    public char getMark() {
        return mark;
    }

    public void setMark(char mark) {
        this.mark = mark;
        repaint();
    }
}