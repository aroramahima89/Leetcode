import java.util.*;
public class FirstUnique {
    public int firstUniqChar(String s) {
        ArrayList<Character> a=new ArrayList<Character>();
        ArrayList<Integer> b=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++){
            if(!a.contains(s.charAt(i))){
                a.add(s.charAt(i));
                b.add(1);
                //       System.out.println(b.get(i));
            }
            else{
                int x=a.indexOf(s.charAt(i));
                b.set(x,b.get(x)+1);
                //      System.out.println(b.get(x));
            }
        }
        for(int i=0;i<b.size();i++){
            if(b.get(i)==1){
                for(int j=0;j<s.length();j++){
                    if(s.charAt(j)==a.get(i)){
                        //       System.out.println(b.get(i));
                        return j;
                    }
                }
            }
        }
        return -1;
    }
}