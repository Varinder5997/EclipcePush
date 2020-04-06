package com.mindtree.linkedlistchalange.client;

import java.util.Scanner;

import com.mindtree.linkedlistchalange.exception.elementIsAlreadyExist;
import com.mindtree.linkedlistchalange.exception.indexIsNotPresent;
import com.mindtree.linkedlistchalange.service.LinkedListService;
import com.mindtree.linkedlistchalange.service.LinkedListServiceImpl;



public class LinkedListApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedListService linklist=new LinkedListServiceImpl();
		boolean flag=true;
		do {
			System.out.println("1. for add element");
			System.out.println("2. for itrate all element of linkedlist");
			System.out.println("3. for itrate all element of linkedlist from specific position");
			System.out.println("4. for itrate all element of linkedlist in reverce order");
			System.out.println("5. for add specific element at specific position");
			System.out.println("6. for exit");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the element ");
				sc.nextLine();
				String element=sc.nextLine();
				try {
					linklist.add(element);
				} catch (elementIsAlreadyExist e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				linklist.itrateAll();
				break;
				
			case 3:
				System.out.println("Enter the position of start");
				int position=sc.nextInt();
				try {
					linklist.startSpecific(position);
				} catch (indexIsNotPresent e) {
					System.err.println(e.getMessage());
					//e.printStackTrace();
				}
				break;
				
			case 4:
				linklist.reverceall();
				break;
				
			case 5:
				System.out.println("Enter the position");
				int index=sc.nextInt();
				System.out.println("Enter the element ");
				sc.nextLine();
				String element1 =sc.nextLine();
				try {
					linklist.addAtSpecific(index, element1);
				} catch (indexIsNotPresent e) {
					System.err.println(e.getMessage());
					//e.printStackTrace();
				}
				break;
			case 6:
				flag=false;
			default:
				System.out.println("Incorect Input");
				break;
			}
			
		} while (flag);


	}

}
