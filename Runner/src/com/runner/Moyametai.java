package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Moyametai implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---Ç‡Ç§é~ÇﬂÇΩÇ¢---");
		listofWords.add("Ç›ÇÒÇ»éÄÇÀ");
		listofWords.add("êQè∞");
		int speed = 1;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
