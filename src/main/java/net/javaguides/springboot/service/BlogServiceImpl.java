package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.BlogPojo;

import net.javaguides.springboot.repository.BlogRepository;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogRepository blogRepository;

	@Override
	public List<BlogPojo> getAllEmployees() {
		return blogRepository.findAll();
	}

	

	@Override
	public Page<BlogPojo> findPaginated(int pageNo, int pageSize) {
		
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return this.blogRepository.findAll(pageable);
	}
}
