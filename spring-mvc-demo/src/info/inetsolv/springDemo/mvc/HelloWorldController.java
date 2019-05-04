/**
 * 
 */
package info.inetsolv.springDemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hp
 *
 */

@Controller
public class HelloWorldController {

	// need a controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// need a controller method process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// need a controller method to read form data and
	// add data to the model

	@RequestMapping("/processformtwo")
	public String letsShoutDude(HttpServletRequest request,Model model)  {
		// read the request parameter from the html form data
		String theName = request.getParameter("studentTwo");

		// convert the all data to upper case
		theName = theName.toUpperCase();

		// create the message
		String result = "yo!" + theName;

		// add meassge to the model
		model.addAttribute("message", result);
	   
		System.out.println(result);
		return "helloworld";

	}
	
	@RequestMapping("/processformthree")
	public String processFormThree(@RequestParam("studentThree") String theName,Model model)  {
		// read the request parameter from the html form data
		//String theName = request.getParameter("studentName");

		// convert the all data to upper case
		theName = theName.toUpperCase();

		// create the message
		String result = "yo!" + theName;

		// add message to the model
		model.addAttribute("messageThree", result);
	   
		System.out.println(result);
		return "helloworld";

	}

}
