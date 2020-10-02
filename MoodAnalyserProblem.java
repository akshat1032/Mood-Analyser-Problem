package com.capgemini.moodanalyserproblem;

public class MoodAnalyserProblem {
	
	//Analyze mood function
	public String analyseMood(String message) {
		
		String mood="";
		if (message.equals("I am in SAD Mood")) {
			mood = "SAD";
		} else if (message.equals("I am in Any Mood")) {
			mood = "HAPPY";
		}
		return mood;
	}
	
	public static void main(String[] args) {
		
		//Welcome message added
		System.out.println("Welcome to Mood Analyser Problem");
	}
}
