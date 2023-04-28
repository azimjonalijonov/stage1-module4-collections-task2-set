package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        int temp = 0;
        for (int i = 0; i < sourceList.size(); i++) {
            temp = sourceList.get(i);
            if (isEven(temp)) {
                result.add(temp);
                while (isEven(temp)) {
                    temp /= 2;
                    result.add(temp);
                }
            } else {
                result.add(temp);
                result.add(temp * 2);
            }
        }
        return result;
    }

    private boolean isEven(int temp) {
        return temp % 2 == 0;
    }
}
