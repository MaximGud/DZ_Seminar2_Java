
public class App {
    public static void main(String[] args) throws Exception {
        // 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть
        // WHERE этого запроса, используя StringBuilder.
        // Данные для фильтрации приведены ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia",
        // "city":"Moscow", "age":"null"}
        // select * from student where name='Ivanov' and country='Russia' and
        // city='Moscow' and age='null'
        // String[] data = {"name":"Ivanov", "country":"Russia", "city":"Moscow",
        // "age":"null"};
        String[] data = {"name","Ivanov", "country","Russia", "city","Moscow", "age","null"};
        System.out.println(Task1.exec(data));

        // 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат
        // после каждой итерации запишите в лог-файл.
        // int[] sortArr = { 5, 10, 1, 16, 14, 3 };
        // Task2.bubbleSort(sortArr);
        // for (int i = 0; i < sortArr.length; i++) {
        //     System.out.print(sortArr[i] + "\n");

        //}
    }
}