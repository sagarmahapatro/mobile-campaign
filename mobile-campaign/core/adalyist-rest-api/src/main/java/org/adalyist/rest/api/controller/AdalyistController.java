package org.adalyist.rest.api.controller;

import org.adalyist.rest.api.service.IUserService;
import org.adalyist.rest.api.service.impl.UserService;
import org.adalyist.rest.api.to.ResultTO;
import org.adalyist.rest.api.to.UserTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdalyistController {
	IUserService userService = null;
	public AdalyistController()
	{
		userService = new UserService();
	}
	 @RequestMapping("/authenticate")
	    public ResultTO<UserTO> authenticate(@RequestParam(value="userId", defaultValue="") String userId, @RequestParam(value="passcode", defaultValue="") String passcode) {
		 ResultTO<UserTO> resultTO = new ResultTO<UserTO>(userService.authenticateUser(userId, passcode));   
		 return resultTO;
	    }
}
