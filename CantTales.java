package CantTales;
import java.util.Scanner;

	public class CanterburyTales {
		
		Scanner joinReader = new Scanner(System.in);
		Scanner nameReader = new Scanner(System.in);
		public static String userName;
		
		public CanterburyTales(){
			
			System.out.print("Good morrow! Please enter your name: ");
			userName = nameReader.nextLine();
			System.out.println("Hello, " + userName + ". \n" );			
			System.out.println("April, 1384. London.");
			System.out.println("You approach the Tabard Inn in Southwark.\nYou hear a group of diverse folk talking merrily.");
			System.out.println("\nWould you like to join them, " + userName + "?");
			int y = 0;
			while (y == 0){
				System.out.print("Please enter 'Yes' or 'No': ");
				String enterAnswer = joinReader.nextLine();
					if (enterAnswer.equals("Yes")){
						y++;
					}
						
					else if (enterAnswer.equals("No")){
						System.out.println("\nHmm...not even for just one ale?");
					}
						
					else { //checks user input
						System.out.println("\nSorry, I didn't catch that.");
					}
			}	
			System.out.println("\nI thought you would...");			
		}
		
		public static String getName(){
			
			return userName;
		}
		
		public static void main(String[] args) {

			new CanterburyTales();
			Pilgrim.meetPilgrims();
			Tale.makeTales();
			Tale.chooseFirstTale();
		}
	}

 
package CantTales;
import java.util.concurrent.ThreadLocalRandom;

	public class Pilgrim {

		String pilgrimName;
		int linesPerHour;

		public String getPilgrimName(){
			return pilgrimName;
		}

		public int getLinesPerHour(){
			return linesPerHour;
		}

		public static Pilgrim[] Pilgrims;

		public static void meetPilgrims() {
			Pilgrims = new Pilgrim[32];
			System.out.println("\nThis group of medieval misfits are readying to set\noff on a pilgrimage to the shrine of Thomas Becket\nin Canterbury Cathedral.");

			for (int x = 0; x < (Pilgrims.length) - 1; x++) {
				Pilgrims[x] = new Pilgrim();
			}

			Pilgrims[0].pilgrimName = "The Knight"; //there are more pilgrims than tales in Chaucer's text
			Pilgrims[0].linesPerHour = 1654;
			Pilgrims[1].pilgrimName = "The Miller";
			Pilgrims[1].linesPerHour = 1244;
			Pilgrims[2].pilgrimName = "The Reeve";
			Pilgrims[2].linesPerHour = 1525;
			Pilgrims[3].pilgrimName = "The Cook";
			Pilgrims[3].linesPerHour = 1367;
			Pilgrims[4].pilgrimName = "The Man of Law";
			Pilgrims[4].linesPerHour = 1354;
			Pilgrims[5].pilgrimName = "The Wife of Bath";
			Pilgrims[5].linesPerHour = 1121;
			Pilgrims[6].pilgrimName = "The Friar";
			Pilgrims[6].linesPerHour = 1035;
			Pilgrims[7].pilgrimName = "The Summoner";
			Pilgrims[7].linesPerHour = 1227;
			Pilgrims[8].pilgrimName = "The Clerk";
			Pilgrims[8].linesPerHour = 1713;
			Pilgrims[9].pilgrimName = "The Merchant";
			Pilgrims[9].linesPerHour = 1427;
			Pilgrims[10].pilgrimName = "The Squire";
			Pilgrims[10].linesPerHour = 1117;
			Pilgrims[11].pilgrimName = "The Franklin";
			Pilgrims[11].linesPerHour = 1161;
			Pilgrims[12].pilgrimName = "The Physician";
			Pilgrims[12].linesPerHour = 1415;
			Pilgrims[13].pilgrimName = "The Pardoner";
			Pilgrims[13].linesPerHour = 1237;
			Pilgrims[14].pilgrimName = "The Shipman";
			Pilgrims[14].linesPerHour = 1332;
			Pilgrims[15].pilgrimName = "The Prioress";
			Pilgrims[15].linesPerHour = 1230;
			Pilgrims[16].pilgrimName = "Chaucer";
			Pilgrims[16].linesPerHour = 1226;
			Pilgrims[17].pilgrimName = "The Monk";
			Pilgrims[17].linesPerHour = 1311;
			Pilgrims[18].pilgrimName = "The Nun's Priest";
			Pilgrims[18].linesPerHour = 1523;
			Pilgrims[19].pilgrimName = "The Second Nun";
			Pilgrims[19].linesPerHour = 1633;
			Pilgrims[20].pilgrimName = "The Canon's Yeoman";
			Pilgrims[20].linesPerHour = 1517;
			Pilgrims[21].pilgrimName = "The Manciple";
			Pilgrims[21].linesPerHour = 1726;
			Pilgrims[22].pilgrimName = "The Parson";
			Pilgrims[22].linesPerHour = 1631;
			Pilgrims[23].pilgrimName = "Harry Bailley";
			Pilgrims[23].linesPerHour = 1532;
			Pilgrims[24].pilgrimName = "The Yeoman";
			Pilgrims[24].linesPerHour = 1525;
			Pilgrims[25].pilgrimName = "The Haberdasher";
			Pilgrims[25].linesPerHour = 1643;
			Pilgrims[26].pilgrimName = "The Carpenter";
			Pilgrims[26].linesPerHour = 1734;
			Pilgrims[27].pilgrimName = "The Weaver";
			Pilgrims[27].linesPerHour = 1636;
			Pilgrims[28].pilgrimName = "The Dyer";
			Pilgrims[28].linesPerHour = 1545;
			Pilgrims[29].pilgrimName = "The Tapestry Maker";
			Pilgrims[29].linesPerHour = 1637;
			Pilgrims[30].pilgrimName = "The Plowman";
			Pilgrims[30].linesPerHour = 1623;
		
			System.out.println("\nThey encourage you to join them, " + CanterburyTales.getName() + "! \n");
		
			Pilgrims[(Pilgrims.length) - 1] = new Pilgrim();
			Pilgrims[(Pilgrims.length) - 1].pilgrimName = CanterburyTales.getName();
			Pilgrims[(Pilgrims.length) - 1].linesPerHour = 100; //unused
		
			int seatOne = ThreadLocalRandom.current().nextInt(0, 16); //choosing two random pilgrims to sit next to
			int seatTwo = ThreadLocalRandom.current().nextInt(16, 30);
			System.out.println("Look, " + CanterburyTales.getName() + ", they've budged up to make room for you;\ntake a seat between "+ Pilgrims[seatOne].pilgrimName + " and " + Pilgrims[seatTwo].pilgrimName + ".\n");
		}
	}
 
package CantTales;
import java.util.Scanner;

	public class Tale {
		String title;
		static double distance;
		static int a = 0, currentTIndex = 0, c = 0, gentAnswer = -1, maisAnswer = -1, harlAnswer = -1, agrAnswer = -1;
		int lines, tellerNum, lineLength, gentillesse, maistree, harlotrye, agrisen, score;
		static Scanner gentReader = new Scanner (System.in);
		static Scanner maisReader = new Scanner (System.in);
		static Scanner harlReader = new Scanner (System.in);
		static Scanner agrReader = new Scanner (System.in);
		static Scanner decisionReader = new Scanner (System.in);
		static Scanner decisionReader2 = new Scanner (System.in);
		public static Tale[] Tales;
		public static int[] scores;
	
		public static double getDistance(){
			return distance;
		}

		public static void makeTales(){
		
			System.out.println("Since Canterbury is " + Journey.PILGRIMAGE_MILES + " miles away,\nthe pilgrims decide to think up tales to tell one\nanother to pass the time.");
		
			Tales = new Tale[24];
		
			for (int x = 0; x < (Tales.length); x++) {
				Tales[x] = new Tale();
				Tales[x].score = 0;
			}	
		
				Tales[0].tellerNum = 0; //data for each of the tales
				Tales[0].title = "Palamon & Arcite";
				Tales[0].gentillesse = 5;
				Tales[0].maistree = 3;
				Tales[0].harlotrye = 1;
				Tales[0].agrisen  = 2;
				Tales[0].lines = 2250;
			
				Tales[1].tellerNum = 1;
				Tales[1].title = "Niklaus and the Flood";
				Tales[1].gentillesse = 0;
				Tales[1].maistree = 4;
				Tales[1].harlotrye = 5;
				Tales[1].agrisen  = 2;
				Tales[1].lines = 2250;
			
				Tales[2].tellerNum = 2;
				Tales[2].title = "The Oxford Students";
				Tales[2].gentillesse = 0;
				Tales[2].maistree = 4;
				Tales[2].harlotrye = 5;
				Tales[2].agrisen  = 4;
				Tales[2].lines = 470;
				
				Tales[3].tellerNum = 3;
				Tales[3].title = "Perkyn's Revels";
				Tales[3].gentillesse = 0;
				Tales[3].maistree = 1;
				Tales[3].harlotrye = 5;
				Tales[3].agrisen  = 2;
				Tales[3].lines = 98;
				
				Tales[4].tellerNum = 4;
				Tales[4].title = "Custance's Adventure";
				Tales[4].gentillesse = 3;
				Tales[4].maistree = 1;
				Tales[4].harlotrye = 3;
				Tales[4].agrisen  = 4;
				Tales[4].lines = 1190;
						
				Tales[5].tellerNum = 5;
				Tales[5].title = "What Women Want";
				Tales[5].gentillesse = 3;
				Tales[5].maistree = 4;
				Tales[5].harlotrye = 2;
				Tales[5].agrisen  = 3;
				Tales[5].lines = 1270;
			
				Tales[6].tellerNum = 6;
				Tales[6].title = "The Demon and the Summoner";
				Tales[6].gentillesse = 0;
				Tales[6].maistree = 4;
				Tales[6].harlotrye = 2;
				Tales[6].agrisen  = 5;
				Tales[6].lines = 400;
						
				Tales[7].tellerNum = 7;
				Tales[7].title = "The Friar and the Fart";
				Tales[7].gentillesse = 0;
				Tales[7].maistree = 4;
				Tales[7].harlotrye = 4;
				Tales[7].agrisen  = 2;
				Tales[7].lines = 630;
			
				Tales[8].tellerNum = 8;
				Tales[8].title = "Griselda's Test";
				Tales[8].gentillesse = 4;
				Tales[8].maistree = 3;
				Tales[8].harlotrye = 0;
				Tales[8].agrisen  = 3;
				Tales[8].lines = 1219;
						
				Tales[9].tellerNum = 9;
				Tales[9].title = "May in the Tree";
				Tales[9].gentillesse = 1;
				Tales[9].maistree = 3;
				Tales[9].harlotrye = 4;
				Tales[9].agrisen  = 1;
				Tales[9].lines = 1228;
				
				Tales[10].tellerNum = 10;
				Tales[10].title = "The Magic Horse";
				Tales[10].gentillesse = 5;
				Tales[10].maistree = 0;
				Tales[10].harlotrye = 2;
				Tales[10].agrisen  = 0;
				Tales[10].lines = 708;
			
				Tales[11].tellerNum = 11;
				Tales[11].title = "The Brittany Rocks";
				Tales[11].gentillesse = 5;
				Tales[11].maistree = 2;
				Tales[11].harlotrye = 0;
				Tales[11].agrisen  = 1;
				Tales[11].lines = 916;
			
				Tales[12].tellerNum = 12;
				Tales[12].title = "Virginia's Head";
				Tales[12].gentillesse = 2;
				Tales[12].maistree = 1;
				Tales[12].harlotrye = 2;
				Tales[12].agrisen  = 5;
				Tales[12].lines = 286;
			
				Tales[13].tellerNum = 13;
				Tales[13].title = "Death's Treasure";
				Tales[13].gentillesse = 0;
				Tales[13].maistree = 4;
				Tales[13].harlotrye = 4;
				Tales[13].agrisen  = 5;
				Tales[13].lines = 682;
			
				Tales[14].tellerNum = 14;
				Tales[14].title = "The Loan";
				Tales[14].gentillesse = 0;
				Tales[14].maistree = 4;
				Tales[14].harlotrye = 4;
				Tales[14].agrisen  = 2;
				Tales[14].lines = 452;			
			
				Tales[15].tellerNum = 15;
				Tales[15].title = "The Singing Boy";
				Tales[15].gentillesse = 5;
				Tales[15].maistree = 2;
				Tales[15].harlotrye = 2;
				Tales[15].agrisen  = 5;
				Tales[15].lines = 238;
			
				Tales[16].tellerNum = 16;
				Tales[16].title = "Sir Thopas";
				Tales[16].gentillesse = 3;
				Tales[16].maistree = 0;
				Tales[16].harlotrye = 5;
				Tales[16].agrisen  = 1;
				Tales[16].lines = 276;
			
				Tales[17].tellerNum = 16; //Chaucer tells two tales
				Tales[17].title = "Melibee";
				Tales[17].gentillesse = 4;
				Tales[17].maistree = 2;
				Tales[17].harlotrye = 0;
				Tales[17].agrisen  = 2;
				Tales[17].lines = 922;
			
				Tales[18].tellerNum = 17;
				Tales[18].title = "The Falls of Princes";
				Tales[18].gentillesse = 4;
				Tales[18].maistree = 1;
				Tales[18].harlotrye = 1;
				Tales[18].agrisen  = 3;
				Tales[18].lines = 878;
			
				Tales[19].tellerNum = 18;
				Tales[19].title = "Chaunticleer";
				Tales[19].gentillesse = 4;
				Tales[19].maistree = 3;
				Tales[19].harlotrye = 3;
				Tales[19].agrisen  = 2;
				Tales[19].lines = 878;
			
				Tales[20].tellerNum = 19;
				Tales[20].title = "St. Cecillia";
				Tales[20].gentillesse = 5;
				Tales[20].maistree = 0;
				Tales[20].harlotrye = 0;
				Tales[20].agrisen  = 5;
				Tales[20].lines = 553;
			
				Tales[21].tellerNum = 20;
				Tales[21].title = "The Foolish Alchemists";
				Tales[21].gentillesse = 1;
				Tales[21].maistree = 4;
				Tales[21].harlotrye = 4;
				Tales[21].agrisen  = 0;
				Tales[21].lines = 928;
			
				Tales[22].tellerNum = 21;
				Tales[22].title = "The Crow's Feathers";
				Tales[22].gentillesse = 3;
				Tales[22].maistree = 0;
				Tales[22].harlotrye = 1;
				Tales[22].agrisen  = 0;
				Tales[22].lines = 362;
			
				Tales[23].tellerNum = 22;
				Tales[23].title = "Penance";
				Tales[23].gentillesse = 5;
				Tales[23].maistree = 0;
				Tales[23].harlotrye = 0;
				Tales[23].agrisen  = 0;
				Tales[23].lines = 1096;
		}
	
		public static void chooseFirstTale(){
	
			System.out.println("\n" +CanterburyTales.userName + ", the pilgrims are asking you to decide whose\ntale should be told first.");
			System.out.println("\nTo help you decide, I'm going to ask you four questions.");
			System.out.println("These questions involve four key themes from medieval\nstorytelling: Gentillesse, Maistree, Harlotrye and Agrisen.");
			System.out.println("\nWould you like a definition of these?");
	
			int y = 0;
				while (y == 0) {
					System.out.print("Please enter 'Yes' or 'No': ");
					String defAnswer = decisionReader.nextLine();
				
						if (defAnswer.equals("Yes")){
							System.out.println("\n\t> Gentillesse means gentility or honourable virtue.\n\t  A tale full of Gentillesse is likely to test its\n\t  characters to prove they are pure and good.");
							System.out.println("\t> Maistree means mastery or superiority over others.\n\t  A tale full of Maistree is likely to involve\n\t  a battle of wits, strength or both.");
							System.out.println("\t> Harlotrye means ribaldry, foolishness and humour.\n\t  A tale full of Harlotrye will make you\n\t  laugh...or blush.");
							System.out.println("\t> Agrisen means to tremble or to grimace.\n\t  These tales will be gruesome and unsettling.");
							y++;
						}
					
						else if (defAnswer.equals("No")) {
							System.out.println("I see - this isn't your first pilgrimage, " + CanterburyTales.userName + "!");
							y++;
						}
					
						else {
							System.out.println("Sorry, I didn't catch that...");
						}
				}		
	
			System.out.println("\nTo what extent do you wish to hear a tale of Gentillesse?");
	
				while (gentAnswer < 0 || gentAnswer > 5) {
					System.out.print("Please enter a number between 0 and 5: ");
			
					while (!gentReader.hasNextInt()) {
						gentReader.next();
					}
				
					gentAnswer = gentReader.nextInt();
				}
	
			System.out.println("\nTo what extent do you wish to hear a tale of Maistree?");
	
				while (maisAnswer < 0 || maisAnswer > 5) {
					System.out.print("Please enter a number between 0 and 5: ");
			
					while (!maisReader.hasNextInt()) {
						maisReader.next();
					}
				
					maisAnswer = maisReader.nextInt();
				}
	
			System.out.println("\nTo what extent do you wish to hear a tale of Harlotrye?");
		
				while (harlAnswer < 0 || harlAnswer > 5) {
					System.out.print("Please enter a number between 0 and 5: ");
			
					while (!harlReader.hasNextInt()) {
						harlReader.next();
					}
		
					harlAnswer = harlReader.nextInt();
				}
	
			System.out.println("\nAnd finally, to what extent do you wish to hear a tale\nthat will make you Agrisen?");
	
				while (agrAnswer < 0 || agrAnswer > 5) {
					System.out.print("Please enter a number between 0 and 5: ");
			
					while (!agrReader.hasNextInt()) {
						agrReader.next();
					}
		
					agrAnswer = agrReader.nextInt();
				}
	
			scores = new int[Tales.length];
				for (int z = 0; z < (Tales.length); z++) {			
					scores[z] = Math.abs(((Tales[z].gentillesse) - gentAnswer))
								+ Math.abs(((Tales[z].maistree) - maisAnswer))
								+ Math.abs(((Tales[z].harlotrye) - harlAnswer))
								+ Math.abs(((Tales[z].agrisen) - agrAnswer));
				}	
			
			int lowestscore = scores[0];
				for (a = 1; a < Tales.length; a++) {
				
					if (lowestscore >= scores[a]) {
						lowestscore = scores[a];
						currentTIndex = a;
					}
					
					System.out.println("\nI see...\nLet's start our journey by hearing " +  Pilgrim.Pilgrims[Tales[Tale.currentTIndex].tellerNum].getPilgrimName() + " tell\nthe tale of " + Tales[currentTIndex].title + ".");
				
					readTale();		
				}			
		}
	
		public static void readTale(){
	
			System.out.println("\nThe tale is told...\n...\n...");
		
			distance = ( ( (Tales[currentTIndex].lines) / (Pilgrim.Pilgrims[Tales[currentTIndex].tellerNum].getLinesPerHour()) ) * Journey.getSpeed() );
		
			distance = Math.round(((((double)Tales[currentTIndex].lines) / (Pilgrim.Pilgrims[Tales[currentTIndex].tellerNum].getLinesPerHour())) * Journey.getSpeed() ));
		
			System.out.println("Amen! What a tale that was...");
		
			Journey.checkDistance();		
		}
	
		public static void nextTale(){
			System.out.println("\nShall we hear another tale to pass the time?");
			int y = 0, z = 0;
			
				while (y == 0){
					System.out.println("Please enter 'Yes' or 'No':");
					String defAnswer = decisionReader.nextLine();
						if (defAnswer.equals("Yes")){
							currentTIndex++;
						
							if (currentTIndex == Tales.length) {
								currentTIndex = 0;
							}	
						
							if (currentTIndex == a) {
								currentTIndex++;
							}
							
							System.out.println("\n" + Pilgrim.Pilgrims[Tales[Tale.currentTIndex].tellerNum].getPilgrimName() + " jumps in to tell the tale of " + Tales[currentTIndex].title + ".");		
							y++;			
						
							readTale();
					
						}
			
					else if (defAnswer.equals("No")){
				
				  		if (z > 0) {
							System.out.println("Farewell, " + CanterburyTales.userName + "!");
							System.exit(0);
						}
						System.out.println("The journey will be quite dull without tale-telling...\nwill you reconsider?");
						z++;
					}
			
					else {
						System.out.println("Sorry, I didn't catch that...");
					}
				}		
		}
	}

 
package CantTales;

	public class Journey {
		public final static int PILGRIMAGE_MILES = 55, TRAVELLING_MPH = 5;
		static int distanceTravelled = 0, distanceRemaining = 55;

		public int getPilgrimageMiles(){
			return PILGRIMAGE_MILES;
		}

		public static int getSpeed(){
			return TRAVELLING_MPH;
		}

		public int getRemaining(){
			return distanceRemaining;
		}

	public static void checkDistance(){	
	
		distanceTravelled += Tale.getDistance();
		distanceRemaining = (PILGRIMAGE_MILES - distanceTravelled);
		System.out.println("\nThe journey from the Tabard Inn, Southwark to Canterbury\nCathedral is " + PILGRIMAGE_MILES + " miles.");
		System.out.print("\nWe just travelled " + (int)Tale.getDistance() + " miles");	
	
		if (distanceTravelled < PILGRIMAGE_MILES) {
			System.out.println(" and have " + distanceRemaining + " miles left to go.");
			Tale.nextTale();
	
		} 
		else {
			System.out.print("...");
			System.out.println("\nCongratulations! You have reached Canterbury Cathedral!");
			System.out.println("Farewell, " + CanterburyTales.userName + "!");
			System.exit(0);
		}
	}
}
