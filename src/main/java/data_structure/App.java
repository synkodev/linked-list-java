package data_structure;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        LinkedList list = new LinkedList("elemento1");
        list.append("elemento2");
        list.append("elemento3");
        list.append("elemento4");
        list.prepend("elemento5");
        System.out.println("Head: " + list.getHead());
        System.out.println("Tail: " + list.getTail());
        System.out.println("Length: " + list.getLength());
        list.removeFist();
        System.out.println("Item from index 2: " + list.get(2).data);
        list.insert(2, "elemento6");
        list.print();
    }
}
