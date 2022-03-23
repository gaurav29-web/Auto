package com.Util;

public class APIStatistics {
	public static int API_HIT_Count=0;
	public static int API_TEST_SCENARIOS= 0;
	public static String API_TAG_NAME="@APITest";
	public static String NONE_API_TAG_NAME="@NoneAPITest";
	public static int NO_API_CALL_SCENARIO_COUNT= 0;
	public static final int API_MISMATCH_THRESHOLD= 5;
	
	public static boolean DoesAPICallsMatchScenariosCount(){
		return API_HIT_Count>=API_TEST_SCENARIOS;
	}
	
	public static int GetMismatchCount(){
		return API_TEST_SCENARIOS-API_HIT_Count;
	}
	
	public static boolean IsNewlyIdentifiedScenario(){
		return ((GetMismatchCount()-NO_API_CALL_SCENARIO_COUNT)>1)||(GetMismatchCount()==1&&(NO_API_CALL_SCENARIO_COUNT==0));
	}
}
