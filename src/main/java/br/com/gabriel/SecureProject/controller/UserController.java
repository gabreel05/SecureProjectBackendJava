package br.com.gabriel.SecureProject.controller;

import br.com.gabriel.SecureProject.mapper.request.SignInRequest;
import br.com.gabriel.SecureProject.mapper.response.UserSignInResponse;
import br.com.gabriel.SecureProject.model.User;
import br.com.gabriel.SecureProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/signIn")
    public ResponseEntity<UserSignInResponse> signIn(@RequestBody SignInRequest signInRequest) {
        User user = userRepository.findByEmailAndPassword(signInRequest.getEmail(), signInRequest.getPassword());

        return ResponseEntity.ok(new UserSignInResponse(user));
    }
}
