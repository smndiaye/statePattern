package com.runner;

import java.util.List;


public class doAction {
 doAction(List<String> words, int speed, int count) throws Exception{
	    System.out.println(words.get(0));
		int counter = 0;
		double t = (double)6 / speed * 1000;
		while (System.in.available() == 0) {
			counter++;
			System.out.print(words.get(1)+ " ");
			Thread.sleep((long)t);		
			if(counter == count){				
				System.out.println(words.get(2)+ " ");
				counter = 0;
			}
		}
		System.out.println("---終了---");
 }
}
