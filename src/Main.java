public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Hello World!");

        //Задание1

        byte table = 3;
        short chair = 8;
        int armchair = 10;
        long stool = 17L;
        float flourWeight = 3.5f;
        double riceWeight = 2.5;
        boolean bool = true;
        char a = 37;
        char c = '%';
    }

    public static void task2() {

        //Задание2

        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double weightOffAllBoxers = boxer1 + boxer2;
        double weightDifference = Math.abs(boxer1 - boxer2);
        System.out.println("Общий вес боксеров " + weightOffAllBoxers + "кг! ");
        System.out.println("Разница в весе боксеров " + weightDifference + "кг!");
    }

    public static void task3() {

        //Задание3

        int bananas = 5;
        int bananasWeight = 80;

        int milk = 200/100;
        int milkWeight = 105;

        int IceCream = 2;
        int IceCreamWeight = 100;

        int Eggs = 4;
        int EggsWeight = 70;

        int sportsBreakfastWeightGr = (bananas * bananasWeight) + (milk * milkWeight) + (IceCream * IceCreamWeight) + (Eggs * EggsWeight);

        int grPerKg = 1000;
        double  sportsBreakfastWeightKg = sportsBreakfastWeightGr / (grPerKg * 1.0);

        System.out.println("Вес спорт-завтрака " + sportsBreakfastWeightKg + "кг! ");

    }

    public static void task4() {

        //Задание4

        int Weight = 7;
        int grInGg = 1000;
        int loseWeight = Weight * grInGg;

        int weightLossDiet1 = 250;
        int weightLossDiet2 = 500;
        int weightLossDays1 = loseWeight / weightLossDiet1;
        int weightLossDays2 = loseWeight / weightLossDiet2;

        int averageWeightLoss = (weightLossDays1 + weightLossDays2 ) / 2;

        System.out.println("Если худеть по 250г в день, то уйдет " + weightLossDays1 + " дней!");
        System.out.println("Если худеть по 500г в день, то уйдет " + weightLossDays2 + " дней!");
        System.out.println("Потребуется в среднем " + averageWeightLoss + " дней!");

    }

    public static void task5() {

    //Задание5
    int percent = 10;
    double multiplier = percent / (100*1.0);

    int mashaSalary= 67_760;
    int denisSalary = 83_690;
    int kristinaSalary = 76_230;
    int mashaNewSalary= (int) (mashaSalary + (mashaSalary * multiplier));
    int denisNewSalary= (int) (denisSalary + (denisSalary * multiplier));
    int kristinaNewSalary= (int) (kristinaSalary+ (kristinaSalary * multiplier));

    int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
    int denisDifference = (denisNewSalary - denisSalary) * 12;
    int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;



    System.out.println("Маша теперь получает "+ mashaNewSalary +" рублей." + " Годовой доход вырос на " + mashaDifference + " рублей.");
    System.out.println("Денис теперь получает "+ denisNewSalary +" рублей." + " Годовой доход вырос на " + denisDifference  + " руб.");
    System.out.println("Кристина теперь получает "+ kristinaNewSalary +" рублей." + " Годовой доход вырос на " + kristinaDifference + " руб.");




}
}