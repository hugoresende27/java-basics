public class StudentA {

    String firstName;
    String lastName;
    String major;
    int yearGrad;
    double GPA;

    public StudentA(String firstName,
                    String lastName,
                    String major,
                    int yearGrad,
                    double GPA)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.yearGrad = yearGrad;
        this.GPA = GPA;
    }

    public void incrementExpeGradYear()
    {
        this.yearGrad++;
    }
}
