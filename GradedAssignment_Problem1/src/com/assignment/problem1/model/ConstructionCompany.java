package com.assignment.problem1.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ConstructionCompany {
	int no_of_floors;
	ArrayList<Integer> vFloors = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	
	public ConstructionCompany(int size)
	{
		no_of_floors = size;
	}
	public int GetNoOfFloors()
	{
		return no_of_floors;
	}
	public void Init()
	{
		for(int i = 0 ;i<GetNoOfFloors();i++ )
		{
			System.out.println("Enter the floor size given on day:" + (i+1));
			int floor =  sc.nextInt();
			while(vFloors.contains(floor) )
			{
				
				System.out.println("A floor with this size already exists. "
						+ "Please ernter another the floor size ");
				floor =  sc.nextInt();
			}
			vFloors.add(floor);			
		}
	}
	
	public void ConstructBuilding()
	{
		int counter = GetNoOfFloors();
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		int days = 1;
		for (Integer floor : vFloors) 
		{
			
		  System.out.println("Day:"+(days) );
		  days++;
		  tempList.add(floor);
		  Boolean bFound = true;
		  while(bFound && !tempList.isEmpty())
		  {
			  int index = tempList.indexOf(counter);
			  if( index != -1)
			  {
				  System.out.print(tempList.get(index) + " ");
				  tempList.remove(index);
				  counter--;
			  }
			  else
			  {
				  bFound = false;
			  }
		  }
		  System.out.println();
		}
	
	}
	
}