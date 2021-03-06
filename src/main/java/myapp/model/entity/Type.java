package myapp.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private List<Model> models;


}
