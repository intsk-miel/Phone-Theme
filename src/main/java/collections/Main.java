package collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class Main {
    private static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        LinkedList<PhoneThings> phn = new LinkedList<PhoneThings>();
        phn.insert(new PhoneThings(200, "Green", 1));
        phn.insert(new PhoneThings(140, "Red", 2));
        phn.insertAtStart(new PhoneThings(350, "Blue", 2));
        phn.insertAtLast(new PhoneThings(100, "Brown", 2.5));
        phn.insertAt(2, new PhoneThings(400, "Black", 1.5));
        phn.deleteAt(0);
        phn.print();


        Queue<PhoneThings> q = new PriorityQueue<PhoneThings>();
        q.add(new PhoneThings(910, "Blue", 1));
        q.add(new PhoneThings(400, "Black", 2.2));
        q.add(new PhoneThings(350, "Pink", 3));
        while (q.size() > 0) {
            logger.info(q.poll());
        }

        Map<Integer, PhoneThings> map = new HashMap<Integer, PhoneThings>();
        map.put(1, new PhoneThings(300, "Orange", 1.2));
        map.put(2, new PhoneThings(500, "purple", 1.1));
        map.put(3, new PhoneThings(720, "Black", 4.3));
        Set<Map.Entry<Integer, PhoneThings>> set1 = map.entrySet();
        for (Object o : set1) {
            logger.info(o);
        }

        Set<PhoneThings> set2 = new TreeSet<PhoneThings>();
        set2.add(new PhoneThings(110, "Cyan", 1));
        set2.add(new PhoneThings(900, "Black", 1.7));
        set2.add(new PhoneThings(1000, "White", 2));
        for (Object o : set2) {
            logger.info(o);
        }
    }
}








