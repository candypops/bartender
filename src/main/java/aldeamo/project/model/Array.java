package aldeamo.project.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "arrays")
public class Array {

    @Id
    private Long id;

    @Column(name = "input_array")
    private String inputArray;

}
