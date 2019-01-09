package Streams;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.*;
public class Stream {
    public static void main(String args[]) {
        /*    List<String> list = Arrays.asList("a1", "a2", "c1", "da2");
         *//*Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String a = iterator.next();
            if (a.startsWith("a")) {

            }
        }*//*
        list.stream()
                .filter(s -> {
                    System.out.println("inside the filter");
                    return s.startsWith("a");
                })
                .forEach(s -> System.out.println(s));
    }}*/

        //2nd method to remove duplicates
   /* List<String> list = Arrays.asList("a1", "a2", "c1", "a2");
list.stream()
        //below fucntion .distinct()will go through the filter first and then gives output thrice
        .distinct()
        .filter(s -> {
        System.out.println("inside the filter");
        return s.startsWith("a");
        })
        .forEach(s -> System.out.println(s));
        }}*/

        //Third method using collect()
        /*List<String> list = Arrays.asList("a1", "a2", "c1", "a2");
list.stream()
        //below fucntion .collect()will go through the filter gives the output

        .filter(s -> {
        System.out.println("inside the filter");
        return s.startsWith("a");
        })
        .collect(Collectors.toList());
        }}*/
    }}