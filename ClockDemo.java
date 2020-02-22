import java.util.*;


public class ClockDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter seconds for first clock: \n");
		int s1 = input.nextInt();
		
		Clock firstClock = new Clock(s1);
		  
		
		for(int i=1; i<= 10; i++){
			firstClock.tick();
			System.out.println(firstClock.toString());
			
		}
		
		 System.out.println("enter hours for second clock: ");
		 int h = input.nextInt();
		 System.out.println("enter minutes for second clock: ");
		 int m = input.nextInt();
		 System.out.println("enter seconds for second clock: ");
		 int s = input.nextInt();
		 
		 Clock secondClock = new Clock(h,m,s);
		 
		 for(int i= 1; i<= 10; i++){
			 secondClock.tick();
			 System.out.println(secondClock.toString());
		 }
		 firstClock.addClock(secondClock);
		 System.out.println("Adding first clock and second clock gives:"+ firstClock.toString());
		 
		 System.out.println("Time in First clock:"+ firstClock.toString());
		 System.out.println("Time in second clock:" +secondClock.toString());
		 
		 Clock thirdClock = new Clock(0,0,0);
		 thirdClock = firstClock.subtractClock(secondClock);
		 System.out.println("Difference of first and second clock:"+thirdClock.toString());
		 input.close();
	}
}
