package com.epam.oops_task;
import java.util.TreeMap;

public class Chocolate {
		public void sortChocolates(TreeMap<Integer,String> t){
			for(int it: t.keySet()){
				System.out.println(t.get(it)+" ");
			}
		}
		public void getChocolatesInRange(int l,int h,TreeMap<Integer,String> t){
			System.out.println("Candies in range Rs"+l+"and Rs"+h);
			for(int i:t.keySet()){
				if(i>=l && i<=h){
					System.out.println(t.get(i)+" ");
				}
			}
			System.out.println();
		}

}
