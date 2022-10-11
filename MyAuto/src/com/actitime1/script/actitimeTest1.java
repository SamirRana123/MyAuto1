package com.actitime1.script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.Generic.BaseCase1;
//@Listeners(com.actitime.Generic.ListenerImplemtation.class)
public class actitimeTest1 extends BaseCase1{
	@Test
	public void test1()
	{
		Reporter.log("hi",true);
		Assert.fail();
	}

	
}
