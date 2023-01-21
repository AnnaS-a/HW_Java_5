//Задача 1: Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class l5num1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> contacts = new HashMap<String, List<String>>();
        contacts.put("Ivanov",  Arrays.asList("7654333", "678899900"));
        contacts.put( "Lisina", Arrays.asList("483456", "5689054"));
        contacts.put("Novikov", Arrays.asList("321456", "988765", "875678"));
        contacts.put("Petrova", Arrays.asList("234561", "87656788"));
        contacts.put("Ivanova", Arrays.asList("234432", "7843567"));
        contacts.put("Petrov", Arrays.asList("654321", "349876554"));
        contacts.put("Rilin", Arrays.asList("345678", "6799988"));

        for (Entry<String, List<String>> entry : contacts.entrySet()) {
            if (entry.getKey().equals("Novikov")){  
            System.out.println(String.format("Контакт: %s %s ", entry.getKey(), entry.getValue()));
            }
        }
    }
}

