package com.acciojob.firstapiproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class CollectionsClass {

    public static void main(String[] args) {





        List<Integer> list = new LinkedList<>();

        List<String> names = new ArrayList<>();

        List<Person> personList = new ArrayList<>();


        Collections.reverse(list);

        list.add(1);
        list.add(2);
        list.add(3);

        ListIterator<Integer> li = list.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }




        //For each loop
        for(Integer no:list){
            System.out.println("The no is {}"+no);

        }


        list.get(1);

        list.remove(1);


        //Lot of code is there









        ArrayList<Integer> arrayList = new ArrayList<>();


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();


        HashSet<Integer> hashSet = new HashSet<>();

        arrayList.add(1);

        priorityQueue.add(1);


        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.remove(1);

        hashSet.add(1);

        arrayList.remove(1);
        priorityQueue.remove(1);
        hashSet.remove(1);


    }
}

class Person{

    int age;
    String name;
}
