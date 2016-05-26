package arrays;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MajorityElement {

    /*
        Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

        You may assume that the array is non-empty and the majority element always exist in the array.
     */
    public int majorityElement(int[] nums) {
        int midpoint = nums.length / 2;

        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(s -> s))
                .entrySet()
                .stream()
                .filter(x -> x.getValue().size() > midpoint)
                .map(Map.Entry::getKey)
                .mapToInt(i -> i)
                .sum();
    }
}
