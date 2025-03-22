package testjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DemoUtilsTest.class,ParamTest.class})
public class MyTestSuite {

}
