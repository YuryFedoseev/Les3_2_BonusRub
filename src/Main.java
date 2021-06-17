public class Main {
    public static void main(String[] args) {

        long sumpopolnenie = 1100; //Сумма пополнения . вставить из БД
        long balanse = 100; //Баланс человека , вставить значение из БД
        long rublimit = 1000; //Условие - пополнение свыше которого копятся бонусы
        long rub = 100; //Условие- шаг бонуса. За сколько рублей начисляется бонус размером bonusrub
        long bonusrub = 1; //Условие - сколько рублей начисляется за 1 значение rub
        if (sumpopolnenie > rublimit) {
            long newbonus = sumpopolnenie / rub * bonusrub;
            balanse = balanse + newbonus + sumpopolnenie;
            System.out.print("Число начисленных баллов за данное пополнение: ");
            System.out.println(newbonus);
            System.out.print("Общий баланс: ");
            System.out.println(balanse);//когда будет БД, добавить обновление значения в balanse
        }else {
            balanse = balanse + sumpopolnenie;
            System.out.print("Сумма пополнения не достигла акционных значений. Бонусы не начислены. Общий баланс: ");
            System.out.println(balanse);
            System.out.println("Если имеются проблемы с начислением баланса, попробуйте нам дозвониться, оператор один а вас много) ");

        }
        System.out.print("Спасибо за обращение!");
    }
}