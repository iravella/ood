package experiments;

class Dimension {
	public final int height;
	public final int width;
	public final int length;

	private String confidentialInfo;

	public Dimension(int height, int width, int length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}
	
	void checkInfo() {
		if (this.confidentialInfo == "OK") System.out.println("All good.");
		
		Dimension otherDim = new Dimension(0, 1, 2);

		if (otherDim.confidentialInfo == "OK") System.out.println("All good.");
	}
}

class Table {

	private int height = defaultHeight;
	private int width;
	private int length;
	private int cost = 0;
	private int color = 0;

	public static int defaultHeight = 80;
	
	public Table(Dimension dim, int cost, int color) {
		this.height = dim.height;
		this.width = dim.width;
		this.length = dim.length;
		this.cost = cost;
		this.color = color;
	}
	
	public Table(int width, int length) {
		this(defaultHeight, width, length);
	}
	
	public Table(int height, int width, int length) {
		this(new Dimension(height, width, length), 0, 10);
	}

}

public class Constructors {

	public static void main(String[] args) {
		int inputWidth = 50;
		int inputLength = 200;
		
		Table t = new Table(Table.defaultHeight, inputWidth, inputLength);
	}

}
