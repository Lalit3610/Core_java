// WAP  TO find which deparetment has got the highest placement IN COLLEGE

import java.util.Scanner;
public class PlacementCell {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("total NO.OF students GET  placed in CSE ");
		int CSE = input.nextInt();
		System.out.println("total NO.OF students GET  placed in  ECE ");
		int ECE = input.nextInt();
		System.out.println("total NO.OF students GET  placed in MECH ");
		int MECH = input.nextInt();
		
		if(CSE == ECE && ECE == MECH && MECH == CSE) {
			System.out.println(" The all departments got the equal placement");
		}
		else if(CSE >= 0 && ECE >=0 && MECH >=0){
			if(CSE > ECE && CSE > MECH) {
				System.out.println(" Highest Placement is for CSE");
			}
			else if(ECE > MECH && ECE > CSE) {
				System.out.println(" Highest Placement is for ECE");
			}
			else if(MECH > CSE && MECH > ECE) {
				System.out.println(" Highest Placement is for MECH");
			}
			else if(CSE == ECE) {
				System.out.println("Highest Placement is for CSE & ECE");
			}
			if(CSE == MECH) {
				System.out.println(" Highest Placement is for CSE & MECH");
			}
			if(ECE == MECH) {
				System.out.println("Highest Placement is for ECE & MECH");
			}
		}
		else {
			System.out.println("Enter the valid details");
		}
	}
}