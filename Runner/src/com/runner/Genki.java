package com.runner;

import java.util.ArrayList;
import java.util.List;

public class Genki implements IRunnerState{
	public void run() throws Exception{
		List<String> listofWords = new ArrayList<String>();
		listofWords.add("---���C---");
		listofWords.add("�����Ђ�[");
		listofWords.add("��������ˁ[");
		int speed = 12;
		int count = 5;
		new doAction(listofWords, speed, count);
	}
}
