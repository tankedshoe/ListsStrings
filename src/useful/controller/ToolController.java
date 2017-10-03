package useful.controller;

import java.util.List;
import java.util.ArrayList;
import useful.model.Donut; //Must import as its from a different package.

public class ToolController
{
	private List<Donut> donutList; //makes a list
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>(); //instantiates a list
	}
	
	public void start()
	{
		Donut temp = new Donut();
		
		donutList.add(temp);
	}
}
