package experiments;

import java.util.ArrayList;

class Item {

}

class Shoe extends Item {
	
}

class Book extends Item {
	private String title;
	private String[] authors;
}

class ItemOrder {
	public final Item item;
	public final int quantity;

	public ItemOrder(Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
}

public class Order {

	private ArrayList<ItemOrder> orders = new ArrayList<>();

	/**
	 * Adds more items to the order.
	 *
	 * @param item The type of item to add to the order.
	 * @param quantity The number of items of the specified type.
	 */
	public void addItem(Item item, int quantity) {
		ItemOrder itemOrder = new ItemOrder(item, quantity);
		orders.add(itemOrder);
	}
}
