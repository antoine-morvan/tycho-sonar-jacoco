package am.tychosonarjacoco.module1.tests;

import org.junit.Assert;
import org.junit.Test;

import am.tychosonarjacoco.module1.Module1ClassA;
import am.tychosonarjacoco.module1.Module1ClassB;

public class Module1Test {

	  @Test
	  public void testModule1A() {
		  final String expected = "1A";
		  final String name = new Module1ClassA().getName();
		  Assert.assertEquals(expected, name);
	  }
	  @Test
	  public void testModule1B() {
		  final String expected = "1B";
		  final String name = new Module1ClassB().getName();
		  Assert.assertEquals(expected, name);
	  }
}
