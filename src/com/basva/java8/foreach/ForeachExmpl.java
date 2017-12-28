package com.basva.java8.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForeachExmpl {

    public static void main(String[] args){
       ForeachExmpl exmpl = new ForeachExmpl();

        List<Student> ls = new ArrayList<>();

        ls.add(new Student(1, "ramesh"));
        ls.add(new Student(2, "suresh"));
        ls.add(new Student(3, "ravi"));
        ls.add(new Student(4, "sampath"));
        ls.add(new Student(5, "sanvi"));

        ls.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student std) {
                System.out.println(std.toString());
                System.out.println(std.getRollNo());
            }
        });


    }
}
