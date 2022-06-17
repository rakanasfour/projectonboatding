package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Mergek {
	
	

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		
		list1.add(8);
		list1.add(5);
		list1.add(7);
		
		list2.add(1);
		list2.add(3);
		list2.add(2);
		
		list3.add(6);
		list3.add(4);
		
		LinkedList[] lList = {list1, list2, list3};
		System.out.println("All the sorted lists: ");
		System.out.println(mergeLinkedLists(lList));
	}
	
	
	static LinkedList<Integer> mergeLinkedLists(LinkedList<Integer>[] array) {
		List<Integer> newList = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].size(); j++) {
				newList.add((int)array[i].get(j));
			}
		}
		Collections.sort(newList);
		LinkedList<Integer> newLink = new LinkedList<>();
		for(int i = 0; i < newList.size(); i++) {
			newLink.add(newList.get(i));
		}
		return newLink;
	}

}
