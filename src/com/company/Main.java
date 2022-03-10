package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(List.of(1, 2, 3));
        Set<Integer> set1 = new HashSet<>(List.of(0, 1, 2));

        System.out.println(set);
        System.out.println(set1);
        System.out.println(diff(set, set1));
    }
        public static Set<Integer> diff(Set<Integer>set, Set<Integer>set1){
            Set<Integer> newSet = new HashSet<>(set);
            newSet.removeAll(set1);
            set1.removeAll(set);
            newSet.addAll(set1);
            return newSet;
    }
}
