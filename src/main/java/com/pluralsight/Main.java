package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // create a StringBuillder object
        StringBuilder skills = new StringBuilder();
        // append strings to the StringBuilder object
        skills.append("Glover Smith\n");
        skills.append("123 Main Street\n");
        skills.append("Middleton, \n");
        skills.append("TX\n");
        skills.append("75111 \n");

        skills.append("Shipping Address: \n");
        skills.append("456 Big Sky Blvd\n");
        skills.append("Outer Rim, \n");
        skills.append("TX \n");
        skills.append("75333")
;
        // retrieve the underlying characters from
        // the StringBuilder
        String mySkills = skills.toString();
        System.out.println(mySkills);


    }
}
