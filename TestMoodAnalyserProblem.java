package com.capgemini.TestMoodAnalyserProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.moodanalyserproblem.MoodAnalyserProblem;

public class TestMoodAnalyserProblem {
	
	@Test
	public void testAnanlyseMood() {
		
		MoodAnalyserProblem moodObject = new MoodAnalyserProblem();
		
		//Test Case 1.1
		String expectedResultSad = "SAD";
		String actualResultSad = moodObject.analyseMood("I am in SAD Mood");
		assertEquals(expectedResultSad, actualResultSad);
		
		//Test Case 1.2
		String expectedResultHappy = "HAPPY";
		String actualResultHappy = moodObject.analyseMood("I am in Any Mood");
		assertEquals(expectedResultHappy, actualResultHappy);
	}
}
