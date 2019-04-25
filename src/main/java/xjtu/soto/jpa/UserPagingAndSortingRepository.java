package xjtu.soto.jpa;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserPagingAndSortingRepository  extends PagingAndSortingRepository<User,Long> {
}
