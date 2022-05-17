package ai.jobiak.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	
@RequestMapping(value = "user",method=RequestMethod.GET)
public String message(ModelMap map)
{
	map.put("user","root");
	map.put("pass","admin");
	map.put("otp","1546");
	
	return "view";
}

}
