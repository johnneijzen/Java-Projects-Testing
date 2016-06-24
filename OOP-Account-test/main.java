/*
	The MIT License (MIT)

	Copyright (c) 2016 John V Neijzen

	Permission is hereby granted, free of charge, to any person obtaining a copy
	of this software and associated documentation files (the "Software"), to deal
	in the Software without restriction, including without limitation the rights
	to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
	copies of the Software, and to permit persons to whom the Software is
	furnished to do so, subject to the following conditions:

	The above copyright notice and this permission notice shall be included in all
	copies or substantial portions of the Software.

	THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
	IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
	FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
	AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
	LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
	OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
	SOFTWARE.
*/

/*
    @author:    John V. Neijzen
    @activity:  2 - Creating classes
    @section:   CSA 30.1 A
    @version:   0.1
*/

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scanString = new Scanner(System.in);
		Account acc = new Account();
		int choice = 0;
		String name;
		double amount;
		
		System.out.println("Hello Welcome To Account Program");
		do
		{
			System.out.println("Type 1 to set name and balances Type 2 to get name and balance type 3 to exit");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter Name: ");
				name = scanString.nextLine();
				System.out.println("Enter Amount: ");
				amount = scan.nextDouble();
				acc.setAccount(name, amount);
				break;
			case 2:
				System.out.println("Your Acc Name is: " + acc.getName());
				System.out.println("Your Acc Balance is: " + acc.getAmount());
				break;
			case 3:
				System.out.println("Thank You");
				break;
			}
		} while(3 != choice);
		scan.close();
		scanString.close();
	}

}
