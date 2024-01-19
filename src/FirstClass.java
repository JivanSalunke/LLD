import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class FirstClass {
    public static void main(String[] args) {
        ArrayList<Data> datalist=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();

        while(N-->0){
            System.out.println("Enter Name: ");
            String name=sc.next();
            System.out.println("Enter Address: ");
            String address=sc.next();
            System.out.println("Enter marks: ");
            int marks=sc.nextInt();
            Data data=new Data(name,address,marks);
            datalist.add(data);
        }
        System.out.println(datalist);
    }
    public static class Data{
        String name;
        String address;
        int mark;

        Data(String A, String B, int C){
            this.name=A;
            this.address=B;
            this.mark=C;

        }
    }
}
