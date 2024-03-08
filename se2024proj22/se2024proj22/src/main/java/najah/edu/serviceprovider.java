package najah.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class serviceprovider {

	public serviceprovider () {}
	Logger logger = Logger.getLogger(event.class.getName());
	protected List<event> findByNameevent = new ArrayList<event>();

	public boolean addevent(event newevent) {
        for (event oldevent : findByNameevent) {
            if (oldevent.geteventId() == (newevent.geteventId())) {
                logger.log(Level.INFO, "event is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "EVENT will added to list");
        findByNameevent.add(newevent);
        return false;


    }
	
	public boolean deleteevent(int eventId){
        for(event existevent : findByNameevent){
            if(existevent.geteventId()== (eventId)){
                logger.log(Level.INFO,"Exist");
                findByNameevent.removeIf(n -> {
					int i = eventId;
					return (n.geteventId() == i);
				});
                return true;
            }}
        logger.log(Level.INFO,"Not Exist");
        return false;
    }
	
	public boolean searchevent(int eventId){
        for(event existevent : findByNameevent){
            if(existevent.geteventId() == (eventId)){
                logger.log(Level.INFO,"Exist");
                return true;
            }
        }
        logger.log(Level.INFO,"Not Exist");
        return false;
    }




    public boolean updateevent(event toUpdate,int eventId){
        int neededIndex = 0;
        for(event event : findByNameevent) {
            boolean temp = searchevent(eventId);
            if(temp){
                return  true;
            }}findByNameevent.set(neededIndex-1,toUpdate);
            return false;
        }
  
	
}
    