//Q. Given the sorted rotated array nums that may contain duplicates, return the minimum element of this array.

public class RotatedSortedArray {
        public int findMin(int[] a) {
            for(int i=0;i<a.length-1;i++){
                if(a[i]>a[i+1]){
                    return a[i+1];
                }
            }
            return a[0];
        }
}
