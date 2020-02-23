package step_10;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // new way
        List<Integer> ints = Arrays.asList(1,2,3);
        int s = 0;
        for (int n: ints) { s+=n; }
        assert s == 6; // it throws an error if it is not correct

        // old way
        List integers = Arrays.asList(
                new Integer[] {
                        new Integer(1), new Integer(2), new Integer(3)
                }
        );
        int sum = 0;
        for ( Iterator it = integers.iterator(); it.hasNext(); ) {
            int n = ((Integer)it.next()).intValue();
            sum += n;
        }
        assert sum == 6;

        // before generics with arrays
        int[] ints1 = new int[] {1,2,3};
        int sum1 = 0;
        for (int i = 0; i < ints1.length; i++ ) { s += ints1[i]; }
        assert sum1 == 6;

    }
}
