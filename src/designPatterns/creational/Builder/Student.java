package designPatterns.creational.Builder;

public class Student {
    private final String name;
    private final int passingYear;
    private final int marks;
    private final String university;

    private Student(StudentBuilder st) {
        this.name=st.name;
        this.passingYear=st.passingYear;
        this.marks=st.marks;
        this.university=st.university;
    }
    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    static class StudentBuilder{
        private String name;
        private int passingYear;
        private  int marks;
        private String university;

        public Student build() throws Exception {
            if(this.passingYear<2018){
                throw new Exception("Passing year should be grater than 2019");
            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return  this;
        }

        public int getPassingYear() {
            return passingYear;
        }

        public StudentBuilder setPassingYear(int passingYear) {
            this.passingYear = passingYear;
            return  this;
        }

        public int getMarks() {
            return marks;
        }

        public StudentBuilder setMarks(int marks) {
            this.marks = marks;
            return  this;
        }

        public String getUniversity() {
            return university;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return  this;
        }

    }
}
