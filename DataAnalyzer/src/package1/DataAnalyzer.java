package package1;

import java.util.LinkedList;

public class DataAnalyzer {
/**
 * Constructor for the DataAnalyzer class
 * @param numList gets copied into the newList linked list
 */
	public DataAnalyzer(LinkedList<Integer> numList) {
		
		LinkedList<Integer> newList = new LinkedList();
		for(int x: numList )
		{
			newList.add(x);
		}
	}
/**
 * ComputeMin goes through the linkedlist and finds the smallest value
 * @param list is the linked list that gets passed from the main
 * @return returns the smallest value in the linked list
 */
	public int computeMin(LinkedList<Integer> list) {

		int min= 0;
		try {
			if(list.size()==0)
			{
				throw new Exception (); 
			}
			min = list.getFirst();
			for (int i = 0; i < list.size(); i++) {
				if (min > list.get(i)) {
					min = list.get(i);
				}
			}
		}catch(Exception e){
			System.out.println("Empty list");
		}
		return min;
	}
/**
 * ComputeMax finds the biggest number from the list
 * @param list is the linked list that is being passed
 * @return returns the largest number 
 */
	public int computeMax(LinkedList<Integer> list) {

		int max= 0;
		try{
			if(list.size()== 0)
			{
				throw new Exception (); 
			}
			max = list.getFirst();
			for (int i = 0; i < list.size(); i++) {
				if (max < list.get(i)) {
					max = list.get(i);
				}
			}
		}catch(Exception e){System.out.println("Empty list");}
		
		return max;
	}
/**
 * computeAvg sums up all the numbers and divides it by total items
 * @param list is the linked list that is being passed
 * @return returns the average
 */
	public double computeAvg(LinkedList<Integer> list) {
		double sum = 0;
		try{
			if (list.size() ==0)
			{
				throw new Exception (); 
			}
			int total = list.size();

			for (int x : list) {
				sum = x + sum;
			}
			sum = sum / total;
		}catch(Exception e){
			System.out.println("Empty list");
		}
		return sum;
	}
}
