public class hammingDistance {
    public int c=0;
    public int hammingDistance(int x, int y) {
        if(x==0 && y==0){
            return 0;
        }
        if((x&1)!=(y&1)){
            c++;
        }
        int q=hammingDistance(x>>1,y>>1);
        return c;
    }
}