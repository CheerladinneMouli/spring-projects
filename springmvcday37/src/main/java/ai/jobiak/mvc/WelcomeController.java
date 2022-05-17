package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController {
	
@RequestMapping(value = "come",method=RequestMethod.GET)
public String message(ModelMap map)
{
	map.put("msg1","Welcome to Spring MVC Programming");
	map.put("msg2","this is mvc program");
	map.put("msg3","My name is mouli");
	
	return "welcome";
}

}
