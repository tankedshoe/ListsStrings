package useful.model;

public class Donut
{
	private boolean hasSprinkles;
	private boolean isGlazed;
	private String shape;
	private String flavor;
	private int holeCount;
	
	public Donut()
	{
		this.flavor = "plain";
		this.shape = "round";
		this.holeCount = 1;
		this.hasSprinkles = false;
		this.isGlazed = false;
	}
	
	public Donut(String flavor)
	{
		this();
		this.flavor = flavor;
	}
	
	public String toString()
	{
		String description = "This donut is a " + flavor + " donut";
		
		return description;
	}
	
	public Donut(String flavor, String shape)
	{
		this();
		this.flavor = flavor;
		this.shape = shape;
	}
	
	public Donut(boolean hasSprinkles, boolean isGlazed)
	{
		this();
		this.hasSprinkles = hasSprinkles;
		this.isGlazed = isGlazed;
	}
	
	public Donut(int holeCount, String shape)
	{
		this();
		this.holeCount = holeCount;
		this.shape = shape;
	}
	
	public Donut(String flavor, String shape, int holeCount, boolean hasSprinkles, boolean isGlazed)
	{
		this.flavor = flavor;
		this.shape = shape;
		this.holeCount = holeCount;
		this.hasSprinkles = hasSprinkles;
		this.isGlazed = isGlazed;
	}
}
