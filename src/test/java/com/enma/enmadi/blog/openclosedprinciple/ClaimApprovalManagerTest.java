package com.enma.enmadi.blog.openclosedprinciple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClaimApprovalManagerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testProcessClaim() throws Exception{
		
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		
		ClaimApprovalManager claim1 = new ClaimApprovalManager();
		claim1.processClaim(healthInsuranceSurveyor);
		
		VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager claim2 = new ClaimApprovalManager();
		claim2.processClaim(vehicleInsuranceSurveyor);

	}

}
