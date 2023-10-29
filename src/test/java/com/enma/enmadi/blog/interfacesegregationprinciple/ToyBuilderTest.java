package com.enma.enmadi.blog.interfacesegregationprinciple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToyBuilderTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBuildToyHouse() throws Exception{
		ToyHouse toyHouse = ToyBuilder.buildToyHouse();
		System.out.println(toyHouse);
	}

	@Test
	void testBuildToyCar() throws Exception{
		ToyCar toyCar = ToyBuilder.buildToyCar();
		System.out.println(toyCar);
	}

	@Test
	void testBuildToyPlane() throws Exception{
		ToyPlane toyPlane = ToyBuilder.buildToyPlane();
		System.out.println(toyPlane);
	}

}
