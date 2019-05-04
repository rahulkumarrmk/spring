/**
 * 
 */
package info.inetsolv.springDemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hp
 *
 */

@Controller

public class HomeController {

	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}
}
