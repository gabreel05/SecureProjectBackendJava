package br.com.gabriel.SecureProject.mapper.response;

import br.com.gabriel.SecureProject.model.User;
import lombok.Getter;

@Getter
public class UserSignInResponse {
    private final Long id;
    private final String email;
    private final String password;

    public UserSignInResponse(User user) {
        this.id = user.getId();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
