package classes;

public class Clase {
    public static void main(String[] args){
        Student[] studenti = new Student[]{new Student("Andrei", "Negoita", 2231, 4), new Student("Ion", "Mateescu", 4221,8)};
        Student Marian = new Student("Marian", "Minzala", 2231, 6);
        Profesor prof = new Profesor("Anton", "Panaitescu");


        Curs curs;
        curs = new Curs("Material Resistance", "Calculations of Reactions, \n" + "effort diagrams, calculations of geometric characteristics of\n" + "flat surfaces and calculations of resistance elements to simple stresses", prof, studenti);

        curs.adaugareStudent(Marian);

        ManagerCursuri managerCursuri = new ManagerCursuri();
        managerCursuri.adaugareCurs(curs);
        managerCursuri.afisareCursuriConsola();
        managerCursuri.listeazaStudentiInCurs("Rezistența Materialelor");
        managerCursuri.calculeazaMediaNoteiPentruCurs("Rezistența Materialelor");
        managerCursuri.calculeazaMediaNoteiDupaProfesor(prof);
    }
}
