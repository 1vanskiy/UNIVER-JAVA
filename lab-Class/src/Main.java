import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cars car = new Cars("", "", 0, "", 0, 0, 0, 0);

//        "","",0,"",0,0,0,0

        TeslaModelS modelS = new TeslaModelS("Tesla", "Model S", 2023, "electric", 320, 129990, 1.99, 1020);

        TeslaModel3 model3 = new TeslaModel3("Tesla", "Model 3", 2023, "electric", 260, 56990, 3.1, 450);

        TeslaModelX modelX = new TeslaModelX("Tesla", "Model X", 2023, "electric", 250, 99990, 2.7, 1020);


        BmwM8 M8 = new BmwM8("BMW", "M8", 2023, "gas", 300, 233000, 2, 625);

        BmwX5 X5 = new BmwX5("BMW", "X5", 2022, "gas", 250, 84840, 5, 265);

        BmwSeries6 Series6 = new BmwSeries6("BMW", "Series 6", 2022, "gas", 300, 63900, 5, 190);

        MercedesGLS GLS = new MercedesGLS("Mercedes-Benz", "GLS", 2022, "gas", 300, 128000, 6, 330);

        MercedesClassE classE = new MercedesClassE("Mercedes-Benz", "E-Class", 2021, "gas", 290, 82300, 7, 320);

        MercedesEQS EQS = new MercedesEQS("Mercedes-Benz", "EQS", 2023, "electric", 280, 140500, 3, 524);

        AudiQ8 Q8 = new AudiQ8("Audi", "Q8", 2023, "gas", 280, 101300, 5, 287);

        AudiEtron Etron = new AudiEtron("Audi", "E-tron S", 2023, "electric", 400, 1044900, 3, 503);

        AudiRS6 RS6 = new AudiRS6("Audi", "RS6", 2023, "gas", 390, 174000, 2.5, 600);

        PorscheCayenne Cayenne = new PorscheCayenne("Porsche", "Cayenne", 0, "gas", 230, 123400, 5, 340);

        Porsche911 p911 = new Porsche911("Porsche", "911", 2023, "gas", 360, 287000, 3, 580);

        PorscheTaycan Taycan = new PorscheTaycan("Porsche", "Taycan", 2022, "electric", 300, 157500, 2, 598);


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
                        System.out.println("Виберіть модель " + modelS.brand + ": ");
                        System.out.println("1. " + modelS.brand + " " + modelS.model);
                        System.out.println("2. " + model3.brand + " " + model3.model);
                        System.out.println("3. " + modelX.brand + " " + modelX.model);
                        System.out.println("4. " + "Показати всі моделі марки " + modelS.brand);
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
                        System.out.println("Виберіть модель " + X5.brand + ": ");
                        System.out.println("1. " + X5.brand + " " + X5.model);
                        System.out.println("2. " + M8.brand + " " + M8.model);
                        System.out.println("3. " + Series6.brand + " " + Series6.model);
                        System.out.println("4. " + "Показати всі моделі марки " + X5.brand);
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
                        System.out.println("Виберіть модель " + classE.brand + ": ");
                        System.out.println("1. " + classE.brand + " " + classE.model);
                        System.out.println("2. " + EQS.brand + " " + EQS.model);
                        System.out.println("3. " + GLS.brand + " " + GLS.model);
                        System.out.println("4. " + "Показати всі моделі марки " + classE.brand);
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
                            case 4:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                classE.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                EQS.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
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
                        System.out.println("Виберіть модель " + Etron.brand + ": ");
                        System.out.println("1. " + Etron.brand + " " + Etron.model);
                        System.out.println("2. " + RS6.brand + " " + RS6.model);
                        System.out.println("3. " + Q8.brand + " " + Q8.model);
                        System.out.println("4. " + "Показати всі моделі марки " + Etron.brand);
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
                            case 4:
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                Etron.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
                                System.out.println("------------------------------------------------------");
                                System.out.println("Ознайомтесь з характеристиками");
                                System.out.println(" ");
                                RS6.characteristic();
                                System.out.println(" ");
                                System.out.println("Покупка не можлива з причини: ");
                                System.out.println("НЕМАЄ В НАЯВНОСТІ");
                                System.out.println("------------------------------------------------------");
                                System.out.println(" ");
                                System.out.println(" ");
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
                        System.out.println("Виберіть модель " + Taycan.brand + ": ");
                        System.out.println("1. " + p911.brand + " " + p911.model);
                        System.out.println("2. " + Cayenne.brand + " " + Cayenne.model);
                        System.out.println("3. " + Taycan.brand + " " + Taycan.model);
                        System.out.println("4. " + "Показати всі моделі марки " + Taycan.brand);
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
                Scanner scanner = new Scanner(System.in);

                System.out.println("Ви вибрали продажу машини ");
                System.out.print("Введіть марку машини: ");
                String brand = scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть модель машини: ");
                String model = scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть рік випуску машини: ");
                int year = scanner.nextInt();
                scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть тип двигуна машини: ");
                String engine = scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть максимальну швидкість машини (км/год): ");
                int topSpeed = scanner.nextInt();
                scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть ціну машини: $");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть час розгону машини (0-100 км/год): ");
                double accelerate = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Введіть потужність двигуна машини (к.с.): ");
                int horsePower = scanner.nextInt();
                scanner.nextLine();
                System.out.println("------------------------------------------------------");
                System.out.print("Залиште нам ваш номер телефону: ");
                String userPhone = scanner.nextLine();
                System.out.println("------------------------------------------------------");

                Cars customCar = new Cars(brand, model, year, engine, topSpeed, price, accelerate, horsePower);

                // Виведення характеристик машини
                System.out.println(" ");
                System.out.println("------------------------------------------------------");
                System.out.println("Оголошення успішно створено!");
                System.out.println("Характеристики вашої машини:");
                System.out.println(" ");
                customCar.characteristic();
                System.out.println("------------------------------------------------------");
                System.out.println("Як тільки знайдемо вам потенційного клієнта ми вам обовязково");
                System.out.println("Зателефонуємо на цей номер телефону: " + userPhone);

                System.out.println("------------------------------------------------------");
                break;


            default:
                System.out.println("Некоректний вибір.");
                break;

        }


    }
}