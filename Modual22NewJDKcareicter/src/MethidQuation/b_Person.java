package MethidQuation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class b_Person {
    private String name;
    private Integer age;

    public b_Person(String name) {
        this.name = name;
    }
}
