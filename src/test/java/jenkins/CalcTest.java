package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amit_test.jenkins.JenkinsCalc;

public class CalcTest {

	@Test
	public void addtest() {
		JenkinsCalc jc=new JenkinsCalc();
		assertEquals(10, jc.add(5, 5));
	}
	@Test
	public void subtracttest() {
		JenkinsCalc jc=new JenkinsCalc();
		assertEquals(3, jc.subtract(5, 2));
	}

}
