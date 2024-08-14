package Collections_Work1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {
	
	/*
	 *  ArrayDeque implements Dequeue interface and it is not purely implemented class of Queue
	 *  
	 *  Default  size - 17
	 *  
	 *  Deletion,insertion takes place at head   and  insertion,deletion takes place at tail side
	 *  
	 *  It maintains insertion order not sorted order
	 *  
	 */

	public static void main(String[] args) {
		
		//Queue<Integer> pq = new ArrayDeque<>();
		//or
		Deque<Integer> pq = new ArrayDeque<>();
		
		pq.add(1);
		pq.offerFirst(2);
		pq.offerLast(3);
		pq.addFirst(4);
		
		System.out.println(pq);
		
		//Retrieval of elements
		System.out.println(pq.peek());
		System.out.println(pq.peekFirst());
		System.out.println(pq.peekLast());
		
		// Removal of elements
		
		System.out.println(pq.pollFirst());
		System.out.println(pq.pollLast());
		System.out.println(pq);
		System.out.println("Size is : "+pq.size());
		
		

	}
	    //Addition- add, offer, offerFirst,offerLast,addFirst,addLast
		//retrieval- peek,peekFirst,peekLast
		//removal-poll(null),pollFirst,pollLast,remove(Exception),removeFirst,removeLast

}
