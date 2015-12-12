package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Futsu  implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---•’Ê---");
		listofWords.add("‚¦‚Á‚Ù");
		listofWords.add("…");
		int speed = 6;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
