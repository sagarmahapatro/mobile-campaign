package org.adalyist.rest.api.service.impl;

import org.adalyist.rest.api.service.IUserService;
import org.adalyist.rest.api.to.UserTO;
import org.adalyist.rest.api.util.TokenGenerator;

public class UserService  implements IUserService	{
     
	public  UserTO authenticateUser(String user,String passcode){
		String token = TokenGenerator.generate();
		UserTO userTO = new UserTO(token ,"sagar", "mahapatro","sagarmahapatro@gmail.com");	
	   return userTO;
	}
}
