package cardriver;

public class Driver extends Car {

	public void driveCar() {
		int gas = getGas();
		System.out.println("\nYou drive the car.\n");
		gas--;
		setGas(gas);
		displayGasAmount();
	}
	
	public void boosterCar() {
		int gas = getGas();
		System.out.println("\nYou fly down the road with your boosters on.\n");
		gas -= 3;
		setGas(gas);
		displayGasAmount();
	}
	
	public void refuelCar() {
		int gas = getGas();
		System.out.println("\nYou refuel the car.\n");
		gas += 2;
		setGas(gas);
		displayGasAmount();
	}
	
}
