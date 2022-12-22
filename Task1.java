//Задача 1: Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
import java.util.HashMap;
import java.util.Map.Entry;

public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> contacts = new HashMap<>();
        contacts.put(123456, "Ivanov");
        contacts.put(483456, "Lisina");
        contacts.put(321456, "Vasiliev");
        contacts.put(234561, "Petrova");
        contacts.put(234432, "Ivanov");
        contacts.put(654321, "Petrova");
        contacts.put(345678, "Ivanov");
        for (Entry<Integer, String> entry : contacts.entrySet()) {
            if (entry.getValue().equals("Ivanov")){
            // Integer key = entry.getKey();
            // String value = entry.getValue();
            // System.out.println(value + " - " + key);    
            System.out.println(String.format("%s %d ", entry.getValue(), entry.getKey()));
            }
        }
    }
}

