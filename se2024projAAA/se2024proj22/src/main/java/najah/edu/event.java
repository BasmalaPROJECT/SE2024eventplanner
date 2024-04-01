package najah.edu;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.*;

public class event {

	public int eventId;
	public String date ;
	public int time;
	public String location;
	public String description;
	List<event> events = new ArrayList<>();
	
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

	public void settime(int time) {
		this.time=time;
	}
	public int gettime() {
		return time;
	}
	
	public void setlocation(String location) {
		this.location=location;
	}
	public String getlocation() {
		return location;
	}
	public void setdescription(String description) {
		this.description=description;
		}
	
	public String getdescription() {
		return description;
	}
	
    public void printevent(int eventId) {

    	System.out.print("The Date of event is "+date+"" );
    	System.out.print("The Time of event is "+time+"" );
    	System.out.print("The location of event is "+location+"" );
    	System.out.print("The Description of event is "+description+"" );

    	
    }
	
}
