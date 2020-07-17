package com.epam.oops_task;

import java.util.ArrayList;

public class Gift {
	public static ArrayList<Integer> w = new ArrayList<Integer>();
	public int getWeight(){
		int tw = 0;
		for(int i = 0;i<w.size();i++){
			tw+=w.get(i);
		}
		return tw;
	}

}