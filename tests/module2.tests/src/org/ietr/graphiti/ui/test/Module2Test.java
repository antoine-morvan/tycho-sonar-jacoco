package org.ietr.graphiti.ui.test;

import org.junit.Assert;
import org.junit.Test;

import am.tychosonarjacoco.module2.Module2ClassA;
import am.tychosonarjacoco.module2.Module2ClassB;

public class Module2Test {

	  @Test
	  public void testModule2A() {
		  final String expected = "2A";
		  final String name = new Module2ClassA().getName();
		  Assert.assertEquals(expected, name);
	  }
	  @Test
	  public void testModule2B() {
		  final String expected = "2B";
		  final String name = new Module2ClassB().getName();
		  Assert.assertEquals(expected, name);
	  }
}
