package org.myazure.weixin.repository;

import org.myazure.weixin.domain.MaUser;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 
 * @author WangZhen
 *
 */
public interface MaUserRepository extends PagingAndSortingRepository<MaUser, Long> {

    MaUser findOneByUserName(String userName);
}
