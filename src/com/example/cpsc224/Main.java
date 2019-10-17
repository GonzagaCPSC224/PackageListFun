package com.example.cpsc224; // must be the first line of non comment code

// import statements here....

import com.sprint.gina.MyOtherClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // package: a grouping of related types (classes and interfaces)
        // java.lang (for free), java.util, java.awt, java.swing, ....
        // why use packages?
        // 1. project structure (folders/files)
        // 2. namespace management
        // 3. access control (remember... package-private)

        System.out.println(String.class.getPackageName());
        System.out.println(Main.class.getPackageName());

        // task: create a new package (still in this project)
        // for your full name
        // create a class in that package
        // here in main() print out that class' package
        System.out.println(MyOtherClass.class.getPackageName());

        // List interface
        // from the Collections framework
        // two implementations: ArrayList and LinkedList
        List<String> myHalloweenWords; // the <String> is called a parameterized type
        // this parameterizes the type of the elements in the List
        // this also known as generics

        myHalloweenWords = new ArrayList<>();
        // dynamic like Vector C++
        myHalloweenWords.add("boo");
        myHalloweenWords.add("spooky");
        myHalloweenWords.add("spookane");
        myHalloweenWords.add("skeleton");

        System.out.println(myHalloweenWords);
        myHalloweenWords.remove("spooky"); // first occurence
        System.out.println(myHalloweenWords.size());

        Collections.sort(myHalloweenWords);
        System.out.println(myHalloweenWords);
        // shuffle(), reverse(), ...

    }
}
