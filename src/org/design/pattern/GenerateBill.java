package org.design.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();
		
		System.out.print("Enter the name of plan for which the bill will"
				+ " be generated");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String planName = br.readLine().trim();
			System.out.print("Enter the number of units for bill will"
					+ " be calculated");
			int units = Integer.parseInt(br.readLine().trim());
			
			Plan plan = planFactory.getPlan(planName);
			
			System.out.print("Bill amount for " + planName + " of "
					+ units + " units is ");
			plan.getRate();
			plan.calculateBill(units);
		} catch (IOException e) {
			System.out.println("Plan didn't found!");
		}
		
	}
}
