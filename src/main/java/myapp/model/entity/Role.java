package myapp.model.entity;

import lombok.*;


import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Role {

    private int id;

    private String name;

    private List<Customer> customers;

}
