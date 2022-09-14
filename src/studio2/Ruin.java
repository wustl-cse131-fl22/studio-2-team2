package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Starting amount?");
		double startAmount = scan.nextDouble();
		System.out.println("Win chance?");
		double winChance = scan.nextDouble();
		System.out.println("Win limit?");
		double winLimit = scan.nextDouble();
		double counter = startAmount;
		int totalSimulation = 0; 
		double ruinRate;
		double ruinNumber=0;
		while (counter <= winLimit && counter > 0)
		{
		totalSimulation ++;
		
		
		if (Math.random() <= winChance)
		{counter ++;
		System.out.println("Simulation " + totalSimulation + ":"+ counter + "Win");
		}
		else
		{counter --;
		ruinNumber++ ;
		System.out.println("Simulation " + totalSimulation +":" + counter + " Lose");
		
		}
		
		}
		ruinRate = ruinNumber/totalSimulation;
		System.out.println("Ruin rate: " + ruinRate);
	}

}
