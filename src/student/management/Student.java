package student.management;

import java.time.LocalDate;

public class Student {
    private String id;
    private String fullName;
    private LocalDate birthDate;
    private double cpa;

    public Student(String id, String fullName, LocalDate birthDate, double cpa) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.cpa = cpa;
    }

    public Student(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getCpa() {
        return cpa;
    }

    public void setCpa(double cpa) {
        this.cpa = cpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", cpa=" + cpa +
                '}';
    }
}
