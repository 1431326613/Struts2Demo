
import com.opensymphony.xwork2.ActionSupport;

public class HelloStruts2Action extends ActionSupport {
	
	
	
	  @Override
	    public String execute() throws Exception {
	        System.out.println("执行Action");
	        
	        return SUCCESS;
	    }
	    
	    
	    public String login() {
	        return SUCCESS;
	    }

}
