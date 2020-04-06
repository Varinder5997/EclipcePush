package com.mindtree.linkedlistchalange.service;

import com.mindtree.linkedlistchalange.exception.elementIsAlreadyExist;
import com.mindtree.linkedlistchalange.exception.indexIsNotPresent;

public interface LinkedListService {
	void add(String Name)throws elementIsAlreadyExist;
	void itrateAll() ;
	void startSpecific(int number)throws indexIsNotPresent;
	void reverceall() ;
	void addAtSpecific(int index,String element)throws indexIsNotPresent ;
}
