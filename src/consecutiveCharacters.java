public class consecutiveCharacters {
    public int maxPower(String s) {
        int max=Integer.MIN_VALUE;
        if(s.length()==1){
            return 1;
        }
        int c=1;
        for(int i=1;i<s.length();i++){

            if(s.charAt(i)==s.charAt(i-1)){
                c+=1;
            }
            else{
                c=1;
            }
            if(c>max){
                max=c;
            }
        }
        return max;
    }
}