package AppleShop.Service.User;

import org.springframework.stereotype.Service;

import AppleShop.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);
	
	public Users  CheckAccount(Users user);

//	public int CheckUsernameAccount(Users user);

	

	/* public boolean CheckUser(Users user); */
}