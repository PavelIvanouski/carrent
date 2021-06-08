package myapp.model.entity;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Car {

    private int id;

    private int modelId;

    private String vin;

    private String stateNum;

    private String color;

    private String year;

    private boolean climateControl;

    private boolean cruiseControl;

    private boolean panoramicRoof;

}
