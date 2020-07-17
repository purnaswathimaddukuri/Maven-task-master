package com.epam.oops_task;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class main extends Gift
{
    public static void main( String[] args )
    {
    	TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
    	Scanner s = new Scanner(System.in);
    	System.out.println("Enter number of chocolates: ");
    	int no_of_chocolates = s.nextInt();
    	for(int i = 0 ;i<no_of_chocolates;i++){
    		System.out.println("Enter chocolate type 0/1: ");
    		int chocolate_type = s.nextInt();
    		System.out.println("Enter chocolate weight: ");
    		int chocolate_weight = s.nextInt();
    		System.out.println("Enter chocolate price: ");
    		int chocolate_price = s.nextInt();
    		String candyname = null;
    		if(chocolate_type == 1){
    			System.out.println("Enter candy name: ");
    			candyname = s.next();
    			tm.put(chocolate_weight, candyname);
    			w.add(chocolate_weight);
    		}
    	}
    	Sweet s1 = new Sweet(10,20);
    	Sweet s2 = new Sweet(20,30);
    	Sweet s3 = new Sweet(30,40);
    	Gift g = new Gift();
    	System.out.println("Total Weight = "+g.getWeight());
    	System.out.println("Sorting Chocolates based on weight: ");
    	Chocolate ch = new Chocolate();
    	ch.sortChocolates(tm);
    	System.out.println("Enter lower and upper limits  : ");
    	int ll = s.nextInt();
    	int ul = s.nextInt();
    	ch.getChocolatesInRange(ll, ul, tm);
    }
}
