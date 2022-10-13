
public class parkingSpot {
	private parkinngSpotType type;
	private vehicle vehicle;
	private static Boolean Free;
	
	public parkingSpot(parkinngSpotType ParkinngSpotType)
	{
		this.type=ParkinngSpotType;
	}
	
	//creating getters and setters
	public parkinngSpotType getType() {
		return type;
	}
	public void setType(parkinngSpotType type) {
		this.type = type;
	}
	public vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Boolean getFree() {
		return Free;
	}
	public static void setFree(Boolean free) {
		Free = free;
	}
	
	
	

}
