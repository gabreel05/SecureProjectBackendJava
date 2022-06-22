package br.com.gabriel.SecureProject.mapper.request;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
public class SignInRequest {
    @Email
    private String email;
    @NotBlank
    private String password;
}
