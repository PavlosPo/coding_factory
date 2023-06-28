package gr.aueb.cf.ch19;
// E Element
// K key
// V value
// N Numeric
public class NodeGenericApp {

    public static void main(String[] args) {
        // wrapper classes as types in the diamond symbols.
        NodeGeneric<Integer> nodeInt = new NodeGeneric<>();
        NodeGeneric<String> nodeStr = new NodeGeneric<>();

        nodeInt.setValue(2);
        nodeStr.setValue("Coding");

        // compile time safety
        // int val = nodeStr.getValue();
    }


}
