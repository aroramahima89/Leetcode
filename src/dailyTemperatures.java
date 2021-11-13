class dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] a=new int[temperatures.length];
        a[a.length-1]=0;
        for(int i=a.length-2;i>=0;i--){
            if(temperatures[i]<temperatures[i+1]){
                a[i]=1;
            }
            else if(temperatures[i]>temperatures[i+1] && a[i+1]==0){
                a[i]=0;
            }
            else{
                for(int j=i+2;j<temperatures.length;j++){
                    if(temperatures[i]<temperatures[j]){
                        a[i]=j-i;
                        break;
                    }
                }
            }
        }
        return a;
    }
}