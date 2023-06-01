package gr.aueb.cf.ch9.homework;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Scanner;

public class exercise {

    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new FileReader("src/gr/aueb/cf/ch9/homework/students.txt"))) {
            String wholeLine = "";
            String[] dataPerLine = {};
            double grade = 0;

            // Reads Lines, Calculates grades
            while ((wholeLine = br.readLine()) != null) {
                // Split the data in each row.
                dataPerLine = wholeLine.split(" +");

                // Grade Calculation or Log the Errors.
                if (!checkGrades(dataPerLine[2], dataPerLine[3])) {
                    System.out.printf("Student: %s not valid grades", dataPerLine[0].toString());
                    continue;
                }
                grade = getAverageGrade(dataPerLine[2], dataPerLine[3]);

                System.out.println("Data: " + wholeLine + " Average: " + grade);
                printOutputFile(dataPerLine[0], dataPerLine[1], grade);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * Responsible to write the end file with the average grades.
     *
     * @param firstname     The first name
     * @param lastname      The lastname
     * @param averageGrade  The average grade that has been calculated before.
     */
    public static void  printOutputFile(String firstname, String lastname,double averageGrade){
        try (PrintStream pw = new PrintStream(new FileOutputStream("/Users/pavlospoulos/IdeaProjects/CodingFactory/src/gr/aueb/cf/ch9/homework/primOut.txt", true))) {
            pw.printf("%s %s %s\n" , firstname, lastname, averageGrade);
            pw.println();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * Check if the given grades, in a string format, are valid or not.
     * It logs each possibility.
     *
     * @param s1        Grade 1
     * @param s2        Grade 2
     * @return          True, false
     */
    public static boolean checkGrades(String s1, String s2){
        // Validation
        if (!isInt(s1) || !isInt(s2)) {
            log(new IllegalArgumentException(), "One of the grades are not Numbers!");
            return false;
        }
        // Validation
        if (Integer.parseInt(s1) > 10 || Integer.parseInt(s1) < 0 ||
                Integer.parseInt(s2) > 10 || Integer.parseInt(s2) < 0) {
            log(new IllegalArgumentException(), "False Values of grades!");
            // throw new IllegalArgumentException();
            return false;
        }
        return true;
    }

    /**
     * It gets two strings if the strings are numbers it gets the average,
     *
     * @param s1        String 1
     * @param s2        String 2
     * @return          Average of numbers in String 1 and String 2.
     */
    public static double getAverageGrade(String s1, String s2) {
        return ((double) Integer.parseInt(s1) + Integer.parseInt(s2)) / 2;
    }

    /**
     * Checks to see if a string has an  int inside.
     * @param s     The given string.
     * @return      Returns true, false if it has a number or not.
     */
    public static boolean isInt(String s) {
        Scanner sc = new Scanner(s.trim());
        return sc.hasNextInt();
    }


    /**
     * Custom Logger that appends a log.txt file with an error and specific given message, if provided.
     *
     * @param e     The error to log.
     * @param message   The message to insert along with the error.
     */
    public static void log(Exception e, String... message) {
        try (PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                    new FileWriter("/Users/pavlospoulos/IdeaProjects/CodingFactory/src/gr/aueb/cf/ch9/homework/log.txt",
                        StandardCharsets.UTF_8, true)))) {

            pw.printf("Error: %s \nTime: %s \nMessage: %s\n\n", e.toString(), LocalDateTime.now(), message[0].toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
