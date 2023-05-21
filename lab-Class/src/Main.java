import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cars car = new Cars("", "", 0, "", 0, 0, 0, 0);

//        "","",0,"",0,0,0,0

        Tesla tesla = new Tesla("Tesla", "", 0, "", 0, 0, 0, 0);

        TeslaModelS modelS = new TeslaModelS("Tesla", "Model S", 2023, "electric", 320, 129990, 1.99, 1020);

        TeslaModel3 model3 = new TeslaModel3("Tesla", "Model 3", 2023, "electric", 260, 56990, 3.1, 450);

        TeslaModelX modelX = new TeslaModelX("Tesla", "Model X", 2023, "electric", 250, 99990, 2.7, 1020);


        BmwM8 M8 = new BmwM8("BMW", "M8", 2023, "gas", 300, 233000, 2, 625);

        BmwX5 X5 = new BmwX5("BMW", "X5", 2022, "gas", 250, 84840, 5, 265);

        BmwSeries6 Series6 = new BmwSeries6("BMW", "Series 6", 2022, "gas", 300, 63900, 5, 190);


        Bmw bmw = new Bmw("BMW", "", 0, "", 0, 0, 0, 0);


        Mercedes mercedes = new Mercedes("Mercedes", "", 0, "", 0, 0, 0, 0);

        MercedesGLS GLS = new MercedesGLS("Mercedes-Benz", "GLS", 2022, "gas", 300, 128000, 6, 330);

        MercedesClassE classE = new MercedesClassE("Mercedes-Benz", "E-Class", 2021, "gas", 290, 82300, 7, 320);

        MercedesEQS EQS = new MercedesEQS("Mercedes-Benz", "EQS", 2023, "electric", 280, 140500, 3, 524);


        Audi audi = new Audi("Audi", "", 0, "", 0, 0, 0, 0);

        AudiQ8 Q8 = new AudiQ8("Audi", "Q8", 2023, "gas", 280, 101300, 5, 287);

        AudiEtron Etron = new AudiEtron("Audi", "E-tron S", 2023, "electric", 400, 1044900, 3, 503);

        AudiRS6 RS6 = new AudiRS6("Audi", "RS6", 2023, "gas", 390, 174000, 2.5, 600);


        Porsche porsche = new Porsche("Porsche", "", 0, "", 0, 0, 0, 0);

        PorscheCayenne Cayenne = new PorscheCayenne("Porsche", "Cayenne", 0, "gas", 230, 123400, 5, 340);

        Porsche911 p911 = new Porsche911("Porsche", "911", 2023, "gas", 360, 287000, 3, 580);

        PorscheTaycan Taycan = new PorscheTaycan("Porsche", "Taycan", 2022, "electric", 300, 157500, 2, 598);


// prints

//
//        modelS.characteristic();
//
//        System.out.println(" ");
//
//        modelX.characteristic();
//
//        System.out.println(" ");
//
//        model3.characteristic();
//
//        System.out.println(" ");
//
//        M8.characteristic();
//
//        System.out.println(" ");
//
//        X5.characteristic();
//
//        System.out.println(" ");
//
//        Series6.characteristic();
//
//        System.out.println(" ");
//
//        GLS.characteristic();
//
//        System.out.println(" ");
//
//        classE.characteristic();
//
//        System.out.println(" ");
//
//        EQS.characteristic();


        Scanner input = new Scanner(System.in);

        System.out.println("Доброго дня! ");
        System.out.println("Ласкаво просимо на наш торговий майданчик! ");
        System.out.println("Для продовження, будьласка, виберіть дію: ");
        System.out.println("1. Купити автомобіль ");
        System.out.println("2. Продати автомобіль ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                Scanner inputBrand = new Scanner(System.in);
                System.out.println("Виберіть марку авто: ");
                System.out.println("1. Tesla ");
                System.out.println("2. BMW ");
                System.out.println("3. Mercedes-Benz ");
                System.out.println("4. Audi ");
                System.out.println("5. Porsche ");
                int choiceBrand = inputBrand.nextInt();

                switch (choiceBrand) {
                    case 1:
                        Scanner inputModel = new Scanner(System.in);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Виберіть модель " + tesla.brand + ": ");
                        System.out.println("1. " + modelS.brand + " " + modelS.model);
                        System.out.println("2. " + model3.brand + " " + model3.model);
                        System.out.println("3. " + modelX.brand + " " + modelX.model);
                        System.out.println("4. " + "Показати всі моделі марки " + tesla.brand);
                        System.out.println("------------------------------------------------------");
                        int choiceModel = inputModel.nextInt();
                        switch (choiceModel) {
                            case 1:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                modelS.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;

                            case 2:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                model3.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                            case 3:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                modelX.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                            case 4:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                modelS.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                model3.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                modelX.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                        }
                        break;
                    case 2:
                        Scanner inputModel2 = new Scanner(System.in);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Виберіть модель " + bmw.brand + ": ");
                        System.out.println("1. " + X5.brand + " " + X5.model);
                        System.out.println("2. " + M8.brand + " " + M8.model);
                        System.out.println("3. " + Series6.brand + " " + Series6.model);
                        System.out.println("4. " + "Показати всі моделі марки " + bmw.brand);
                        System.out.println("------------------------------------------------------");
                        int choiceModel2 = inputModel2.nextInt();
                        switch (choiceModel2) {
                            case 1:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                X5.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;

                            case 2:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                M8.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                            case 3:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Series6.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                            case 4:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                X5.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                M8.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Series6.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("------------------------------------------------------");
                        Scanner inputModel3 = new Scanner(System.in);
                        System.out.println("Виберіть модель " + mercedes.brand + ": ");
                        System.out.println("1. " + classE.brand + " " + classE.model);
                        System.out.println("2. " + EQS.brand + " " + EQS.model);
                        System.out.println("3. " + GLS.brand + " " + GLS.model);
                        System.out.println("4. " + "Показати всі моделі марки " + mercedes.brand);
                        System.out.println("------------------------------------------------------");
                        int choiceModel3 = inputModel3.nextInt();
                        switch (choiceModel3) {
                            case 1:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                classE.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;

                            case 2:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                EQS.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                            case 3:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                GLS.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                        }
                        break;

                    case 4:
                        Scanner input4 = new Scanner(System.in);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Виберіть модель " + audi.brand + ": ");
                        System.out.println("1. " + Etron.brand + " " + Etron.model);
                        System.out.println("2. " + RS6.brand + " " + RS6.model);
                        System.out.println("3. " + Q8.brand + " " + Q8.model);
                        System.out.println("4. " + "Показати всі моделі марки " + audi.brand);
                        System.out.println("------------------------------------------------------");
                        int choiceModel4 = input4.nextInt();
                        switch (choiceModel4) {
                            case 1:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Etron.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;

                            case 2:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                RS6.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                            case 3:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Q8.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                break;
                        }
                        break;
                    case 5:
                        Scanner input5 = new Scanner(System.in);
                        System.out.println("------------------------------------------------------");
                        System.out.println("Виберіть модель " + porsche.brand + ": ");
                        System.out.println("1. " + p911.brand + " " + p911.model);
                        System.out.println("2. " + Cayenne.brand + " " + Cayenne.model);
                        System.out.println("3. " + Taycan.brand + " " + Taycan.model);
                        System.out.println("4. " + "Показати всі моделі марки " + porsche.brand);
                        System.out.println("------------------------------------------------------");
                        int choiceModel5 = input5.nextInt();
                        switch (choiceModel5) {
                            case 1:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                p911.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");

                            case 2:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Cayenne.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                            case 3:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Taycan.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                        }
                        break;
                }
                break;

            case 2:
                System.out.println("Введіть довжину сторони рівностороннього трикутника:");
//                double side = martin.nextDouble();
//                EquilateralTriangle equilateralTriangle = new EquilateralTriangle(side);
//                System.out.println("Периметр трикутника: " + equilateralTriangle.getPerimeter());
//                System.out.println("Площа трикутника: " + equilateralTriangle.getArea());
                break;


            default:
                System.out.println("Некоректний вибір.");
                break;

        }


    }
}