import java.util.HashMap;
import java.util.*;
//Задача 2: Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

public class Task2 {
    public static void main(String[] args) {
        Map<String, Integer> namesList = new HashMap<>();
        String employees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Виктория Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Виктория Савина " +
                "Мария Рыкова " +
                "Виктория Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";
        String[] RepeatName = employees.split(" ");
        for (int i = 0; i < RepeatName.length; i += 2) {
            if (namesList.containsKey(RepeatName[i])) {
                namesList.replace(RepeatName[i], namesList.get(RepeatName[i]) + 1);
            } else {
                namesList.put(RepeatName[i], 1);
            }
        }
        System.out.println(namesList);
        Map<String, Integer> sortedNameMap = new LinkedHashMap<>();
        int max = 1;
        for (int value : namesList.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : namesList.entrySet()) {
                String key = entry.getKey();
                if (namesList.get(key) == i) {
                    sortedNameMap.put(key, namesList.get(key));
                }
            }
        }
        System.out.println(sortedNameMap);
    }
}

