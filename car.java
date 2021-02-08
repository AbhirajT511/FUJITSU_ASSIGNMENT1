
public class car 
{
	int yearModel;
	String make;
	int speed=0;
	public car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accelerate()
	{
		speed+=5;
	}
	public void brake()
	{
		speed = speed-5;
	}
}
