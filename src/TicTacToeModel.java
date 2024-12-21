import java.util.*;

public class TicTacToeModel {
    ArrayList<Character> game_board = new ArrayList<Character>(9);

    TicTacToeModel(){
        resetBoard();
    }

    public void resetBoard(){
        game_board.clear();
    }

    public void makeMove(int pos, char mark){
        game_board.set(pos, mark);
    }

    public char checkWinner(ArrayList<Character> game_board){

        // Checking rows  
        for(int row = 0; row < 3; row++){
            if(game_board.get(row * 3) != ' ' &&
                    game_board.get(row * 3) == game_board.get(row * 3 + 1) &&
                    game_board.get(row * 3 + 1) == game_board.get(row * 3 + 2)) {
                return game_board.get(row * 3);
            }
        }

        // Checking columns  
        for(int col = 0; col < 3; col++){
            if(game_board.get(col * 3) != ' ' &&
                    game_board.get(col) == game_board.get(col + 3) &&
                    game_board.get(col + 3) == game_board.get(col + 6)){
                return game_board.get(col);
            }
        }

        if(game_board.get(0) != ' ' &&
                game_board.get(0) == game_board.get(4) &&
                game_board.get(4) == game_board.get(8)){
            return game_board.get(0);
        }

        if(game_board.get(2) != ' ' &&
                game_board.get(2) == game_board.get(4) &&
                game_board.get(4) == game_board.get(6)){
            return game_board.get(2);
        }

        if(game_board.contains(' ')){
            return 'D';
        }

        return ' ';
    }

    public boolean isBoardFull(){
        return game_board.size() == 9;
    }
}