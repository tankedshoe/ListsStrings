package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut; //Must import as its from a different package.
import useful.model.IceCream;
import useful.view.PopupDisplay;

public class ListController
{
	private List<Donut> donutList; //makes a list
	private List<IceCream> creamList;
	private PopupDisplay display;
	
	public ListController()
	{
		donutList = new ArrayList<Donut>(); //instantiates a list
		creamList = new ArrayList<IceCream>();
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
//		showTheList();
		changeTheList();
		creamFill();
		creamChange();
	}
	
	private void showTheList()
	{
		String favorite = "Standard Glazed";
		for (int index = 0; index < donutList.size(); index++)
		{
			String currentFlavor = donutList.get(index).getFlavor();
			
			if (currentFlavor.equals(favorite))
			{
				for (int woop = 0; woop < 5; woop++)
				{
					display.displayText("The best flavor ever!");
				}
			}
			for (int currentLetterIndex = 0; currentLetterIndex < currentFlavor.length(); currentLetterIndex++)
			{
				display.displayText(currentFlavor.substring(currentLetterIndex, currentLetterIndex + 1));
			}
			display.displayText(donutList.get(index).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut chocoSquare = new Donut("chocolate", "square");
		Donut sprinkledGlazed = new Donut(true, true);
		Donut weirdShape = new Donut(5, "triangular");
		Donut theWorks = new Donut("chocolate, strawberry, and maple", "square and circular AT THE SAME TIME", 32, true, true);
		
		donutList.add(jellyFilled);
		donutList.add(chocoSquare);
		donutList.add(sprinkledGlazed);
		donutList.add(weirdShape);
		donutList.add(theWorks);
	}
	
	private void changeTheList()
	{
		display.displayText("The list is this big: " + donutList.size());
		Donut removed = donutList.remove(0);
		display.displayText(removed.getFlavor() + " was removed from the list");
		display.displayText("Now it is this big: " + donutList.size());
		donutList.add(removed);
		
		display.displayText("The list is still " + donutList.size() + " items.");
		removed = donutList.set(3, new Donut());
		display.displayText("The donut with flavor " + removed.getFlavor() + " has been removed.");
	}
	
	private void creamFill()
	{
		IceCream plainBasic = new IceCream("Vanilla");
		IceCream chocoSyrup = new IceCream("Chocolate", true, "Chocolate");
		IceCream thinJulius = new IceCream("Orange", "Vanilla", true, false);
		IceCream scoopmania = new IceCream("Chocolate, Orange and Vanilla", "Vanilla and Chocolate", true, true, 15);
		
		creamList.add(plainBasic);
		creamList.add(chocoSyrup);
		creamList.add(thinJulius);
		creamList.add(scoopmania);
	}
	
	private void creamChange()
	{
		IceCream popped = creamList.remove(0);
		display.displayText(popped.getCreamFlavor() + " was removed.");
		creamList.add(3, popped);
		display.displayText("Option 2: " + creamList.get(2));
		creamList.add(new IceCream("Grape"));
		display.displayText("Here are all of the options...");
		for (int index = 0; index < donutList.size(); index += 1)
		{
			display.displayText("" + creamList.get(index));
		}
	}
	
	public ArrayList<Donut> getDonutList()
	{
		return (ArrayList<Donut>) donutList;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
}
