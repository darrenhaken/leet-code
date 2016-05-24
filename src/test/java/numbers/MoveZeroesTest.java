package numbers;

import arrays.MoveZeroes;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {

    @Test
    public void itShouldMoveTheZeroesToTheEnd() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] testArray = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(testArray);

        assertArrayEquals(testArray, new int[]{1, 3, 12, 0, 0});
    }
}
