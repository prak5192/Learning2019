package com.LinkedList.SingleList;

public class DeleteAllKeyOccurane
{
	
	public static void main(String []args)
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(2, null);
		
		DeleteAllKeyOccurane obj = new  DeleteAllKeyOccurane();
		
		System.out.println("Before Deletion");
		obj.display(head);
		obj.deleteAllOccurances(head,2);
		
		System.out.println("\nAfter Deletion");
		obj.display(head);
		
	}
	
	void display(ListNode head)
	{
		if(head == null){
			return ;
		}
		System.out.print(head.data);
		display(head.next);
		
	}
	
	ListNode deleteAllOccurances(ListNode head, int x)
	{
		if(head == null)
		{
			return head;
		}
		head.next = deleteAllOccurances(head.next,x);
		display(head);
		System.out.println("");
		return head.data == x ? head.next:head;
	}
}