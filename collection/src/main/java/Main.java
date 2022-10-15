import java.util.*;

/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся):
 * а) Посчитать сколько раз встречается каждое слово;
 * б) Найти список уникальных слов, из которых состоит массив (дубликаты не считаем);
 * <p>
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
 * телефонных номеров. В этот телефонный справочник с помощью метода add() можно
 * добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует
 * учесть, что под одной фамилией может быть несколько телефонов (в случае
 * однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */

public class Main {
    public static void main(String[] args) {
        //1
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("один");
        arrayList.add("один");
        arrayList.add("три");
        arrayList.add("два");
        arrayList.add("четыре");
        arrayList.add("пять");
        arrayList.add("два");
        arrayList.add("пять");
        arrayList.add("два");
        arrayList.add("пять");
        arrayList.add("четыре");
        arrayList.add("три");
        arrayList.add("два");
        arrayList.add("шесть");
        String [] arr=new String[arrayList.size()];
        arrayList.toArray(arr); //преобразуем arrayList в массив arr

        //1a
        Map<String,Integer> massiv =new HashMap<>();
        for(String array: arr){
            massiv.put(array, massiv.getOrDefault(array,0)+1);
        }
        System.out.println(massiv);
        System.out.println(" ");

        //1b

        Set<String> uniqueWord=new HashSet<>(Arrays.asList(arr));
        System.out.println(uniqueWord);
        System.out.println(" ");

        //2
        Phonebook pb=new Phonebook();
        pb.add("Иванов","1234");
        pb.add("Петров","2345");
        pb.add("Сидоров","3456");
        pb.add("Петров","4567");
        pb.add("Сидоров","5678");

        System.out.println("Иванов"+pb.get("Иванов"));
        System.out.println("Петров"+pb.get("Петров"));

    }
}

