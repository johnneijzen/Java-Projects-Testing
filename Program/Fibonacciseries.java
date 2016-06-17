/*
    @author:    John V. Neijzen
    Activity 1 - The very difficult Fibonacci series
    @section:   CSA 30.1 A
    @version:   0.1
*/


import java.util.Scanner;

public class Fibonacciseries {

    public static void main(String[] args) {
		int count = 0;
		int first = 0;
		int next = 0;
		int second = 1;
		int userInput = 0;
		
		Scanner scan = new Scanner(System.in);
		// Input
		System.out.print("Enter the number of elements of the series to be displayed: ");
		
		do{
			userInput= scan.nextInt();
			if((userInput < 1) || (userInput > 10))
			{
				System.out.print("Invalid Input Try Aging: ");
			}
		}while((userInput < 1) || (userInput > 10));
		
		// Process/Output
		System.out.print("Fibonacci series: ");
		while(count != userInput)
		{
			System.out.print(next + " ");
			first = first + second;
			second = next;
			next = first;
			count = count + 1;
		}
    }
}