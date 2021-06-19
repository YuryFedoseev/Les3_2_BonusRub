public class Main {
    public static void main(String[] args) {
        long sumpopolnenie = 1100; //Сумма пополнения
        long balanse = 100; //Баланс человека
        long rublimit = 1000; //Условие - пополнение свыше которого копятся бонусы
        long rub = 100; //Условие- шаг бонуса. За сколько рублей начисляется бонус
        long newbonus = 0 ;
        if (sumpopolnenie > rublimit) {
            newbonus = sumpopolnenie / rub ;
            balanse = balanse + newbonus + sumpopolnenie;
        }else {
            balanse = balanse + sumpopolnenie;
        }
        System.out.println("Число начисленных бонусных баллов за данное пополнение: " + newbonus);
        System.out.println("Общий баланс: " + balanse );
    }
}