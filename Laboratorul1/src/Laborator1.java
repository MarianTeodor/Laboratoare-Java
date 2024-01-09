public class Laborator1 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Exercitiul 1. Afișați lunile una sub cealaltă și numărul de zile corespunzătoare.
        System.out.println("1. Afișați lunile una sub cealaltă și numărul de zile corespunzătoare:");
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i] + " - " + month_days[i] + " days");
        }

        // Exercitiul 2:  Afișați lunile care au 31 de zile.
        System.out.println("\n2.  Afișați lunile care au 31 de zile:");
        for (int i = 0; i < months.length; i++) {
            if (month_days[i] == 31) {
                System.out.println(months[i]);
            }
        }

        // Exercitiul 3: Afișați lunile care au sub 31 de zile (și numărul lor)
        System.out.println("\n3. Afișați lunile care au sub 31 de zile (și numărul lor):");
        for (int i = 0; i < months.length; i++) {
            if (month_days[i] < 31) {
                System.out.println(months[i] + " - " + month_days[i] + " days");
            }
        }

        // Exercitiul 4: Afișați numărul total de zile al lunilor care au sub 31 de zile.
        System.out.println("\n4. Afișați numărul total de zile al lunilor care au sub 31 de zile:");
        int totalDays = 0;
        for (int i = 0; i < months.length; i++) {
            if (month_days[i] < 31) {
                totalDays += month_days[i];
            }
        }
        System.out.println("Total days for months with fewer than 31 days: " + totalDays);

        // Exercitiul 5: Repetați exercițiul 1 cu modificarea: afișați strict primele 3 caractere din fiecare luna.
        System.out.println("\n5. Repetați exercițiul 1 cu modificarea: afișați strict primele 3 caractere din fiecare luna:");
        for (int i = 0; i < months.length; i++) {
            String shortMonth = months[i].substring(0, 3);
            System.out.println(shortMonth + " - " + month_days[i] + " days");
        }
    }
}