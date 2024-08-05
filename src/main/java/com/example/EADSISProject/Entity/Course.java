import jakarta.persistence.Id;

public class Course {
    @Id
    private String courseCode;
    private String courseName;
    private int credits;

    // Constructors, Getters, and Setters
}
