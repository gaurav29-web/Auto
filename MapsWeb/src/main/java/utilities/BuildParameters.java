package utilities;

public class BuildParameters {
	public static String BASE_ENV="Tst1";
	private static String _reportName="last_report.html";
	private static String _baseENV="env";
	private static String _testTags="cucumber.options";
	public static String GetBaseENV(){
		String env = System.getProperty(_baseENV);
		if(null!=env && !env.isEmpty()){
			BASE_ENV=env;
			return BASE_ENV;
		}
		return BASE_ENV;
	}
}
