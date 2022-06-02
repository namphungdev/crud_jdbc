package AppleShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppleShop.Dao.UsersDao;
import AppleShop.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService{
	private static final String CheckUsernameAccount = null;
	@Autowired 
	 UsersDao usersDao = new UsersDao();
	
	@Override
	public int AddAccount(Users user) {
//		 user = usersDao.GetUserByAcc(user);
//		if(user == null) {
//			user.setUsername(user.getUsername());
//			user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)) );
//			return usersDao.AddAccount(user);	
//		}else {
//			return 0;
////		}
//		 String check = usersDao.GetUserByUsername(user);
//		 Integer number = Integer.valueOf(check);
//		 if(check <= 0) {
//			 user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)) ); 
//		 }	
		 user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)) ); 
		return usersDao.AddAccount(user);	
			
		
					
	}
	
	@Override
 	public Users CheckAccount(Users user) {
		String pass =  user.getPassword();		
		user = usersDao.GetUserByAcc(user);
		if(user != null) {
			if( BCrypt.checkpw(pass, user.getPassword())) {
				return user;
			}else {
				return null;				
			}
		}
		return null;
	}
//	@Override
// 	public list<Bill> CheckUsernameAccount(Users user) {
//		int check = usersDao.GetUserByUsername(user);	
//		return check;
//	}
	

	
}
