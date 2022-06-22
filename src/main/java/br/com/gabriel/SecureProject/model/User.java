package br.com.gabriel.SecureProject.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String document;
    @NonNull
    private String email;
    @NonNull
    private String phone;
    @Enumerated(value = EnumType.STRING)
    @NonNull
    private Gender gender;
    @Enumerated(value = EnumType.STRING)
    @NonNull
    private Vacancy vacancy;
    @NonNull
    private String password;
}
