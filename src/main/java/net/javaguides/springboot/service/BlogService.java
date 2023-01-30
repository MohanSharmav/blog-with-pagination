package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.BlogPojo;

public interface BlogService {
	List<BlogPojo> getAllEmployees();
	
	Page<BlogPojo> findPaginated(int pageNo, int pageSize);
}
