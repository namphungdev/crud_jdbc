package AppleShop.Service.User;



import org.springframework.stereotype.Service;

import AppleShop.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetPaginates(int totalData, int limit, int currentPage) ;
}
