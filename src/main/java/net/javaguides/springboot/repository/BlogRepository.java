package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.BlogPojo;

@Repository
public interface BlogRepository extends JpaRepository<BlogPojo, Long>{
//	@Query(value = "SELECT * FROM Users ORDER BY id", countQuery = "SELECT count(*) FROM Users", nativeQuery = true)
//	Page<User> findAllUsersWithPagination(Pageable pageable);
//

}
