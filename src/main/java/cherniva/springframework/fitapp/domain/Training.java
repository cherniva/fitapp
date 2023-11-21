package cherniva.springframework.fitapp.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;

@Entity
@Data
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String trainingName;

    private String description;

    @ManyToMany
    @MapKeyJoinColumn(name = "training_fk")
    @JoinTable(name = "training_exercise",
        joinColumns = @JoinColumn(name = "exercise_fk"),
        inverseJoinColumns = @JoinColumn(name = "set_fk"))
    private HashMap<Exercise, Set> exerciseSetsMap;
}
