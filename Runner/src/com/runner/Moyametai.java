package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Moyametai implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---�����~�߂���---");
		listofWords.add("�݂�Ȏ���");
		listofWords.add("�Q��");
		int speed = 1;
		int count = 3;
		new doAction(listofWords, speed, count);
	}
}
