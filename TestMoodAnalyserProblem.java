package com.capgemini.TestMoodAnalyserProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.moodanalyserproblem.MoodAnalyserProblem;
import com.capgemini.moodanalyserproblem.MoodAnalysisException;

public class TestMoodAnalyserProblem {
	
	private MoodAnalyserProblem moodObject;
	private String mood;
	@Test
	public void testAnanlyseMoodSad() {
		
		//Test Case 1.1 Sad mood
		moodObject = new MoodAnalyserProblem("I am in SAD Mood");
		String expectedResultSad = "SAD";
		try {
			mood = moodObject.analyseMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedResultSad, mood);
	}
	
	@Test
	public void testAnalyseMoodHappy() {
		
		//Test Case 1.2 Happy mood
		moodObject = new MoodAnalyserProblem("I am in Any Mood");
		String expectedResultHappy = "HAPPY";
		try {
			mood = moodObject.analyseMood();
		} catch (MoodAnalysisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(expectedResultHappy, mood);
	}
	
	@Test
	public void testAnalyseMoodNull(){
		
		//Test Case 2.1 Null
		moodObject = new MoodAnalyserProblem(null);
		String expectedResultNull = "HAPPY";
		try {
		mood = moodObject.analyseMood();
		}
		catch(NullPointerException | MoodAnalysisException e) {
			e.printStackTrace();
		}
		assertEquals(expectedResultNull, mood);
	}
}
