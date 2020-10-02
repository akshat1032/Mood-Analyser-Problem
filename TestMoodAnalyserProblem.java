package com.capgemini.TestMoodAnalyserProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.moodanalyserproblem.MoodAnalyserProblem;

public class TestMoodAnalyserProblem {
	
	private MoodAnalyserProblem moodObject;
	@Test
	public void testAnanlyseMoodSad() {
		
		//Test Case 1.1 Sad mood
		moodObject = new MoodAnalyserProblem("I am in SAD Mood");
		String expectedResultSad = "SAD";
		String actualResultSad = moodObject.analyseMood();
		assertEquals(expectedResultSad, actualResultSad);
	}
	
	@Test
	public void testAnalyseMoodHappy() {
		
		//Test Case 1.2 Happy mood
		moodObject = new MoodAnalyserProblem("I am in Any Mood");
		String expectedResultHappy = "HAPPY";
		String actualResultHappy = moodObject.analyseMood();
		assertEquals(expectedResultHappy, actualResultHappy);
	}
}
