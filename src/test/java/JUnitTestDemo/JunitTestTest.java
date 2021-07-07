package JUnitTestDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitTestTest {

	private JunitTest obj;
	
	@Before
	public void setUp() throws Exception {
		obj=new JunitTest();
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
	}

	@Test
	public void testAdd() {
		int val=obj.add(9, 6);
		assert val>8:"Should be Greater than 8 buddy...";
	}

	@Test
	public void testSub() {
		int val=obj.sub(9, 6);
		assert val<4:"should be less than 4 buddy...";
	}

	@Test
	public void testMul() {
		int val=obj.mul(9, 6);
		assert val>30:"Shoukd be greater than 30 buddy...";
	}

	@Test
	public void testDiv() {
		int val=obj.div(6, 1);
		assert val>=6:"Should be greater than 6 buddy...";
	}

}
