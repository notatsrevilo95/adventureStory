package adventureStory;

import java.util.Random;
import java.util.Scanner;

public class AdventureStory {

	public static int ultRanNum = new Random().nextInt();
	public static int compassInteger = 0;

	public static boolean storyStart = true;
	public static boolean storyProgress = false;

	public static int ranNum1 = new Random().nextInt();
	public static int ranNum2 = new Random().nextInt();
	public static int ranNum3 = new Random().nextInt();
	public static int ranNum4 = new Random().nextInt();
	public static int ranNum5 = new Random().nextInt();
	public static int ranNum6 = new Random().nextInt();
	public static int ranNum7 = new Random().nextInt();
	public static int ranNum8 = new Random().nextInt();
	public static int ranNum9 = new Random().nextInt();

	public static void main(String[] args) {
		readUserchoice(1);
		secondUserchoice(2);

	}

	public static void readUserchoice(int x) {

		Scanner readInput = new Scanner(System.in);
		int z = readInput.nextInt();
		while (storyStart == true) {
			System.out.println(
					"You eyes creak open. You find yourself maroooned on a damp, muddy hillock, surrounded by encroaching grey fog."
							+ "\n The uncertainty of your location is matched by the dreadul certainty of your isolation. There is not a soul about you; barely even a noise, apart from the slight swaying of the reeds of nearby swamp plants."
							+ "\n You suddenly realise clasped in your hand you have an old navigation compass. It appears to be a normal compass, but it has multiple hands. They read as follows:"
							+ "\n N - " + ranNum1 + " m" + "\nS - " + ranNum2 + " m" + "\nW - " + ranNum3 + " m"
							+ "\n With no other ideas presenting themselves, you choose to follow the directions of this inexplicable device. In which direction do you start walking?"
							+ "\n Enter the numeric digit(s) corresponding to the compass direction to begin your journey...");
			if (z == ranNum1) {
				compassInteger = ranNum1; // corresponds to first 'IF' of 'secondUserchoice' method.
				storyStart = false;
			} else if (z == ranNum2) {
				compassInteger = ranNum2; // corresponds to first 'ELSE IF' of 'secondUserchoice' method.
				storyStart = false;
			} else if (z == ranNum3) { // corresponds to third 'IF' of 'secondUserchoice' method.
				compassInteger = ranNum3;
				storyStart = false;
			} else {
				System.out.println(
						"You have entered an invalid input. Please only enter numeric digits matching the compass directions outlined in the story");
				storyStart = true;
			}
		}

	}

	public static void secondUserchoice(int y) {
		while (storyStart == false) {
			if (compassInteger == ranNum1) {
				System.out.println(
						"You stumble through the thick blanket of grey mist northwards. After a few minutes, you fall suddenly face first into a peat filled bog. Panick stricken, you thrash about for the nearest land, managing to eventually grab onto a rock and lift yourself out."
								+ "\nWith your pride hurt more than your body, after a few minutes of rueing your predicament you notice a glinting gold object that has been revealed by your disturbing of the swamp."
								+ "\nYou lean across to pick up the object, and after cleaning it of mud, realise you have found a key - what use it has for you now, however, is limited."
								+ "\nYou check your compass again:" + "\nN - " + ranNum4 + " m" + "\nE - " + ranNum5
								+ " m" + "\nWhich direction do you take?");
				Scanner secondInput = new Scanner(System.in);
				int bogFallInt = secondInput.nextInt();
				if (bogFallInt == ranNum4) {
					compassInteger = ranNum4;
					storyProgress = true;
				} else if (bogFallInt == ranNum5) {
					compassInteger = ranNum5;
					storyProgress = false;
				} 
		}

	public static void thirdUserchoice(int s) {
				System.out.println(
						"You decide to go to what seems to be the nearest point this curious compass identifies. Unfortunately, that point appears to be a cliff completely hidden by the suffocating fog."
								+ "You plummet to your death." + ""
								+ "Would you like to keep playing? Type 'Y' for Yes or 'N' for No.");
				Scanner firstDeath = new Scanner(System.in);
				String x = firstDeath.nextLine();
				if (x == "Y") {
					storyStart = true;
				} else if (x == "N") {
					System.out.println("Thank you for playing Adventure Story.");
				}

		} if (compassInteger == ranNum3) {
				System.out.println(
						"You set out westwards. After some time following what you think is a straight line, you hear a blood curdling screech from somewhere off in the distance."
								+ "You check your compass. The only direction showing is the same one you are going in, West. The distance has reduced from 100m to 23m."
								+ "Do continue in the same direction, or go back the way you think you came? Enter 'F' to carry on travelling west, or 'B' to turn back.");
				Scanner turnBack = new Scanner(System.in);
				String backOrForwards = turnBack.nextLine();
				if (backOrForwards == "B") {
					System.out.println(
							"Scared by the chilling sound, you turn around and hurriedly begin to run back in the direction you came."
									+ "\nHowever, with few identifiable features to the monotonous landscape that surrounds you, you find yourself aimlessly passing by nondescript hills, marshes and ponds for what seems like hours."
									+ "\nYour compass provides no help, for even the direction it was pointing in when you turn around has gone from its face. The hands float freely around behind the glass."
									+ "\nMore time and aimless wandering go by."
									+ "\nWith no sustenance, you eventually pass out from hunger and thirst. Following bouts of dehydration fuelled hallucinations during a few intervening periods of wakefulness, you finally die."
									+ "\nWould you like to keep playing? Type 'Y' for Yes or 'N' for No.");
					Scanner death = new Scanner(System.in);
					String D = death.nextLine();
					if (D == "Y") {
						storyStart = true;
					} else if (D == "N") {
						System.out.println("Thank you for playing Adventure Story.");
					}
				}
			}
		}
}

}

}
