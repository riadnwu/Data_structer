
import java. util. * ;
public class main {
public static void main(String args[ ] ) {
// create a linked list
LinkedList ll = new LinkedList();
// add elements to the linked list
ll. add(" F" );
ll. add(" B" );
ll. add(" D" );
ll. add(" E" );
ll. add(" C" );
ll. addLast(" Z" );
ll. addFirst(" A" );
ll. add(0, " A2" );
ll.get(2);
System. out. println(" Original contents of ll: " + ll);
//String s1.format("",ll.get(2));
System. out. println(" Original contents of ll: "+ll.get(2) );
// remove elements from the linked list
//ll. remove(" F" );
ll. remove(3);
System. out. println(" Contents of ll after deletion: "
+ ll);
// remove first and last elements
//ll. removeFirst();
//ll. removeLast();
System. out. println(" ll after deleting first and last: "
+ ll);
// get and set a value
Object val = ll. get(2);
ll. set(2, (String) val + " Changed" );
System. out. println(" ll after change: " + ll);
}
}