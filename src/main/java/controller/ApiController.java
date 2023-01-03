package controller;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.model.Author;
import com.example.library.model.Book;
import com.example.library.repository.AuthorRepository;

import userRepository.UserRepository;





@RestController
@RequestMapping("api")

public class ApiController {
	
	@Autowired private UserRepository UserRepository;
	@PostMapping(value="/addUser")
	public boolean addBook(@RequestParam Map<String, String> params) {
		//System.out.println(params);
		try {
			UseR user = new UseR(params.get("nome"), params.get("cognome"));
			long author_id = Long.parseLong(params.get("author"));
			Author author=authorRepository.findById(author_id).orElse(null);
			if (author!=null) {
				book.setAuthor(author);
				bookRepository.save(book);
				return true;
			}
			
			} 
			
			catch (NumberFormatException e){
				e.printStackTrace();
				
			}
			return false;
	
	

}
