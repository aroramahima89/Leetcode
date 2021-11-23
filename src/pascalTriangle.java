import java.util.*;
public class pascalTriangle {
    List<Integer> a=new ArrayList<Integer>();
    private int[][] arr=new int[34][34];
    public List<Integer> getRow(int rowIndex) {
        for(int i=0;i<=rowIndex;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j]=1;
                }
                else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
                if(i==rowIndex){
                    a.add(arr[i][j]);
                }
            }
        }
        return a;
    }
}