package cherniva.springframework.fitapp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Set {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private int numOfSets;
    private int startWeight;
    private int[] weightProgression;

    public Set(int numOfSets, int startWeight, int[] weightProgression) {
        this.numOfSets = numOfSets;
        this.startWeight = startWeight;
        this.weightProgression = weightProgression;
    }

    public Set(int numOfSets, int startWeight) {
        this(numOfSets, startWeight, new int[numOfSets]);
    }

    public Set(int numOfSets) {
        this(numOfSets, 0);
    }
}
