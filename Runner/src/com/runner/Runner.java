package com.runner;

public class Runner implements IRunnerState{
	private IRunnerState currentState;
	 
	public Runner(IRunnerState currentState){
		this.currentState = currentState;
	}

	public void run() throws Exception {
		this.currentState.run();		
	}
	
}
