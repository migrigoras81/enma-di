package com.enma.enmadi.blog.dependencyinversionprinciple.highlevel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.enma.enmadi.blog.dependencyinversionprinciple.lowlevel.Fan;
import com.enma.enmadi.blog.dependencyinversionprinciple.lowlevel.LightBulb;

class ElectricPowerSwitchTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPress() throws Exception{
//		fail("Not yet implemented");
		Switchable switchableBulb = new LightBulb();
		Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
		bulbPowerSwitch.press();
		bulbPowerSwitch.press();
		
		Switchable switchableFan = new Fan();
		Switch fanPoweSwitch = new ElectricPowerSwitch(switchableFan);
		fanPoweSwitch.press();
		fanPoweSwitch.press();
	}

}
