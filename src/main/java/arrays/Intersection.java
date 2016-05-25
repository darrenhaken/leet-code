package arrays;

import java.util.*;
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

    /*
        Given two arrays, write a function to compute their intersection.

        Example:
        Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

        Note:
        Each element in the result should appear as many times as it shows in both arrays.
        The result can be in any order.

        https://leetcode.com/problems/intersection-of-two-arrays-ii/
    */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for (int num : nums1) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num) + 1);
            }
        }

        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                l.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] result = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            result[i] = l.get(i);
        }
        return result;
    }
}
