package com.runner;

import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class mainClass {
	public static void main(String args[]){
		
		char state;
		List <Character> listState = Arrays.asList('G', 'F', 'T', 'M');
    	System.out.println("ó‘Ô: G - F - T - M");
        System.out.println("’â~•û–@: Enter");
        while(true){
	        try{
		        state = new Scanner(System.in).next(".").charAt(0);
		    	state = Character.toUpperCase(state); 
		        if(!listState.contains(state)){
		        	System.out.println("ó‘Ô: G - F - T - M");
		        }else{
		        	Runner runner = new Runner(new Genki());
		        	switch (state){
		    		case 'G': runner = new Runner(new Genki());
		    				  break;
		    		case 'F': runner = new Runner(new Futsu());
		    		          break;
		    		case 'T': runner = new Runner(new Tsukareta());
		            		  break;
		    		case 'M': runner = new Runner(new Moyametai());
		            		  break;
		    		}
		        	runner.run();
		        } 
	        }catch(Exception e){}
        }   
	}
}
