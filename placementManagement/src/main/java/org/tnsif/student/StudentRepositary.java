package org.tnsif.student;

import org.springframework.data.jpa.repository.JpaRepository;


/*JPARepositary is exists in spring data JPA dependencies and it contains 
 * all the CRUD operations of spring JPA*/


public interface StudentRepositary extends JpaRepository<Student,Integer>{

}
