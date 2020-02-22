
public class Clock {
   private int hours;
   private int minutes;
   private int seconds;
   
   public Clock(){ //First Constructor
	   this.hours = 12;
	   this.minutes = 0;
	   this.seconds = 0;
   }
   
   
   public Clock(int hours, int minutes, int seconds){ //Second Constructor
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
   }
   
   public Clock(int totalSec){ //Third Constructor
	   this.seconds = totalSec%60;
	   int totalMinutes = totalSec/60;
	   this.minutes = totalMinutes%60;
	   this.hours = totalMinutes/60;
   }
   
   public void setClock(int totalSec){
	   this.seconds = totalSec%60;
	   int totalMinutes = totalSec/60;
	   this.minutes = totalMinutes%60;
	   this.hours = totalMinutes/60;
   }
   
   public int getHours(){
	   return this.hours;
   }
   
   public void setHours(int hours){
		   this.hours = hours;
   }
   
   public int getMinutes(){
	   return this.minutes;
   }
   
   public void setMinutes(int minutes){
		   this.minutes = minutes;
   }
   
   public int getSeconds(){
	   return this.seconds;
   }
   
   public void setSeconds(int seconds){
	   this.seconds = seconds;
   }
   
   public void tick(){
	   this.seconds = (this.seconds+1)%60;
	   if(this.seconds > 59){
		   this.seconds =0;
		   this.minutes = this.minutes+1;
	   if (this.minutes > 59){
		   this.minutes = 0;
		   this.hours = this.hours +1;
	   }   if(this.hours > 23){
		   this.hours = 0;
	   }
	   }
   }
   
   public void addClock( Clock secondClock ) {     
		this.seconds += secondClock.getSeconds();      
		this.minutes += secondClock.getMinutes(); 
		this.hours += secondClock.getHours();
		this.seconds = this.seconds % 60;
	 	this.minutes += this.seconds/60;      
	 	this.minutes = this.minutes % 60;   
	    this.hours += this.minutes/60;  
	    this.hours = this.hours % 24;   
	} 

   
   public String toString() {
	    // military time
	      return this.hours +":"+this.minutes+":"+this.seconds;
	      
	}
 
   
   public void tickDown() { 
		this.seconds -= 1; 
		if (this.seconds < 0) { 
			this.seconds +=60; 
			this.minutes -=1; 
		} 
		if (this.minutes < 0) { 
			this.minutes +=60; 
			this.hours -=1; 
		} 
		if (this.hours < 0) { 
			this.hours  += 24; 
		} 
	} 
   
   public Clock subtractClock(Clock secondClock)
   {
        Clock difference = new Clock(0, 0, 0);
        if (secondClock.seconds > this.seconds){
            -- this.minutes;
            this.seconds += 60;
        }
        difference.seconds = this.seconds - secondClock.seconds;
        if (secondClock.minutes > this.minutes) {
            -- this.hours;
            this.minutes += 60;
        }
       difference.minutes = this.minutes - secondClock.minutes;
       difference.hours   = this.hours - secondClock.hours;
       return difference;
    }

	   
}
   
   

