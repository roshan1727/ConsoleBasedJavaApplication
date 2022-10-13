import java.util.ArrayList;

import java.util.List;

public class parkingLot {
	//consist of three list
	List<CompactSpot> compactSpotList=new ArrayList<>();
	List<LargeSpot> largeSpotList=new ArrayList<>();
	List<BikeSpot> bikeSpotList=new ArrayList<>();
	
	int FreeCompactSpot;
	int FreeBikeSpot;
	int FreeLargeSpot;
	public parkingLot(int freeCompactSpot, int freeBikeSpot, int FreelargeSpot) {
		this.FreeCompactSpot = freeCompactSpot;
		this.FreeBikeSpot = freeBikeSpot;
		this.FreeLargeSpot = FreelargeSpot;
	}
	
	//park vehicle
	public void parkVehicle(vehicle Vehicle) {
		System.out.println("GEt the Vehicle Detail to Park: "+Vehicle.getVehicleType());
		if(Vehicle.getVehicleType().equals(VehicleType.TRUCK))
		{
			if(FreeLargeSpot >0)
				parkingYourLargeVehicle(Vehicle);
			else
				System.out.println("Sorry the Spot is full");
		}
		if(Vehicle.getVehicleType().equals(VehicleType.CAR))
		{
			if(FreeCompactSpot >0)
				parkingYourBikeVehicle(Vehicle);
			else if(FreeLargeSpot>0)
				parkingYourCompactVehicle(Vehicle);
			else
				System.out.println("Sorry the Spot is full");
		}
		if(Vehicle.getVehicleType().equals(VehicleType.BIKE))
		{
			if(FreeBikeSpot >0)
				parkingYourBikeVehicle(Vehicle);
			else if(FreeCompactSpot>0)
				parkingYourCompactVehicle(Vehicle);
			else if(FreeLargeSpot > 0)
				parkingYourLargeVehicle(Vehicle);
			else
				System.out.println("Sorry the Spot is full");
		}
	}
	
	void parkingYourLargeVehicle(vehicle Vehicle)
	{
		LargeSpot largeSpot=new LargeSpot(parkinngSpotType.LARGE);
		parkingSpot.setFree(false);
		largeSpot.setVehicle(Vehicle);
		Vehicle.setParkinngSpotType(largeSpot);
		largeSpotList.add(largeSpot);
		System.out.println("We have successfully parked "+Vehicle.getVehicleType());
		FreeLargeSpot--;
	}
	void parkingYourCompactVehicle(vehicle Vehicle)
	{
		CompactSpot compactSpot=new CompactSpot(parkinngSpotType.COMPACT);
		parkingSpot.setFree(false);
		compactSpot.setVehicle(Vehicle);
		Vehicle.setParkingSpot(compactSpot);
		compactSpotList.add(compactSpot);
		System.out.println("We have successfully parked "+Vehicle.getVehicleType());
		FreeCompactSpot--;
	}
	void parkingYourBikeVehicle(vehicle Vehicle)
	{
		BikeSpot bikeSpot=new BikeSpot(parkinngSpotType.BIKE);
		parkingSpot.setFree(false);
		bikeSpot.setVehicle(Vehicle);
		Vehicle.setParkingSpot(bikeSpot);
		bikeSpotList.add(bikeSpot);
		System.out.println("We have successfully parked "+Vehicle.getVehicleType());
		FreeBikeSpot--;
	}
	//Unpacking the spot
	public void UnParkingVehicle(vehicle Vehicle) {
		System.out.println("Get the Vehicle Detail To unpark: "+Vehicle.getVehicleType());
		parkingSpot ParkingSpot=Vehicle.getParkinngSpotType();
		parkingSpot.setFree(true);
		if(Vehicle.getVehicleType().equals(VehicleType.TRUCK))
		{
			if(largeSpotList.remove(Vehicle)){
				System.out.println("We have successfully removed the truck");
				FreeLargeSpot++;
			}
			else
			{
				System.out.println("You dont have any vehicle in the parkingSpot");
			}
		}
		
		if(Vehicle.getVehicleType().equals(VehicleType.CAR))
		{
			if(compactSpotList.remove(Vehicle)){
				System.out.println("We have successfully removed the Car");
				FreeCompactSpot++;
			}
			else
			{
				System.out.println("You dont have any vehicle in the parkingSpot");
			}
		}
		if(Vehicle.getVehicleType().equals(VehicleType.BIKE))
		{
			if(bikeSpotList.remove(Vehicle)){
				System.out.println("We have successfully removed the Car");
				FreeCompactSpot++;
			}
			else
			{
				System.out.println("You dont have any vehicle in the parkingSpot");
			}
		}
		
	}

}
