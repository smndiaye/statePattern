package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Moyametai implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---もう止めたい---");
		listofWords.add("みんな死ね");
		listofWords.add("寝床");
		int speed = 1;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
