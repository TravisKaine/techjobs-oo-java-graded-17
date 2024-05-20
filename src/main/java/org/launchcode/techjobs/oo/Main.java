package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
        // sample added job by John
        // Job job4 = new Job("Bass Player", new Employer("Metallica"), new Location("On Tour"), new PositionType("Band Member"), new CoreCompetency("Slappa Da Bass!"));


        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);
        // jobs.add(job4); // saw this in the github repo and wanted to try it

        for (Job job : jobs){
            System.out.println(job);
        }
    }

}