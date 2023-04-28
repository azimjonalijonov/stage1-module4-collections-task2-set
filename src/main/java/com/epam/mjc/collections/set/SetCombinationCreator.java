package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> strings = new HashSet<>();
        for (String str1 : firstSet) {
            if (secondSet.contains(str1) && !thirdSet.contains(str1)) {
                strings.add(str1);
            }
            for (String str3 : thirdSet) {
                if (!firstSet.contains(str3) && !secondSet.contains(str3)) {
                    strings.add(str3);
                }
            }
        }
        return strings;
    }
}
