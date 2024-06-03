package com.generics.Customer;

public enum ServicePlan {
	SILVER(1,1000), GOLD(2,2000), PLATINUM(3,10000), DAIMOND(4,5000);

	private int minPlanAmt;
	private int i;

	private ServicePlan(int minPlan, int i) {
		this.minPlanAmt = minPlan;
		this.i=i;
	}

	public String toString() {
		return name();
	}
	
	public int getMinPlan() {
		return minPlanAmt;
	}

	public void setMinPlan(int minPlan) {
		this.minPlanAmt = minPlan;
	}

}
