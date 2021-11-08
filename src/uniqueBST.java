class uniqueBST{
    public int numTrees(int n) {
        int[] a=new int[n+1];
        a[0]=a[1]=1;
        for(int i=2;i<=n;i++){
            int j=i-1;
            int k=0;
            while(j>=0){
                a[i]+=a[j]*a[k];
                j--;
                k++;
            }
        }
        return a[n];
    }
}