package useful.model;

public class IceCream
{
	private boolean hasSyrup;
	private boolean isThick;
	private String creamFlavor;
	private String syrupFlavor;
	private int scoops;
	
	public IceCream()
	{
		this.hasSyrup = false;
		this.isThick = true;
		this.creamFlavor = "Vanilla";
		this.syrupFlavor = "Chocolate";
		this.scoops = 2;
	}
	
	public String toString()
	{
		String desc = "This Ice Cream is " + creamFlavor + " flavored, it is " + hasSyrup + " that it has syrup, it is " + isThick + " that it is thick, and it has " + scoops + " scoops.";
		
		return desc;
	}
	
	public IceCream(String creamFlavor)
	{
		this();
		this.creamFlavor = creamFlavor;
	}
	
	
	//GETTERS
	public boolean getHasSyrup()
	{
		return hasSyrup;
	}
	
	public boolean getIsThick()
	{
		return isThick;
	}
	
	public String getCreamFlavor()
	{
		return creamFlavor;
	}
	
	public String getSyrupFlavor()
	{
		return syrupFlavor;
	}
	
	public int getScoops()
	{
		return scoops;
	}
	
	//SETTERS
	public void setHasSyrup(boolean hasSyrup)
	{
		this.hasSyrup = hasSyrup;
	}
	
	public void setIsThick(boolean isThick)
	{
		this.isThick = isThick;
	}
	
	public void setCreamFlavor(String creamFlavor)
	{
		this.creamFlavor = creamFlavor;
	}
	
	public void setSyrupFlavor(String syrupFlavor)
	{
		this.syrupFlavor = syrupFlavor;
	}
	
	public void setScoops(int scoops)
	{
		this.scoops = scoops;
	}
	
	//CREAM TYPES
	public IceCream(String creamFlavor, boolean hasSyrup, String syrupFlavor)
	{
		this();
		this.creamFlavor = creamFlavor;
		this.syrupFlavor = syrupFlavor;
		this.hasSyrup = hasSyrup;
	}
	
	public IceCream(String creamFlavor, String syrupFlavor, boolean hasSyrup, boolean isThick)
	{
		this();
		this.creamFlavor = creamFlavor;
		this.syrupFlavor = syrupFlavor;
		this.hasSyrup = hasSyrup;
		this.isThick = isThick;
	}
	
	public IceCream(String creamFlavor, String syrupFlavor, boolean hasSyrup, boolean isThick, int scoops)
	{
		this.creamFlavor = creamFlavor;
		this.syrupFlavor = syrupFlavor;
		this.hasSyrup = hasSyrup;
		this.isThick = isThick;
		this.scoops = scoops;
	}
}

