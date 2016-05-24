package numbers;

import arrays.Intersection;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;

public class IntersectionTest {

    @Test
    public void itShouldFindTheIntersection() {
        Intersection intersection = new Intersection();
        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2,2};

        int[] intersect = intersection.intersection(nums1, nums2);

        Assert.assertThat(intersect, equalTo(new int[]{2}));
    }
}
