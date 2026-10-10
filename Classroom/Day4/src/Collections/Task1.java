package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    String name ;
    int rollno ;
    int age ;
    int marks ;
    public Student(String name , int rollno , int age , int marks){
        this.name  = name ;
        this.rollno = rollno ;
        this.age = age ;
        this.marks = marks ;
    }
    @Override
    public int compareTo(Student s){
        return this.age - s.age; // Integer.compare(this.age , s.age)
    }
    //Fn + Alt + Insert
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
public class Task1 {

    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>(10) ;
        list.add(new Student("Rahul" , 101 , 10 , 30));
        list.add(new Student("Rohit" , 102 , 11 , 40));
        list.add(new Student("Raj" , 103 , 10 , 50));
        list.add(new Student("Raju" , 103 , 11 , 100));
        list.add(new Student("Diya" , 105 , 11 , 90));
        list.add(new Student("Riya" , 107 , 10 , 80));
        list.add(new Student("Ram" , 104 , 11 , 70));

        System.out.println("--- Original List ---");
        System.out.println(list);


        System.out.println("\n--- Sorted by Age ---");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("\n--- Sorted by Marks (High to Low) ---");
        list.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));
        System.out.println(list);


    }
}