package repl;

import java.util.Arrays;

public class Repl_171_2D_Arrays_ChessBoard {
    public static void main(String[] args) {


//        Given a 8x8 two-dimensional array of strings named chessboard.
//         Initialize values inside an array accordingly to the chess board. So first element in the array,
//        chessboard[0][0] should have a value "1a", and last element in the array, chessboard[7][7] should have a value "8h".


        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE


        for (int i = 0; i <chessBoard.length ; i++) {

            for (int j = 0; j <chessBoard[i].length ; j++) {

                int y = 'a'+j;

                chessBoard[i][j]=(""+(i+1))+(Character.toString((char)+y));

            }

        }






        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));


    }
}
