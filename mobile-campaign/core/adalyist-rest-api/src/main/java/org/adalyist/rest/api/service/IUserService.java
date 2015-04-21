package org.adalyist.rest.api.service;

import org.adalyist.rest.api.to.UserTO;

public interface IUserService {
	public  UserTO authenticateUser(String user,String passcode);
}
