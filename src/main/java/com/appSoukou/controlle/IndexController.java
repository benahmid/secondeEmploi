package com.appSoukou.controlle;

import javax.mail.MessagingException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	 @RequestMapping("/")
	 @ResponseBody
		public String index() throws MessagingException {
	    	
	    	
			return "indexAuthentification";
		}

}
