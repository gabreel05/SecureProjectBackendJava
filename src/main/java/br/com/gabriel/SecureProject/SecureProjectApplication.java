package br.com.gabriel.SecureProject;

import br.com.gabriel.SecureProject.model.Gender;
import br.com.gabriel.SecureProject.model.User;
import br.com.gabriel.SecureProject.model.Vacancy;
import br.com.gabriel.SecureProject.repository.UserRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecureProjectApplication implements CommandLineRunner {
	private final UserRepository userRepository;

	@Autowired
	public SecureProjectApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SecureProjectApplication.class, args);
	}

	@Override
	public void run(String... args) {
		User user = new User("Gabriel", "999.999.999-99", "gabriel@email.com",
				"(99) 99999-9999", Gender.MALE, Vacancy.SECURITY, DigestUtils.sha256Hex("Gabriel1@"));

		userRepository.save(user);
	}
}
