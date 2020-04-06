package testRunner;

import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:/Users/HP/Documents/Framework/Framework/src/test/java/features/CRMLoginPage.feature",
		glue= {"testcases"},
			monochrome=true,
			strict=true,
			dryRun=false,
			tags= {"~@Ignore"},
			plugin =
			{"pretty",
            "html:target/cucumber-reports/cucumber-pretty",
            "json:target/cucumber-reports/CucumberTestReport.json",
            "rerun:target/cucumber-reports/rerun.txt",
            "junit:target/junit_xml/cucumber.xml"
            }
		)

public class TestRunner {
//    private TestNGCucumberRunner testNGCucumberRunner;
// 
//    @BeforeClass(alwaysRun = true)
//    public void setUpClass() throws Exception {
//        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
//    }
// 
//    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
//    public void feature(CucumberFeatureWrapper cucumberFeature) {
//        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//    }
// 
//    @DataProvider
//    public Object[][] features() {
//        return testNGCucumberRunner.provideFeatures();
//    }
// 
//    @AfterClass(alwaysRun = true)
//    public void tearDownClass() throws Exception {
//        testNGCucumberRunner.finish();
//    }
}