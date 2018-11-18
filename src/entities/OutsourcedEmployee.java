package entities;

public class OutsourcedEmployee extends Employee {

	private double adittionalCharge;

	public OutsourcedEmployee() {

	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double adittionalCharge) {
		super(name, hours, valuePerHour);
		this.adittionalCharge = adittionalCharge;
	}

	public double getAdittionalCharge() {
		return adittionalCharge;
	}

	public void setAdittionalCharge(double adittionalCharge) {
		this.adittionalCharge = adittionalCharge;
	}

	@Override
	public double payment() {
		return super.payment() + adittionalCharge * 1.1;
	}
}
