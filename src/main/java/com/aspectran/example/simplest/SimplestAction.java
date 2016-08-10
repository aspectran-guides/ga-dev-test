package com.aspectran.example.simplest;

import com.aspectran.core.util.logging.Log;
import com.aspectran.core.util.logging.LogFactory;

public class SimplestAction {
	
	private final Log log = LogFactory.getLog(SimplestAction.class);

	public String helloWorld() {
		String msg = "Hello, World.";
		
		log.info("The message generated by my first aciton is: " + msg);

		return msg;
	}

}