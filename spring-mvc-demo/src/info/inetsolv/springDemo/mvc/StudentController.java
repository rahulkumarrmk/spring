/**
 * 
 */
package info.inetsolv.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hp
 *
 */

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showform")
	public String showForm(Model theModel) {
		
		//create student object
		
		Student student = new Student();
		//add student object to the model
		
		theModel.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute("student") Student student) {
		return "student-confirmation";
		
	}
	
	
}
