package in.devtamakuwala.i18n.spring_boot_i18n_demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.devtamakuwala.i18n.spring_boot_i18n_demo.model.BlogModel;
import in.devtamakuwala.i18n.spring_boot_i18n_demo.repository.BlogReposiroty;

@Service
public class BlogService {

	@Autowired
	private BlogReposiroty blogReposiroty;

	public ResponseEntity<BlogModel> addBlog(BlogModel blog) {
		blog.setCreated_at(LocalDateTime.now());
		BlogModel savedBolg = blogReposiroty.save(blog);
		return new ResponseEntity<BlogModel>(savedBolg, HttpStatus.CREATED);
	}
	
	public ResponseEntity<List<BlogModel>> getAllBlogs() {
		List<BlogModel> fetchedBlog = blogReposiroty.findAll();
		return new ResponseEntity<List<BlogModel>>(fetchedBlog ,HttpStatus.FOUND);
	}

}
