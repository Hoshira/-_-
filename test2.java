import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        //константы
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int fl = 0;
        int len_key = 0, len_stroch, len_zaglav, len_chisel, len_simbols;

        //пользователь задаёт длину
        while (fl == 0){
            System.out.println("Введите число от 8 до 12");
            len_key = scanner.nextInt();
            if (!(8 <= len_key && len_key <= 12)){
                System.out.println("Некорректное число, введите другое");
            }
            else{
                fl = 1;
            }
        }
        //полуконстанты
        ArrayList<String> key = new ArrayList();
        ArrayList<Integer> index = new ArrayList();
        for (int i = 0; len_key > i; i++){
            index.add(i);
        }
        System.out.println(index);

        //добавление рандомности
        len_stroch = (int) ((((len_key - 3) - 1) + 1) * Math.random()) + 1;
        len_zaglav = (int) ((((len_key - 2 - len_stroch) - 1) + 1) * Math.random()) + 1;
        len_chisel = (int) ((((len_key - 1 - len_stroch - len_zaglav) - 1) + 1) * Math.random()) + 1;
        len_simbols = len_key - len_stroch - len_zaglav - len_chisel;
        System.out.println(len_stroch + " " + len_chisel + " " + len_simbols + " " + len_zaglav + " " + len_key);
        //добавление в список строчных букв
        for (int i = 0; len_stroch > i; i++){
            char random_bukva = (char) (r.nextInt(26) + 'a');
            System.out.println(random_bukva);
            int random_index = index.get(r.nextInt(index.size()));
            key.set(random_index, Character.toString(random_bukva));
            index.remove(random_index);
        }
        System.out.println(key);
    }

}
/*логика программы, которую нужно реализовать:
у нас есть список key длины key_len, заполненный чем-то вроде пустоты
1)Затем рандомизатор выдаёт случайную строчную букву
2)Рандомизатор выдаёт случайный элемент списка index, где содержатся все ещё не задействованные индексы списка key
То же самое с заглавными, специальными символами и числами
Пароль готов
Сложность лишь в совмещении char и String. Это третья задача
*/