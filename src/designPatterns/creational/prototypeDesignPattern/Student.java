package designPatterns.creational.prototypeDesignPattern;

public class Student implements Prototype<Student>{
    private int age;
    private String name;
    private String batch;
    private double avgBatchPSP;
    private double psp;
    public Student(){}
    public Student(Student st){
        this.age=st.age;
        this.name=st.name;
        this.psp=st.psp;
        this.batch=st.batch;
        this.avgBatchPSP=st.avgBatchPSP;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPSP(double avgBatchPSP) {
        this.avgBatchPSP = avgBatchPSP;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
