
public class vehicle {
	private int VehicleNo;
	private VehicleType vehicleType;
	private LargeSpot ParkinngSpotType;
	
	
	//constructor for the vehicle to get the vechileType
	public vehicle(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}

	//getters and setters
	public int getVehicleNo() {
		return VehicleNo;
	}

	public void setVehicleNo(int vehicleNo) {
		VehicleNo = vehicleNo;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}


	public LargeSpot getParkinngSpotType() {
		return ParkinngSpotType;
	}


	public void setParkinngSpotType(LargeSpot largeSpot) {
		ParkinngSpotType = largeSpot;
	}

	public void setParkingSpot(CompactSpot compactSpot) {
		// TODO Auto-generated method stub
		
	}

	public void setParkingSpot(BikeSpot bikeSpot) {
		// TODO Auto-generated method stub
		
	}

	public String getVehicleType1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
