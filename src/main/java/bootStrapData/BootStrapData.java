package bootStrapData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import userRepository.UserRepository;

@Component
public class BootStrapData implements CommandLineRunner {
	
	@Autowired
	private UserRepository UserRepository;
	@Override
	public void run(String... args) throws Exception {
		UseR userMarco = new UseR ("Marco","Rossi");
		UserRepository.save(userMarco);
		
	}

}
