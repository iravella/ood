package experiments;

class Size {
	public final int seats;

	public Size(int seats) {
		this.seats = seats;
	}
}

class Color {
	private int colorCode;
	public Color(int code) {
		this.colorCode = code;
	}
	public int getColorCode() {
		return colorCode;
	}
}

class CarDTO {

	private Color color;
	private Size size;

	public CarDTO(Size size, Color color) {
		this.size = size;
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public Color getColor() {
		return color;
	}

	public boolean hasAC() {
		return false;
	}

	public boolean isFourWD() {
		return true;
	}
}

public class Comments {

	/**
	 * Compares found car and searched car, and returns a boolean,
	 * which indicates whether all properties are equal.
	 * Note that properties of searched which are null are ignored.
	 * 
	 * @param found     the car that is found
	 * @param searched  the car that is searched for
	 * @return          true if the two cars have equal properties (see above), false otherwise.
	 */
	public boolean matches(CarDTO found, CarDTO searched) {
		if (searched.getSize() != null &&
				!searched.getSize().equals(found.getSize())) {
			return false;
		}
		if (searched.getColor() != null &&
				!searched.getColor().equals(found.getColor())) {
			return false;
		}
		if (searched.hasAC() != found.hasAC()) {
			return false;
		}
		if (searched.isFourWD() != found.isFourWD()) {
			return false;
		}
		return true;
	}

}
