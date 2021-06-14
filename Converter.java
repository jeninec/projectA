package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuSelection = 0;
		
		loop: while (menuSelection != 4) { //!last menu option
			System.out.println("Please select an option: " + "\n" + 
				"1. Inches to Feet" + "\n" + 
				"2. Miles to Kilometers" + "\n" + 
				"3. Centimeters to Meters" + "\n" + 
				"4. Quit");
			menuSelection = sc.nextInt();
			
			menu: switch(menuSelection) {
				case 1:
					System.out.println("Enter inches to be converted.");
					double f = sc.nextDouble();
					System.out.println("Conversion is: " + f + " feet = " + (f/12) + " inches." + "\n");
					break menu;
					
				case 2:
					System.out.println("Enter miles to be converted." );
					double ml = sc.nextDouble();
					System.out.println("Conversion is: " + ml + " miles = " + (ml*1.60934) + " kilometers." + "\n");
					break menu;
					
				case 3:
					System.out.println("Enter centimeters to be converted.");
					double cm = sc.nextDouble();
					System.out.println("Conversion is: " + cm + " centimeters = " + (cm/100) + " meters." + "\n");
					break menu;
					
				case 4: 
					System.out.println("Thank you! Goodbye.");
					break loop;
			}
			
		}
		sc.close();
		
		
		
	}

}
