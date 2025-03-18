package examples;

public class ItemsBean {
	private int itemId;
	private String itemName;
	private double itemCost;
	private int itemQuantity;
	
	// getters and setters 
	public int getitemId()
	{
		return itemId;
	}
	public String getitemName()
	{
		return itemName;
	}
	public double getitemCost()
	{
		return itemCost;
	}
	public int getitemQuantity()
	{
		return itemQuantity;
	}
	
	public void setitemId(int itemId)
	{
		this.itemId = itemId;
	}
	public void setitemName(String itemName)
	{
		this.itemName = itemName;
	}
	public void setitemCost(double itemCost)
	{
		this.itemCost = itemCost;
	}
	public void setitemQuantity(int itemQuantity)
	{
		this.itemQuantity = itemQuantity;
	}
	
	public void displayDetails()
	{
		System.out.println("Item Id : "+ itemId + "\nItem Name : " + itemName);
		System.out.println("ItemCost : " + itemCost);
		System.out.println("Item Quantity : " + itemQuantity);
		System.out.println("Total : " + itemCost*itemQuantity);
	}
}
