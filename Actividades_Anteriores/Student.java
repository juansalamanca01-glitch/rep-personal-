public class Student {
    private int age;
    private int semester;
    private int socioEconomicStratum;
    private int coursesCompleted;
    private int coursesPending;
    private String program;
    private int programId;

    // Constructor
    public Student(int age, int semester, int socioEconomicStratum, int coursesCompleted,
                   int coursesPending, String program, int programId) {
        this.age = age;
        this.semester = semester;
        this.socioEconomicStratum = socioEconomicStratum;
        this.coursesCompleted = coursesCompleted;
        this.coursesPending = coursesPending;
        this.program = program;
        this.programId = programId;
    }

    // Getters
    public int getAge() { return age; }
    public int getSemester() { return semester; }
    public int getProgramId() { return programId; }

    // Método para imprimir los datos del estudiante
    public void printInfo() {
        System.out.printf("Student[ID=%d, Age=%d, Semester=%d, Stratum=%d, " +
                          "Completed=%d, Pending=%d, Program='%s']\n",
                          programId, age, semester, socioEconomicStratum,
                          coursesCompleted, coursesPending, program);
    }
}