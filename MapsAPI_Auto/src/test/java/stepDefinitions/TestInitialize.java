package stepDefinitions;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Util.APIStatistics;
import com.Util.RuntimeModeUtil;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;




public class TestInitialize {
	private static Logger _log = LogManager.getLogger(TestInitialize.class);
	private static Scenario _currentScenario =null;
	
	public void TestSetup(){
		LogUser();
	}
	
	@Before
	public void CountAPITags(Scenario sc){
		_currentScenario=sc;
		_log.info(String.format("Running scenario %s", sc.getName()));
		
		Collection<String> tags = sc.getSourceTagNames();
		if(tags!=null){
			if(tags.stream().anyMatch(APIStatistics.API_TAG_NAME::equalsIgnoreCase) && !tags.stream().anyMatch(APIStatistics.NONE_API_TAG_NAME::equalsIgnoreCase)){
				APIStatistics.API_TEST_SCENARIOS++;
			}
		}
	}
	
	@After
	public void TearDown(){
		if(APIStatistics.IsNewlyIdentifiedScenario()){
			_log.warn("This scenario is tagged as @API ");
			APIStatistics.NO_API_CALL_SCENARIO_COUNT++;
		}
	}
	
	private void LogUser(){
		_log.info(String.format("Running tests as %s", RuntimeModeUtil.GetDomainUser()));
	}
}
