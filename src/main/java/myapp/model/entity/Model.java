package myapp.model.entity;

import lombok.*;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Model {

    private int id;

    private String name;

    private int seatsNum;

    private int engineVolume;

    private int engineId;

    private int typeId;

    private boolean autoTransmission;

}
