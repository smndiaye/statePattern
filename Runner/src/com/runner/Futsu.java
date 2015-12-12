package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Futsu  implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---普通---");
		listofWords.add("えっほ");
		listofWords.add("水");
		int speed = 6;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
