package cherniva.springframework.fitapp.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String exerciseName;
    private String description;
    private int numReps;
    private int currentWeight;

    public Exercise(String exerciseName, String description, int numReps, int currentWeight) {
        this.exerciseName = exerciseName;
        this.description = description;
        this.numReps = numReps;
        this.currentWeight = currentWeight;
    }

    public Exercise(String exerciseName, String description) {
        this(exerciseName, description, 0, 0);
    }

    public Exercise(String exerciseName) {
        this(exerciseName, "");
    }
}
