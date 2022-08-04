public class Main {
    public static void main(String[] args) {

        //Задание1
        byte table = 3;
        short chair = 8;
        int armchair = 10;
        long stool = 17L;
        float flourWeight = 3.5f;
        double riceWeight = 2.5;
        boolean b = 10 > 5;
        char a = 37;
        char c = '%';


        //Задание2
        float boxer1 = 78.2f;
        float boxer2 = 82.7f;
        float weightOffAllBoxers = boxer1 + boxer2;
        float weightDifference = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + weightOffAllBoxers + "кг! ");
        System.out.println("Разница в весе боксеров " + weightDifference + "кг!" );

        //Задание3
        int bananasWeight = 5 * 80;
        int milkWeight = 200 / 100 * 105;
        int IceCreamSundaeWeight = 2 * 100;
        int rawEggsWeight = 4 * 70;
        int sportsBreakfastWeightGr = bananasWeight + milkWeight + IceCreamSundaeWeight + rawEggsWeight;
        int grPerKg = 1000;
        float weightKg = sportsBreakfastWeightGr / (float)grPerKg;
        float sportsBreakfastWeightKg = sportsBreakfastWeightGr / 1000f;
        System.out.println("Вес спорт-завтрака " + sportsBreakfastWeightKg + "кг! ");

        //Задание4
        int loseWeight = 7 * 1000;
        int weightLossDiet1 = 250;
        int weightLossDiet2 = 500;
        int weightLossDays1 = loseWeight / weightLossDiet1;
        int weightLossDays2 = loseWeight / weightLossDiet2;
        int averageWeightLoss = (weightLossDiet1 + weightLossDiet2) / 2;
        int weightLossOnAverage = loseWeight / averageWeightLoss;
        System.out.println("Если худеть по 250г в день, то уйдет " + weightLossDays1 + " дней!");
        System.out.println("Если худеть по 500г в день, то уйдет " + weightLossDays2 + " дней!");
        System.out.println("Потребуется в среднем " + weightLossOnAverage + " дней!" );

        //Задание5
        int Masha = 67_760;
        int Denis = 83_690;
        int Kristina = 76_230;
        float MashaUpSalaryPercent = Masha * 0.1f;
        float DenisUpSalaryPercent = Denis * 0.1f;
        float KristinaUpSalaryPercent = Kristina * 0.1f;
        float MashaSalaryIncreaseAmount = Masha + MashaUpSalaryPercent;
        float DenisSalaryIncreaseAmount = Denis + DenisUpSalaryPercent;
        float KristinaSalaryIncreaseAmount = Kristina + KristinaUpSalaryPercent;
        float MashaAnnualIncomeBeforeIncrease = Masha * 12f;
        float DenisAnnualIncomeBeforeIncrease = Denis * 12f;
        float KristinaAnnualIncomeBeforeIncrease = Kristina * 12f;
        float MashaAnnualIncomeAfterIncrease = MashaSalaryIncreaseAmount * 12f;
        float DenisAnnualIncomeAfterIncrease = DenisSalaryIncreaseAmount * 12f;
        float KristinaAnnualIncomeAfterIncrease = KristinaSalaryIncreaseAmount * 12f;
        float MashaAnnualIncomeIncreased = MashaAnnualIncomeAfterIncrease - MashaAnnualIncomeBeforeIncrease;
        float DenisAnnualIncomeIncreased = DenisAnnualIncomeAfterIncrease - DenisAnnualIncomeBeforeIncrease;
        float KristinaAnnualIncomeIncreased = KristinaAnnualIncomeAfterIncrease - KristinaAnnualIncomeBeforeIncrease;

        System.out.println("Маша теперь получает " + MashaSalaryIncreaseAmount + " рублей");
        System.out.println("Денис теперь получает " + DenisSalaryIncreaseAmount + " рублей");
        System.out.println("Кристина теперь получает " + KristinaSalaryIncreaseAmount + " рублей");

        System.out.println("Годовой доход Маши вырос на " + MashaAnnualIncomeIncreased + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + DenisAnnualIncomeIncreased + " рублей");
        System.out.println("Годовой доход Кристины вырос на " +  KristinaAnnualIncomeIncreased + " рублей");

        System.out.println("Годовой доход Маши теперь " + MashaAnnualIncomeAfterIncrease + " рублей" );
        System.out.println("Годовой доход Дениса после теперь " + DenisAnnualIncomeAfterIncrease + " рублей" );
        System.out.println("Годовой доход Кристины после теперь  " + KristinaAnnualIncomeAfterIncrease + " рублей" );










































    }
}