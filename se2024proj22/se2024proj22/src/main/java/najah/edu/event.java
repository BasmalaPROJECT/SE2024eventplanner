package najah.edu;
import java.util.Date;
import java.lang.*;

public class event {

	public int eventId;
	public String date ;
	public int time;
	public String location;
	public String description;
	
	public event (int eventId,String date,int time,String location,String description ) {
		 this.eventId=eventId;
		 this.date=date;
		 this.time=time;
		 this.location=location;
		 this.description=description;
	}
	 

	public void seteventId(int eventId) {
		this.eventId=eventId;
	}
	
	public int geteventId() {
		return eventId;
	}
	
	 
    public void printevent(int eventId) {

    	System.out.print("The Date of event is "+date+"" );
    	System.out.print("The Time of event is "+time+"" );
    	System.out.print("The location of event is "+location+"" );
    	System.out.print("The Description of event is "+description+"" );

    	
    }
	
}
