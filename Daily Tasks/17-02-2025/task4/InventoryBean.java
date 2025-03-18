package examples;

public class InventoryBean {
	private String inventoryName;
	private double inventoryCost;
	private int inventoryQuantity; 
	
	public InventoryBean(String inventoryName,double inventoryCost,int inventoryQuantity)
	{
		this.inventoryName = inventoryName;
		this.inventoryCost = inventoryCost;
		this.inventoryQuantity = inventoryQuantity;
	}
	
	public void displayValues()
	{
		System.out.println("Inventory Name : " + inventoryName);
		System.out.println("Inventory Cost : " + inventoryCost);
		System.out.println("Inventory Quantity : " + inventoryQuantity);
		System.out.println("Total Cost : " + inventoryCost * inventoryQuantity);
	}
}
