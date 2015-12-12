package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Tsukareta implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---疲れた---");
		listofWords.add("あーやだ");
		listofWords.add("バナナ");
		int speed = 3;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
