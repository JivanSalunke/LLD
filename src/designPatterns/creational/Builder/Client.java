package designPatterns.creational.Builder;

public class Client {
    public static void main(String[] args) throws Exception {
        Student st= Student.getBuilder().setName("ABC").setPassingYear(2020).build();
        Student st1=Student.getBuilder().setName("XYZ").setPassingYear(2090).setMarks(80).setUniversity("university").build();
        System.out.print("Deb");
    }
}
