package oops1;
import java.util.Arrays;
public class Student {
    private int id;
    private String name;
    private int[] marks;
    Student(int id,String name,int[] marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int[] getMarks(){
        return marks;
    }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println();
    }
}
