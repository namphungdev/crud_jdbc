package AppleShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import AppleShop.Dao.SizeDao;

import AppleShop.Entity.Size;

@Service
@Transactional
@Component
public class SizeService implements ISizeService{
	@Autowired
	private SizeDao sizeDao;
	public List<Size> findAll() {
	    return sizeDao.findAll();
	  }
	@Override
	public Size findById(int id) {
		// TODO Auto-generated method stub
		return sizeDao.findById(id);
	}
	@Override
	public void save(Size size) {
		// TODO Auto-generated method stub
		sizeDao.save(size);
	}
	@Override
	public void update(Size size) {
		// TODO Auto-generated method stub
		sizeDao.update(size);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		sizeDao.delete(id);
	}
}
