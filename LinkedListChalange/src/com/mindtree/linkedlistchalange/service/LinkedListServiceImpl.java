package com.mindtree.linkedlistchalange.service;

import java.util.LinkedList;
import java.util.List;

import com.mindtree.linkedlistchalange.exception.elementIsAlreadyExist;
import com.mindtree.linkedlistchalange.exception.indexIsNotPresent;

public class LinkedListServiceImpl implements LinkedListService {
	List <String> linkedlist=new LinkedList<String>();
	public void add(String Name)throws elementIsAlreadyExist {
		int count=0;
		for (String string : linkedlist) {
			if(string.compareToIgnoreCase(Name)==0) {
				count++;
			}
		}
		if(count==0) {
			linkedlist.add(Name);
		}
		else {
			throw new elementIsAlreadyExist("Element is already present");
		}
	}
	public void itrateAll() {
		for (String string : linkedlist) {
			System.out.println(string);
		}
	}
	public void startSpecific(int number)throws indexIsNotPresent {
		if(0>number||number>linkedlist.size()) {
			throw new indexIsNotPresent("Index is not present");
		}
		for(int i=number;i<linkedlist.size();i++) {
		System.out.println(linkedlist.get(i));
		}
	}
	public void reverceall() {
		for(int i=linkedlist.size()-1;i>=0;i--) {
			System.out.println(linkedlist.get(i));
		}
	}
	public void addAtSpecific(int index,String element)throws indexIsNotPresent {
		if(0>index||index>linkedlist.size()) {
			throw new indexIsNotPresent("Index is not present");
		}
		linkedlist.add(index, element);
	}
}
