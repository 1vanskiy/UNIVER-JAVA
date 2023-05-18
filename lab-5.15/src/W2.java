public class W2 {
    public static void main(String[] args) {

        //Створити програму визначення та виводу у консоль
        // площі та периметру прямокутного трикутника,
        // якщо довжина катетів складає 3 та 4.
        int p, s, site1, site2, site3, pif;
        site1 = 3;
        site2 = 4;
        site3 = (int) Math.sqrt(site1*site1 + site2*site2);
        p = site1 + site2 + site3;
        s = (site1 * site2)/2;
        System.out.println("Сторорни трикутника: " + site1 + " см " + site2 + " см " + site3 + " см.");
        System.out.println("Периметр трикутника: " + p + " см.");
        System.out.println("Площа трикутника:" + s + " см^2");

    }
}
