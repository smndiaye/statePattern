package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Genki implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---元気---");
		listofWords.add("うっひょー");
		listofWords.add("何もいらねー");
		int speed = 12;
		int count = 5;
		new doAction(listofWords, speed, count);
	}
}
