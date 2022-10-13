import java.util.Scanner;

public class MainClient {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number of ParkingSpot avalible for truck");
		int a=scan.nextInt();
		System.out.println("Enter the Number of ParkingSpot avalible for Car");
		int b=scan.nextInt();
		System.out.println("Enter the Number of ParkingSpot avalible for Bike");
		int c=scan.nextInt();
		parkingLot parkingLot=new parkingLot(a, b, c);
		vehicle truck=new vehicle(VehicleType.TRUCK);
		parkingLot.parkVehicle(truck);
		parkingLot.parkVehicle(truck);
		parkingLot.UnParkingVehicle(truck);
	}
}
