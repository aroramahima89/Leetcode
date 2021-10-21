
import java.util.*;
public class RandomizedSet {

        private ArrayList<Integer> a;

        public RandomizedSet() {
            a=new ArrayList<Integer>();
        }

        public boolean insert(int val) {
            if(a.contains(val)){
                return false;
            }
            a.add(val);
            return true;
        }

        public boolean remove(int val) {
            if(a.contains(val)){
                a.remove(new Integer(val));
                return true;
            }
            return false;
        }

        public int getRandom() {
            if(a.size()==1){
                return a.get(0);
            }
            double index=Math.random();
            index*=a.size();
            return a.get((int)index);
        }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

