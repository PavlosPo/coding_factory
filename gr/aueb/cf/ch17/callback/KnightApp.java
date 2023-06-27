package gr.aueb.cf.ch17.callback;
// callback

public class KnightApp {

    public static void main(String[] args) {
        IKnight kingArthur = new Knight();
        IKnight saintGeorge = new Knight();

        // Lambda expressions that are calling methods of the class
//        kingArthur.embarkOnMission(() -> System.out.println("Save the princess"));
//        saintGeorge.embarkOnMission(() -> killTheDragon());

        // Method references instead of lambda expressions
        kingArthur.embarkOnMission(KnightApp::killTheDragon);
        saintGeorge.embarkOnMission(KnightApp::saveThePrincess);
    }


    public static void killTheDragon() {
        System.out.println("Kill the Dragon");
    }

    public static void saveThePrincess() {
        System.out.println("Save the Princess");
    }
}
