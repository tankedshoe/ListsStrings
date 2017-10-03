package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut; //Must import as its from a different package.
import useful.view.PopupDisplay;

public class ToolController
{
	private List<Donut> donutList; //makes a list
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>(); //instantiates a list
		display = new PopupDisplay();
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
		fillTheList();
	}
	
	private void showTheList()
	{
		for (int index = 0; index < donutList.size(); index++)
		{
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
}
