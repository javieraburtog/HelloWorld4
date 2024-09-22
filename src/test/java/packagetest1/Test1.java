package packagetest1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import package1.HelloWorld4;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public final void testMain() {
		
		String[] array1 = {"a", "b", "c", "d", "e"};
		HelloWorld4 hello = new HelloWorld4();
		hello.main(array1);
	}

}
