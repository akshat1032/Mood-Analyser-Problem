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
	public String analyseMood() throws MoodAnalysisException {

		try {
			if (this.message.contains("SAD")) {
				return "SAD";
			}
		else 
			return  "HAPPY";
		}
		catch(NullPointerException e) {
			throw new MoodAnalysisException("Please enter valid mood");
		}
	}
	
	public static void main(String[] args) {
		
		//Welcome message added
		System.out.println("Welcome to Mood Analyser Problem");
	}
}
