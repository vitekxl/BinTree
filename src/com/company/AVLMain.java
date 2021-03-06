package com.company;

import com.company.tools.ArrayGenerator;
import com.company.example.AVLTree;

import java.util.*;

public class AVLMain {
    /**
     * sorting using AVL-Tree
     */
    public static void main(String[] args) {

        AVLTree<Integer> a = new AVLTree<Integer>(Integer::compareTo);
        Integer[] nums = ArrayGenerator.nextArrayInteger(100, 500, -500);
        System.out.println("random arr:");
        System.out.println(Arrays.toString(nums));

        a.sort(nums);
        System.out.println("\nsorted arr:");
        System.out.println(Arrays.toString(nums));

    }
}
