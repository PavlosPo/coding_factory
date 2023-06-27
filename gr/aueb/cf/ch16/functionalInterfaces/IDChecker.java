package gr.aueb.cf.ch16.functionalInterfaces;

@FunctionalInterface
public interface IDChecker {

    /**
     * Check for specific student ids.
     *
     *
     * @param student
     *      the (@link Student) instance
     * @return
     *       true, if the id of the student is valid based on the predicate,
     *       otherwise, false.
     */
    boolean ckeckId(Student student); // predicate ~ boolean function
}
