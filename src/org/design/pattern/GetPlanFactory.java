package org.design.pattern;

public class GetPlanFactory {

	// use getPlan() method to get object of type plan
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("DomesticPlan")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("CommercialPlan")) {
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("InstitutationalPlan")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
