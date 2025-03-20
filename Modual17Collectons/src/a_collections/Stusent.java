package a_collections;

public class Stusent implements Comparable<Stusent>{
    private String name;
    private Integer age;
    private String gard;
    private Integer score;

    public Stusent() {
    }

    public Stusent(String name, Integer age, String gard, Integer score) {
        this.name = name;
        this.age = age;
        this.gard = gard;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGard() {
        return gard;
    }

    public void setGard(String gard) {
        this.gard = gard;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Stusent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gard='" + gard + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Stusent o) {
        return this.getScore()-o.getScore();
    }
}
