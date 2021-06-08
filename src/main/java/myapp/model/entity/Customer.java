package myapp.model.entity;

import lombok.*;


import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Customer {

    private int id;

    private String login;

    private String password;

    private String firstName;

    private String lastName;

    private String passport;

    private boolean active;

    private List<Role> roles;

}
