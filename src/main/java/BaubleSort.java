/**
 * @author Arthur Zagretdinov
 * @date 23/02/16.
 */
public class BaubleSort {
    public void sort(int[] a) {
        int n = a.length;
        while (n > 0) {
            int newn = 0;
            for (int i = 1; i < n; i++) {
                if (a[i] < a[i - 1]) {
                    swap(a, i, i-1);
                    newn = i;
                }
            }
            n = newn;
        }
    }

    private void swap(int[] a, int from, int to) {
        int temp = a[from];
        a[from] = a[to];
        a[to] = temp;
    }
    

}
