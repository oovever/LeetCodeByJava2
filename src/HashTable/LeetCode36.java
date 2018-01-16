package HashTable;

import java.util.HashSet;

/**
 * @author OovEver
 * 2018/1/16 21:27
 */
public class LeetCode36 {
    public static boolean isValidSudoku(char[][] board) {
      for(int i=0;i<9;i++) {
          HashSet<Character> rows    = new HashSet<Character>();
          HashSet<Character> columns = new HashSet<Character>();
          HashSet<Character> cube    = new HashSet<Character>();
          for(int j=0;j<9;j++) {
              if (board[i][j] != '.' && !rows.add(board[i][j])) {
                  return false;
              }
              if (board[j][i] != '.' && !columns.add(board[j][i])) {
                  return false;
              }
              int rowIndex = 3 * (i / 3);
              int colIndex = 3 * (i % 3);
              if (board[rowIndex + j / 3][colIndex + j % 3] != '.' && !cube.add(board[rowIndex + j / 3][colIndex + j % 3])) {
                  return false;
              }
          }
      }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'.', '8', '7', '6', '5', '4', '3', '2', '1'}, {'2', '.', '.', '.', '.', '.', '.', '.', '.'}, {'3', '.', '.', '.', '.', '.', '.', '.', '.'}, {'4', '.', '.', '.', '.', '.', '.', '.', '.'}, {'5', '.', '.', '.', '.', '.', '.', '.', '.'}, {'6', '.', '.', '.', '.', '.', '.', '.', '.'}, {'7', '.', '.', '.', '.', '.', '.', '.', '.'}, {'8', '.', '.', '.', '.', '.', '.', '.', '.'}, {'9', '.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(isValidSudoku(board));


    }
}
