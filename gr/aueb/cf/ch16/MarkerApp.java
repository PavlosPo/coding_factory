package gr.aueb.cf.ch16;

public class MarkerApp {

    public static void main(String[] args) {
        Item book = new Book(1, "12345", "Miller A.", "TCP/IP Networks");
        Item cd = new CompactDisk(1, "Prince");
    }

    public static void deliver(Item item) {
        if (item instanceof Book) {
            System.out.println("Book delivered");
        } else if (item instanceof CompactDisk) {
            System.out.println("Cd Delivered");
        } else {
            throw new AssertionError(item);
        }
    }
}
