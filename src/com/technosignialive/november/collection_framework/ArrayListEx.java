package com.technosignialive.november.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(50);
        list.add(60);
        list.add(33);

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            Integer no = itr.next();
            if (no % 2 != 0) {
                itr.remove();
            }
        }

    }
}



// Write a program to remove all duplicate elements from list
//