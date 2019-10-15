package com.exercise10searches.app;
import java.util.Random;
import java.util.Scanner;
public class SequentialSearchNonGreedy 
{

	public static void main(String[] args) 
	{
		//decalaration of caonstants
		final int ELEMENTS_ARRAY=5;
		//variable declaration
		int numberToFind=0;
		int indexFound=-1;
		int index=0;
		boolean isFound=false;
		
	//ARRAY DECLARATION
		int[] vector= new int[ELEMENTS_ARRAY];
		
		Random numbers = new Random(System.nanoTime());
		Scanner input = new Scanner(System.in);
		
			for (int i=0; i<ELEMENTS_ARRAY;i++)
				{
					vector[i] = numbers.nextInt(101);
				}
			for (int i=0; i<ELEMENTS_ARRAY;i++)
			{
				System.out.println(vector[i]+" ");
			}
			
			System.out.println(" ");
			do {
				System.out.println("input the value to find inside the array");
				numberToFind= input.nextInt();
				if(numberToFind<0)
				{
					System.out.print("Number must be greater than or equal to zero!  ");
				}
			}while(numberToFind<0);
			
			for (int i=0; i<ELEMENTS_ARRAY;i++)
			{
				if (numberToFind==vector[i]);
				{
					indexFound=i;
					break;
				}
			}
			if(indexFound!=-1)
			{
				System.out.println("Element found at index: "+indexFound);
			}
				else 
				{
					System.out.println("Elements no found! ");

				}
		
			while(isFound==false && index<ELEMENTS_ARRAY)
			{
				if(numberToFind==vector[index])
				{	
					indexFound=index;
					isFound= true;
				}
				index++;
			}
			if(indexFound!=-1)
			{
				System.out.println("Element found at index: "+indexFound);
			}
				else 
				{
					System.out.println("Elements no found! ");

				}
		
				input.close();
			}
	}


