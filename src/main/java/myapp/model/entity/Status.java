package myapp.model.entity;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Status {

    private int id;

    private String name;


}
