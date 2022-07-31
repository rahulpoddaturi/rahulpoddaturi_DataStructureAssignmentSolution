package com.assignment.problem1.driver;

import java.util.Scanner;

import com.assignment.problem1.model.ConstructionCompany;

public class ConstructionDriver {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total Number of floors in the building.");
			int no_of_floors = sc.nextInt();
			
			ConstructionCompany ConstructionCompanyObj = new ConstructionCompany(no_of_floors);
			ConstructionCompanyObj.Init();
			ConstructionCompanyObj.ConstructBuilding();
		}
	}
}
