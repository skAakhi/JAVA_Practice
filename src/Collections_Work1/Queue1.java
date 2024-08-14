package Collections_Work1;

import java.util.*;

public class Queue1 {
	/*
	 * Priority queue [ It will give highest priority to lowest integer value]
	 * 
	 *  This is purely implemented class of Queue interface
	 *  
	 *  Internally which uses a array 
	 * 
	 * It doesnt follows Insertion order and sorted order 
	 * 
	 * default capacity - 11
	 * 
	 * Deletion takes place at head   and  insertion takes place at tail side
	 */

	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<>();
		// If i need a highest priority for highest integer then within object i have to define comparator according to my logic
		// so here int type is already defined , therefore i just have to be pass small instruction for my priority queue to print in a reverse order
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(100);
		pq.offer(20);
		pq.add(30);
		pq.offer(40);
		pq.add(50);
		pq.add(100);
//		
		//Retrieval of elements -poll() method will be used , which is used for to delete element in queue
		//To retrieve elements we preferring While loop instead of for each loop due to in-accuracy of values(means it retrieve elements is ordered manner)
		
		System.out.println(pq);
		
		//Follows accurate retrieval of elements
//		while(!pq.isEmpty())
//		{
//			System.out.println(pq.poll());
//		}
		
		//No accurate retrieval of elements
		/*for (Integer i : pq) {
			System.out.println(i);
			
		}*/
		
		// Deletion of elements can delete highest priority queue if we dont pass any object and it can also delete based on object in Queue 
		//pq.remove();
		//pq.poll();
		//pq.remove(100);
		//System.out.println(pq);
		
		//pq.clear();
		//System.out.println(pq);
		
		// verification 
		
//		System.out.println(pq.contains(30));
		
		//System.out.println(pq.peek());
		
		//System.out.println(pq.size());
		
		
	}
	//Addition- add offer
	//retrieval- peek
	//removal-poll(null),remove(Exception)

}
