package GameObject;

public class Coordonnee {
	
	private double x;
	private double y;
	
	public Coordonnee(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Coordonnee coordonnee) {
		return this.x == coordonnee.x && this.y == coordonnee.y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public Coordonnee getCoordonnee(){
		return new Coordonnee(getX(), getY());
	}
	
	@Override
	public String toString() {
		return "("+this.x+";"+this.y+")";
	}
}
