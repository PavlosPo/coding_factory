package gr.aueb.cf.ch14_homework.exerciseOne;

public class SaintGeorgeKnight {
    private static SaintGeorgeKnight saintGeorgeInstance;

    private SaintGeorgeKnight() {}

    /**
     * Returns the SaintGeorge Instance requests. Only one instance exists.
     *
     * @return  returns a SaintGeorgeKnight instance.
     */
    public static SaintGeorgeKnight getInstance() {
        if (saintGeorgeInstance == null) {
            saintGeorgeInstance = new SaintGeorgeKnight();
        }
        return saintGeorgeInstance;
    }

    public static void embarkOnMission() {
        System.out.println("Saint George Knight, starts a crusade!");
    }
}
