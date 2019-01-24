package com.champ.reservation;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	private static int[] seats = new int[12];
    public static void main( String[] args )
    {
    	
    	
    	System.out.println("Welcome to the train reservation system!");
        System.out.println();
        
        for(int i=0;i<12;i++)
        {
        	seats[i] = 0;
        }
        
        Scanner s = new Scanner(System.in);
        int choice = 1;
        
        System.out.println("enter 1 for window and 2 for aisle");
        choice = s.nextInt();
        
        while(choice !=0) {
        	int seatNumber = 0; 

        	
        	if(choice == 1) {
        		seatNumber = bookWindow();
        		
        		if (seatNumber != -1) {
        			seatNumber = bookAisle();
        			System.out.println("seatNumber is %d" +seatNumber);
        			
        			if (seatNumber != -1) {
        				
        				System.out.println("Sorry , we were not able to book tickets");
        				//printBoardingPass(seatNumber);
        			}
        		}
        		else {
        			System.out.println("lucky , we have a window seat for you");
        			printBoardingPass(seatNumber);
        		}
        	}
        	else if (choice == 2){
        		seatNumber = bookAisle();
        		
        		if(seatNumber == -1) {
        			seatNumber = bookWindow();
        			
        			if (seatNumber != -1) {	
        				System.out.println("Sorry , we were not able to Aisle seat tickets");
        		//		printBoardingPass(seatNumber);
        			}
        		}
        		else {
        			                    // Booking an aisle seat was successful.
        			    System.out.println("You are in luck, we have an aisle seat available!");
        			    printBoardingPass(seatNumber);
        			    System.out.print(seatNumber);
                     }
        	}
        	
        	else {
       	                // Print an error message if they did not choose 1, 2, or 0 for their choice.
     		                System.out.println("Invalid choice made. Please try again!");
     		                choice = 0;
        		
        		            }
        		            // No window or aisle seats were available. 
        		
        		            if (seatNumber == -1) {
        		                System.out.println("We are sorry, there are no window or aisle seats available.");
        		                System.out.println();
        		            }
        		            // Reprompt for a choice
        		            System.out.print("Please enter 1 for window, 2 for aisle, or 0 to exit: ");
        		            choice = s.nextInt();
        }
        
    }
    // This function checks for window seats and returns seat number or -1 if full.

    private static int bookWindow() {
        for (int i = 0; i < 6; i++) {
            if (seats[i] == 0) {
                seats[i] = 1;
                System.out.println(seats);
                return i + 1;
            }
        }
        return -1;
    }
    // This function checks to see if aisle seats were available, -1 if full.

    private static int bookAisle() {

        for (int i = 6; i < 12; i++) {

            if (seats[i] == 0) {

                seats[i] = 1;
                System.out.println(seats[i]);
                return i + 1;

            }

        }

        return -1;
    }
    // This simply prints out a nice little boarding pass message with their seat number and date of issue.

    private static void printBoardingPass(int seatnumber) {

        Date timenow = new Date();

        System.out.println();

        System.out.println("Date: " + timenow.toString());

        System.out.println("Boarding pass for seat number: " + seatnumber);

        System.out.println("This ticket is non-refundable and non-transferable.");

        System.out.println("Please be curteous, do not smoke. Enjoy your trip.");

        System.out.println();

        }

	   
	}

