import java.util.Scanner;
public class Baseball_Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);			
		
		//USER INPUTS
		/*
		 * Player Name = PN
		 * At Bats == AB
		 * Hits == H
		 * Singles == B1
		 * Doubles == B2
		 * Triples == B3
		 * Home Runs == HR
		 * Runs == R
		 * Walks == BB
		 * Hit by Pitch == HP
		 * Sacrifice Flies = SF
		 */
		System.out.println("Enter Player name");
		String PN = scan.next();
		System.out.println("Player name: "+PN);
		System.out.println("Enter At Bats");
		double AB = scan.nextDouble();
		System.out.println("At Bats: "+AB);
		System.out.println("Enter Hits");
		double H = scan.nextDouble();
		System.out.println("Hits: "+H);
		System.out.println("Enter Doubles");
		double B2 = scan.nextDouble();
		System.out.println("Doubles: "+B2);
		System.out.println("Enter Triples");
		double B3 = scan.nextDouble();
		System.out.println("Triples: "+B3);
		System.out.println("Enter Home Runs");
		double HR = scan.nextDouble();
		System.out.println("Home Runs: "+HR);
		System.out.println("Runs");
		double R = scan.nextDouble();
		System.out.println("Runs: "+R);
		System.out.println("Enter Walks");
		double BB = scan.nextDouble();
		System.out.println("Walks: "+BB);
		System.out.println("Enter Hits by Pitch");
		double HP = scan.nextDouble();
		System.out.println("Hit by Pitch: "+HP);
		System.out.println("Enter Sacrifice Flies");
		double SF = scan.nextDouble();
		System.out.println("Sacrifice Flies :"+SF);
		double B1 = (H-(B2+B3+HR));
		System.out.println("Singles: "+B1);
		
		/*CALCULATIONS
		 * Batting Average == BA
		 * On base percentage == OBP
		 * Slugging percentage == SLG
		 * On base + slugging percentage == OBS
		 * Total bases == TB
		 * 
		 */
		double BA = H/AB;
		//System.out.println("Batting Average: "+BA);
		double OBP = (H+BB+HP)/(AB+BB+HP+SF);
		//System.out.println("On Base Percentage: "+OBP);
		double SLG = (B1+(B2*2)+(B3*3)+(HR*4))/AB;
		//System.out.println("Slugging Percentage: "+SLG);
		double OBS = (OBP+SLG);
		//System.out.println("On Base Percentage + Slugging Percentage: "+OBS);
		double TB = (B1+(B2*2)+(B3*3)+(HR*4));
		//System.out.println("Total Bases: "+TB);
		
		System.out.println(PN+" stats: ");
		System.out.println("Batting Average: "+BA);
		System.out.println("On Base Percentage: "+OBP);
		System.out.println("Slugging Percentage: "+SLG);
		System.out.println("On Base Percentage + Slugging Percentage :"+OBS);
		System.out.println("Total Bases:"+TB);
	}

}
