package arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Intersection {

    /*
        Given two arrays, write a function to compute their intersection.
        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

        * Each element in the result must be unique.
        * The result can be in any order.
    */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = Arrays
                .stream(nums1)
                .boxed()
                .collect(Collectors.toSet());
        return Arrays
                .stream(nums2)
                .filter(set1::contains)
                .distinct()
                .toArray();
    }
}
