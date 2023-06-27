package gr.aueb.cf.ch17.clonable;

public class Main {

    public static void main(String[] args) {
        City athens = new City("Athens");

        try {
            City athensClone = athens.clone();
            athensClone.setName("Paris");


            Trainee alice = new Trainee("Alice", athens);
            Trainee bob = alice.clone();
            bob.getCity().setName("London");

            System.out.println(alice);
            System.out.println(bob);

            System.out.println(athens);
            System.out.println(athensClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
