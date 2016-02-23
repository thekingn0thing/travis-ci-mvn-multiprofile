import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Arthur Zagretdinov
 * @date 23/02/16.
 */
public class ProjectTest {
    
    @Test
    public void sort_sorted_array() throws Exception {
        int[] array = {1, 2};
        new BaubleSort().sort(array);

        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
    }

    @Test
    public void sort_not_sorted_array() throws Exception {
        int[] array = {3, 2, 1};
        new BaubleSort().sort(array);

        assertEquals(array[0], 1);
        assertEquals(array[1], 2);
        assertEquals(array[2], 3);
    }
}
