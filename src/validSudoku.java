import java.util.*;
public class validSudoku {
    public boolean isValidSudoku(char[][] board) {
        ArrayList<String> a=new ArrayList<String>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    String row="row"+board[i][j]+(i+1);
                    String col="col"+board[i][j]+(j+1);
                    String box="box"+board[i][j]+(((i/3)*3)+(j/3));
                    if(!a.contains(row)){
                        a.add(row);
                    }
                    else{
                        return false;
                    }
                    if(!a.contains(col)){
                        a.add(col);
                    }
                    else{
                        return false;
                    }
                    if(!a.contains(box)){
                        a.add(box);
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}