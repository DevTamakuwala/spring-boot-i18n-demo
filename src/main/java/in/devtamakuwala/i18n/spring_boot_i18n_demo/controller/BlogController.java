package in.devtamakuwala.i18n.spring_boot_i18n_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.devtamakuwala.i18n.spring_boot_i18n_demo.model.BlogModel;
import in.devtamakuwala.i18n.spring_boot_i18n_demo.service.BlogService;
import in.devtamakuwala.smarti18nauto.annotation.AutoTranslate;

@RestController()
@RequestMapping("/api/")
@AutoTranslate
@CrossOrigin(origins = { "http://localhost:3000", "https://i18n.webdemo.devtamakuwala.in" })
public class BlogController {

	@Autowired
	private BlogService blogService;

	@PostMapping("blogs")
	public ResponseEntity<BlogModel> addNewBlog(@RequestBody BlogModel blog) {
		return blogService.addBlog(blog);
	}

	@GetMapping("blogs")
	public ResponseEntity<List<BlogModel>> getAllBlogs() {
		return blogService.getAllBlogs();
	}

}
