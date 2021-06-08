package myapp.model.entity;

import lombok.*;


import java.time.Instant;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Rent {

    private int id;

    private int carId;

    private int customerId;

    private int statusId;

    private Instant rentBegin;

    private Instant rentEnd;

}
