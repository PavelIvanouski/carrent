package myapp.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table
public class Engine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "engine", cascade = CascadeType.ALL)
    private List<Model> models;


}
