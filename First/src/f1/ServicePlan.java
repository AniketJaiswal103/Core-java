package assign2;

public enum ServicePlan {

	SILVER(1000),GOLD(2000),DAIMOND(500),PLATINUM(10000);

	private double plan;

	private ServicePlan(double plan)
	{
		this.plan=plan;
	}
	
	public double getPlan()
	{
		return plan;
	}
}
