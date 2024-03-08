package najah.edu;
import najah.edu.event;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class user {
	private int id ;
    private String name ;
    private String phone ;
    private String address ;
    private String email;
   
	protected List<event> findByNameevent = new ArrayList<event>();

    
    public user(){}
    public user(int id , String name , String phone , String address , String email ){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        
    }

    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    
   
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail(){
    	return email;
    	}
    
    public user adduser(){
        return new user(id,name,phone,address,email) ;
    }
    
    public boolean searcheventbyeventId(int eventId){
        for(event existevent : findByNameevent){
            if(existevent.geteventId()==(eventId)){
                return true;
            }
        }
        return false;
    }
   
    
   
}