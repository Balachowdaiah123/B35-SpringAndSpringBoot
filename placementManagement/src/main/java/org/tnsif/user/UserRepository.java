package org.tnsif.user;

import org.springframework.data.jpa.repository.JpaRepository;
/*JPAReposirary is existing in Spring Data JPA dependenceies and it contains all t
 * he CURD operation of Spring JPA
 */
public interface UserRepository extends JpaRepository<User,Integer>{

}
