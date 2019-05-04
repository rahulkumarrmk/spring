/**
 * 
 */
package info.inetsolv.springDemo.mvc;

import java.util.LinkedHashMap;

/**
 * @author hp
 *
 */
public class Student {
	
	private String fname;
	private String lname;
	private String country;
	private int i;
	
	private LinkedHashMap<String, String> countryOptions;
	
	//private LinkedHashMap<String, String> countryOptions= new LinkedHashMap<>();
	
	private String favoriteLanguage;
	
	private String operatingSystems;
	
	
	
	public Student() {
		//populate country options: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("GR", "Germany");
		countryOptions.put("IN", "India");
		
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
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the countryOptions
	 */
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	/**
	 * @param countryOptions the countryOptions to set
	 */
	public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	/**
	 * @return the favoriteLanguage
	 */
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	/**
	 * @param favoriteLanguage the favoriteLanguage to set
	 */
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	/**
	 * @return the operatingSystems
	 */
	public String getOperatingSystems() {
		return operatingSystems;
	}

	/**
	 * @param operatingSystems the operatingSystems to set
	 */
	public void setOperatingSystems(String operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	
	
	
	
	

}
