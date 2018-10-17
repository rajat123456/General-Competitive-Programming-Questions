//Problem: https://leetcode.com/problems/kth-largest-element-in-an-array/
//Kth Largest Element in Array using Heaps

import java.util.*;
public class Solution {

	public static int kthLargest(int arr[], int k) {
      PriorityQueue<Integer>pq=new PriorityQueue<>();
          
      for(int q=0;q<k;q++)
      {
        pq.add(arr[q]);
      }
      
      for(int j=k;j<arr.length;j++)
      {
        if(arr[j]>=pq.peek())
        {
          pq.poll();
          pq.add(arr[j]);
        }
      }

      if(pq.size()<k)
        return -1;
      
      else
      return pq.poll();
	}
}
