package Lists;

import java.util.*;

public class Practice {
    public static void Exercise() {
        List<String> list = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

//        list2.addAll(list);
        List<String> list2 = new ArrayList<>(list);
        System.out.println(list); // Output: [Apple, Banana]
        System.out.println(list2); // Output: [Apple, Banana, Peach]

        list.add("Peach");
        list2.remove("Apple");

        System.out.println(list2.contains("Apple")); // false
        System.out.println(list.indexOf("Banana")); // 1
        System.out.println(new HashSet<>(list2).containsAll(list)); // false
        System.out.println(list.lastIndexOf("Banana")); // 1 поиск с конца
        System.out.println(list2.get(0)); // Banana

        System.out.println(list); // Output: [Apple, Banana, Peach]
        System.out.println(list2); // Output: [Banana]

        list2.clear(); // очистить список
        System.out.println(list2); // Output: []
        list2.add("Carrot");
        list2.add("Tomato");
        list2.add("Potato");
        System.out.println(list2); // Output: [Carrot, Tomato, Potato]
        System.out.println(list2.subList(1, 3)); // Output: [Tomato, Potato]
        list2.add("Pumpkin");
        list2.add("Zucchini");
        System.out.println(list2); // Output: [Carrot, Tomato, Potato, Pumpkin, Zucchini]
        System.out.println(list2.subList(1, 3)); // Output: [Tomato, Potato]

//        Object[] list3 = list.toArray();
//        System.out.println(Arrays.toString(list3)); //
//        System.out.println(list3.getClass().getName()); // Output: []
        // Создаем итератор, начинающий с индекса 2
        ListIterator<String> iterator = list2.listIterator(1); // list2 = [Carrot, Tomato, Potato, Pumpkin, Zucchini]

        // Выводим итератор
        System.out.println(iterator); // Это выведет что-то вроде: java.util.ArrayList$Itr@someHashCode

        // Если мы хотим видеть элементы, начиная с индекса 2, мы можем сделать так:
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Tomato, Potato, Pumpkin, Zucchini
        }
    }

    public static void Task1(List<String> list) {
        // Создание списка и добавление элементов
        System.out.println("Task1: Создание списка и добавление элементов");

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        // Вывод списка на экран
        System.out.println(list);
    }

    public static void Task2(List<String> list) {
        // Итерация по списку
        System.out.println("Task2: Итерация по списку");

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        // Использование for-each
//        for (String fruit : list) {
//            System.out.println(fruit);
//        }

        // Использование итератора
//        ListIterator<String> iterator = list.listIterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        // Использование for i
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
    }

    public static void Task3(List<String> list) {
        // Удаление элементов
        System.out.println("Task3: Добавление и удаление элементов");

        list.add("Apple");
        list.add("Banana");
        list.add("Peach");

        // Добавление элемента в конец списка
        list.add("Pear");

        // Вывод списка на экран после пополнения
        System.out.println("Список после пополнения: " + list);

        // Удаление первого вхождения элемента
        list.remove("Apple");
        // Вывод списка на экран после удаления элемента
        System.out.println("Список после удаления Apple: " + list);

        // Удаление всех вхождений элемента
        list.remove(0);
        // Вывод списка на экран после удаления элемента
        System.out.println("Список после удаления Banana: " + list);
    }

    public static void Task4(List<String> list) {
        // Изменение элемента по индексу [~~метод set(index, element)~~]
        System.out.println("Task4: Изменение элемента по индексу");

        list.add("Table");
        list.add("Sofa");
        list.add("Wardrobe");

        // Вывод списка на экран до изменения
        System.out.println("Список до изменения: " + list);

        // Изменение элемента с индексом 1
        list.set(1, "Chair");

        // Вывод списка на экран после изменения
        System.out.println("Список после изменения: " + list);
    }

    public static void Task5(List<String> list) {
        // Поиск индекса элемента
        System.out.println("Task5: Поиск индекса элемента");

        list.add("Table");
        list.add("Sofa");
        list.add("Wardrobe");

        // Вывод списка на экран до поиска индекса
        System.out.println("Список до поиска индекса: " + list);

        // Поиск индекса элемента "Sofa"
        int index = list.indexOf("Sofa");
        // Вывод индекса на экран
        System.out.println("Индекс элемента Sofa: " + index);
    }

    public static void Task6(List<String> list) {
        // Проверка на наличие элемента
        System.out.println("Task6: Проверка на наличие элемента");

        list.add("Table");
        list.add("Sofa");
        list.add("Wardrobe");

        // Вывод списка на экран до проверки наличия
        System.out.println("Список до проверки наличия: " + list);

        // Проверка наличия элемента "Sofa"
        boolean contains = list.contains("Sofa");
        // Вывод результата на экран
        System.out.println("Содержит ли список элемента Sofa: " + contains);
    }

    public static void Task7(List<String> list) {
        // Получение размера списка
        System.out.println("Task7: Получение размера списка");

        list.add("Tablet");
        list.add("Smart phone");
        list.add("Laptop");

        // Вывод списка на экран до получения размера
        System.out.println("Список до получения размера: " + list);

        // Получение размера списка
        int size = list.size();
        // Вывод размера на экран
        System.out.println("Размер списка: " + size);
    }

    public static void Task8(List<String> list) {
        // Очистка списка
        System.out.println("Task8: Очистка списка");

        list.add("Orange");
        list.add("Apple");
        list.add("Banana");

        // Вывод списка на экран до очистки
        System.out.println("Список до очистки: " + list);

        // Очистка списка
        list.clear();

        // Вывод списка на экран после очистки
        System.out.println("Список после очистки: " + list);
    }

    public static void Task9(List<String> list) {
        // Проверка на пустоту
        System.out.println("Task9: Проверка на пустоту списка");

        list.add("Chair");
        list.add("Table");
        list.add("Lamp");

        // Вывод списка на экран до проверки на пустоту
        System.out.println("Список до проверки на пустоту: " + list);

        // Проверка на пустоту списка
        boolean isEmpty = list.isEmpty();
        // Вывод результата на экран
        System.out.println("Список пуст: " + isEmpty);
    }

    public static void Task10(List<String> list) {
        // Сортировка списка
        System.out.println("Task10: Сортировка списка");

        list.add("Banana");
        list.add("Peach");
        list.add("Apple");

        // Вывод списка на экран до сортировки
        System.out.println("Список до сортировки: " + list);

        // Сортировка списка в порядке возрастания
        Collections.sort(list);
        // Вывод списка на экран после сортировки
        System.out.println("Список после сортировки: " + list);

        // Сортировка списка в порядке убывания
        list.sort(Collections.reverseOrder());
        // Вывод списка на экран после сортировки в обратном порядке
        System.out.println("Список после сортировки в обратном порядке: " + list);
    }

    public static void Task11(List<String> list) {
        // Создание подсписка (subList())
        System.out.println("Task11: Создание подсписка (subList())");

        list.add("Table");
        list.add("Chair");
        list.add("Lamp");
        list.add("Couch");
        list.add("Bed");

        // Вывод списка на экран до разбиения
        System.out.println("Список до разбиения: " + list);

        // Разбиение списка на подсписки по условию
        List<String> sublist = list.subList(1, 4);
        // Вывод подсписка на экран
        System.out.println("Подсписок c 1 по 3 включительно: " + sublist);
    }

    public static void Task12(List<String> list) {
        // Добавление всех элементов из одного списка в другой (addAll())
        System.out.println("Task12: Добавление всех элементов из одного списка в другой");

        List<String> additionalList = new ArrayList<>();
        additionalList.add("Bookshelf");
        additionalList.add("Shelf");

        list.add("Table");
        list.add("Chair");
        list.add("Lamp");

        // Вывод списка на экран до добавления
        System.out.println("Первый список до добавления второго: " + list);
        System.out.println("Второй список: " + additionalList);

        // Добавление всех элементов из additionalList в list
        list.addAll(additionalList);
        // Вывод списка на экран после добавления
        System.out.println("Список после добавления элементов второго списка в первый: " + list);
    }

    public static void Task13(List<String> firstList) {
        // Проверка наличия вхождения элементов одного списка в другой (containsAll())
        System.out.println("Task13: Проверка наличия вхождения элементов одного списка в другой");

        firstList.add("Box");
        firstList.add("Package");
        firstList.add("Backpack");

        List<String> secondList = new ArrayList<>();

        secondList.add("Box");
        secondList.add("Package");
        secondList.add("Backpack");

        // Вывод содержимого первого списка
        System.out.println("Первый список:" + firstList);

        // Вывод содержимого второго списка
        System.out.println("Второй список:" + secondList);

        boolean containsAll = new HashSet<>(firstList).containsAll(secondList);
        System.out.println("Содержит ли список " + firstList +
                " элементы второго списка " + secondList + "?\nОтвет: " + containsAll);
    }

    public static void Task14(List<String> list) {
        // Преобразование списка в массив
        System.out.println("Task14: Преобразование списка в массив");

        list.add("String");
        list.add("Integer");
        list.add("Float");

        // Преобразование списка в массив
        String[] array = list.toArray(new String[0]);

        System.out.println("Список до преобразования в массив: " + list + "\nТип: " + list.getClass().getCanonicalName());
        System.out.println("Массив: " + Arrays.toString(array) + "\nТип: " + array.getClass().getCanonicalName());
    }

    public static void Task15(List<String> list) {
        // Создание изменяемого подсписка и его модификация
        // Объяснение: Подсписок является представлением части исходного списка, и изменения в подсписке
        // отражаются в исходном списке.
        System.out.println("Task15: Создание изменяемого подсписка и его модификация");

        list.add("String");
        list.add("Integer");
        list.add("Character");
        list.add("Double");
        list.add("Float");

        // Создание подсписка
        List<String> sublist = list.subList(1, 4);

        System.out.println("Исходный список" + list); // ["String", "Integer", "Character", "Double", "Float"]
        System.out.println("Подсписок до изменения элемента: " + sublist);

        sublist.set(0, "Boolean"); // Изменяем элемент "Integer" на "Boolean" в подсписке
        System.out.println("Подсписок после изменения элемента: " + sublist);
    }

    public static void Task16(List<String> list) {
        // Добавление всех элементов из массива в список
        System.out.println("Task16:  Добавление всех элементов из массива в список");

        // Создание массива
        String[] fruits = {"Манго", "Ананас", "Киви"};
        System.out.println("Список до добавление элементов массива: " + list);

        // Добавление всех элементов массива в список
        list.addAll(Arrays.asList(fruits));

        System.out.println("Массив: " + Arrays.toString(fruits));
        System.out.println("Список после добавление элементов массива: " + list);
    }

    public static void Task17(List<String> list) {
        // Проверка на наличие всех элементов из списка в массиве (Массив содержит все элементы списка)
        System.out.println("Task17: Проверка на наличие всех элементов из списка в массиве");

        // Создание массива
        String[] fruits = {"Манго", "Ананас", "Киви"};
        System.out.println("Массив: " + Arrays.toString(fruits));

        // Создание списка
        list.add("Ананас");
        list.add("Киви");
        System.out.println("Список: " + list);

        // Проверка на то, что массив содержит все элементы списка
        boolean containsAll = Arrays.asList(fruits).containsAll(list);

        System.out.println("Массив содержит все элементы списка? Ответ: " + containsAll);
    }

    public static void Task18(List<String> list) {
        // Создание неизменяемого подсписка
        // Объяснение: Используйте Collections.unmodifiableList() для создания неизменяемого представления списка.
        System.out.println("Task18: Создание неизменяемого подсписка");


        // Создание списка
        list.add("Ананас");
        list.add("Киви");
        list.add("Яблоко");
        list.add("Банан");
        list.add("Клубника");
        list.add("Черешня");
        System.out.println("Список: " + list);

        // Создание подсписка
        List<String> subList = Collections.unmodifiableList(list.subList(3, 6));
        System.out.println("Подсписок: " + subList);

        // Проверка на то, что подсписок неизменяемый
//        subList.set(0, "Яблоко"); // Это вызовет UnsupportedOperationException

        System.out.println("Тип подсписка: " + subList.getClass().getCanonicalName());

    }

    public static void Task19(List<String> list) {
        // Преобразование списка в массив с использованием метода ссылки
        System.out.println("Task19: Преобразование списка в массив с использованием метода ссылки");

        // Создание списка
        list.add("Ананас");
        list.add("Киви");
        list.add("Яблоко");
        list.add("Банан");
        list.add("Клубника");
        list.add("Черешня");
        System.out.println("Список: " + list + "\nТип списка: " + list.getClass().getCanonicalName());

        // Создание массива с использованием ссылки
        String[] array = list.toArray(String[]::new);

        // Вывод массива
        System.out.println("Массив: " + Arrays.toString(array) + "\nТип массива: "  + array.getClass().getCanonicalName());
    }

    public static void Task20(List<String> list) {
        // Удаление всех элементов из одного списка, которые содержатся в другом removeAll()
        System.out.println("Task19: Преобразование списка в массив с использованием метода ссылки");

        // Создание первого списка
        list.add("Ананас");
        list.add("Клубника");
        list.add("Яблоко");

        List<String> list2 = new ArrayList<>();

        // Создание второго списка
        list2.add("Банан");
        list2.add("Клубника");
        list2.add("Черешня");

        // Вывод исходных списков
        System.out.println("Список 1: " + list);
        System.out.println("Список 2: " + list2);

        // Удаление элементов из первого списка, которые содержатся во втором
        list.removeAll(list2);

        // Вывод списка после удаления
        System.out.println("Список 1 после удаления элементов второго: " + list);
    }

    public static void Task21(List<String> list) {
        // Использование listIterator(int index) для прохода с конца в начало

        list.add("Яблоко");
        list.add("Банан");
        list.add("Апельсин");

        // System.out::println эквивалентно лямбда-выражению (x) -> System.out.println(x).
        // Это значит, что для каждого элемента в list будет вызван метод println, и
        // элемент будет передан этому методу в качестве аргумента.
//        list.forEach(fruit -> System.out.println("Список: " + fruit));
        System.out.println("Список: ");
        list.forEach(System.out::println);


        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.println("Вывод каждого элемента с конца:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }


    }
}