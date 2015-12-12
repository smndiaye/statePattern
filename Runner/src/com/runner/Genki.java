package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Genki implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---å≥ãC---");
		listofWords.add("Ç§Ç¡Ç–ÇÂÅ[");
		listofWords.add("âΩÇ‡Ç¢ÇÁÇÀÅ[");
		int speed = 12;
		int count = 5;
		new doAction(listofWords, speed, count);
	}
}
