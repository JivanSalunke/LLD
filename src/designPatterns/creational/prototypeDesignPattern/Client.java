package designPatterns.creational.prototypeDesignPattern;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentReg=new StudentRegistry();
        fillRegistry(studentReg);

        Student jivan=studentReg.getStudent("JanBatch").clone();
        jivan.setName("Jivan");

        Student smart_jivan=studentReg.getStudent("JanBatchIS").clone();
        smart_jivan.setName("smart_Jivan");

        System.out.println("Debug");


    }
    public static void fillRegistry(StudentRegistry studentReg){
        Student normal= new Student();
        normal.setBatch("Jan21");
        normal.setAvgBatchPSP(90);

        studentReg.register("JanBatch",normal);

        IntelligentStudent intelligent=new IntelligentStudent();
        intelligent.setBatch("Jan21");
        intelligent.setAvgBatchPSP(90);

        studentReg.register("JanBatchIS",intelligent);
    }
}
