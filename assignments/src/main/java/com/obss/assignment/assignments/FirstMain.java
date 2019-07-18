package com.obss.assignment.assignments;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import sources.Third;

public class FirstMain {
	public static void main(String args[]) {
		Logger logger = Logger.getLogger(Third.class);
		BasicConfigurator.configure();
		try {
			Third third = new Third();
			third.run();
		} catch (Exception e) {
			logger.setLevel(Level.DEBUG);
			logger.debug(e.getCause(),e);
			// TODO: handle exception
		}
	}
}
