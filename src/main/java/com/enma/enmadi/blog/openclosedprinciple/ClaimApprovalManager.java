/**
 * 
 */
package com.enma.enmadi.blog.openclosedprinciple;

/**
 * 
 */
public class ClaimApprovalManager {
	
	public void processClaim(InsuranceSurveyor surveyor) {
		if(surveyor.isValidClaim()) {
			System.out.println("ClaimApprovalManager: Valid clain. Currently processing claim for approval....");
		}
	}

}
