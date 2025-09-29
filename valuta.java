import java.util.Scanner;

public class valuta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dol = 0.012067, euro = 0.010294, tenge = 6.57, won = 17.03, lir = 0.5003, chislo, otv;
        int valuta;
        while (true) {
            System.out.println("Введите сумму в рублях. Для завершения введите -1");
            chislo = scanner.nextDouble();
            valuta = -1;
            if (chislo == -1){
                break;
            }
            if (chislo < 0){
                System.out.println("Неккоректный ввод. Попробуйте ещё раз");
            }
            else{
                while (valuta == -1){
                    System.out.println("Выберите желаемую валюту" + "\n" + "Введите 1, если хотите перевести в доллар");
                    System.out.println("2 - евро" + "\n" + "3 - тенге" + "\n" + "4 - вон" + "\n" + "5 - лиры");
                    valuta = scanner.nextInt();
                    switch (valuta){
                        case 1:
                            otv = dol * chislo;
                            System.out.println("Ваша сумма: " + otv);
                            break;
                        case 2:
                            otv = euro * chislo;
                            System.out.println("Ваша сумма: " + otv);
                            break;
                        case 3:
                            otv = tenge * chislo;
                            System.out.println("Ваша сумма: " + otv);
                            break;
                        case 4:
                            otv = won * chislo;
                            System.out.println("Ваша сумма: " + otv);
                            break;
                        case 5:
                            otv = lir * chislo;
                            System.out.println("Ваша сумма: " + otv);
                            break;
                        default:
                            System.out.println("Некорректный ввод. Попробуйте ещё раз");
                            valuta = -1;
                            break;

                    }
                }

            }
        }
    }
}
