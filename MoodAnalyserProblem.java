package com.capgemini.moodanalyserproblem;


public class MoodAnalyserProblem {
	
	//Instance variable
	private String message;
	
	//Default constructor
	public MoodAnalyserProblem() {
	}
	
	//Parameterized constructor for message field
	public MoodAnalyserProblem(String message) {
		this.message = message;
	}
	
	//Analyze mood function
	public String analyseMood() {
		String mood="";
		if (this.message.contains("SAD")) {
			mood = "SAD";
		} else {
			mood = "HAPPY";
		}
		return mood;
	}
	
	public static void main(String[] args) {
		
		//Welcome message added
		System.out.println("Welcome to Mood Analyser Problem");
	}
}
