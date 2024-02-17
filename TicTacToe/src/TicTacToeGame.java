import Model.*;
import javafx.util.Pair;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board board;

    TicTacToeGame() {
        initializeGame();
    }

    public void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Player1", new PlayingPieceX());
        Player player2 = new Player("Player2", new PlayingPieceO());
        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        Scanner scanner = new Scanner(System.in);
        while (noWinner) {
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.print("Player: "+playerTurn.getName() + ". Enter row and column: ");
            String input = scanner.nextLine();
            String[] values = input.split(",");
            int row = Integer.valueOf(values[0].replace(" ", ""));
            int col = Integer.valueOf(values[1].replace(" ", ""));

            boolean isInserted = board.addPiece(row, col, playerTurn.getPlayingPiece());
            if (!isInserted) {
                System.out.println("Incorrect position chosen, try again!");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);
            boolean winner = isThereWinner(row, col, playerTurn.getPlayingPiece().type);
            if(winner) {
                return playerTurn.getName();
            }
        }
        return "tie";
    }

    private boolean isThereWinner(int row, int column, PieceType pieceType) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean digMatch = true;
        boolean antiDigMatch = true;
        // Column Match
        for (int i=0; i < board.size;i++) {
            if (board.board[row][i] == null || board.board[row][i].type != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // Row Match
        for (int i=0; i < board.size;i++) {
            if (board.board[i][column] == null || board.board[i][column].type != pieceType) {
                colMatch = false;
                break;
            }
        }

        // Diagonal Match
        for (int i=0; i < board.size;i++) {
            if (board.board[i][i] == null || board.board[i][i].type != pieceType) {
                digMatch = false;
                break;
            }
        }

        // AntiDiagonal Match
        for (int i=0; i < board.size;i++) {
            if (board.board[board.size-1-i][i] == null || board.board[board.size-1-i][i].type != pieceType) {
                antiDigMatch = false;
                break;
            }
        }
        return rowMatch || colMatch || digMatch || antiDigMatch;
    }
}
