package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Tsukareta implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---��ꂽ---");
		listofWords.add("���[�₾");
		listofWords.add("�o�i�i");
		int speed = 3;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
