package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new HashSet<>();
        int temp;
        for (Integer e : sourceList) {
            temp = e * e;
            if (lowerBound <= temp && upperBound >= temp) {
                set.add(temp);
            }
        }
        return set;
    }
}
