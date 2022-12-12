package cardriver;

public class Car {

	private int gas = 10;

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public void displayGasAmount() {
		System.out.printf("Gas remaining: %s/10\n", gas);
	}
	
}
