/**
 * 
 */
package info.inetsolv.springDemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author hp
 *
 */
public class Customer {
	
	private String fname;
	
	
	@NotNull(message=" is required")
	@Size(min=2)
	private String lname;
	
	@Min(value=0, message="must be greater than zero")
	@Max(value=10, message="must be lesser than ten")
	private int freePasses;

	/**
	 */
	public Customer() {
		
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the freePasses
	 */
	public int getFreePasses() {
		return freePasses;
	}

	/**
	 * @param freePasses the freePasses to set
	 */
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	

}
