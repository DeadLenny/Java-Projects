public class Item {
	private int ID;
	private String Name;
	private int Quantity;
	private double Price;
	public Item() {
		setID(0);
		setName("");
		setQuantity(0);
		setPrice(0);
	}
	public Item(int ID, String Name, int Quantity,double Price) {
		setID(ID);
		setName(Name);
		setQuantity(Quantity);
		setPrice(Price);
	}
	
	public void setID(int ID) {
		if(ID>0)
			this.ID=ID;
	}
	
	public String setName(String Name) {
			this.Name=Name;
			return Name;
	}
	public int setQuantity(int Quantity) {
		if(Quantity>0)
			this.Quantity=Quantity;
		return Quantity;
	}
	public double setPrice(double Price) {
		if(Price>0)
			this.Price=Price;
		return Price;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public double getPrice() {
		return Price;
	}

	

}
