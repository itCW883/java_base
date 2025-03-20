package b_Stram;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class a_Person {
    private String name;
    private Integer age;

    @Override
    public boolean equals(Object object) {


        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        a_Person aPerson = (a_Person) object;
        return Objects.equals(name, aPerson.name) && Objects.equals(age, aPerson.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
