//библиотеки
import java.util.ArrayList;
import java.util.Scanner;

//основное тело кода
class Main{
    public static void main(String[] args){

        //константы
        String[] spisok_slov = {"азбука", "бактерии", "ёж"};
        int hearts = 3;
        String sep_ch = "_";
        Scanner scanner = new Scanner(System.in);
        int fl_bukva;
        int fl_slova = 1;

        //задание слова из списка
        int random_chislo = (int) (((spisok_slov.length - 1) + 1) * Math.random());
        String otvet = spisok_slov[random_chislo];

        //создание списка из элементов отгаданных и нет слова
        ArrayList<String> open_word = new ArrayList<>(9);
        for (int i = 0; i < otvet.length(); i++){
            open_word.add(sep_ch);
        }
        for (String ch: open_word){
            System.out.print(ch);
        }
        System.out.println();
        //тело игры
        while (hearts > 0){
            fl_bukva = 1;
            System.out.println("Введите букву. Если вы введёте несколько символов, мы учтём только первый");
            char bukva = scanner.next().charAt(0);
            if ("йцукенгшщзхъфывапролджэячсмитьбю".indexOf(bukva) == -1 ){
                System.out.println("Некорректный ввод, введите букву");
            }
            else{
                for (int sket = 0; sket != otvet.length(); sket++){
                    if (bukva == otvet.charAt(sket)){
                        open_word.set(sket, String.valueOf(otvet.charAt(sket)));
                        fl_bukva = 0;

                    }
                }
                if (!(open_word.contains("_"))){
                    System.out.println("Вы угадали слово: " + otvet);
                    hearts = 0;
                    fl_slova = 0;
                }
                else{
                    for (String ch: open_word){
                        System.out.print(ch);
                    }
                    System.out.println();
                    if (fl_bukva == 1){
                        hearts -= 1;
                        System.out.println("Этой буквы нет в слове, у вас осталось " + hearts + " попыток");
                    }
                }
            }

        }
        if (fl_slova == 1){
            System.out.println("Вы проиграли, загаданное слово: " + otvet);
        }
    }
}
