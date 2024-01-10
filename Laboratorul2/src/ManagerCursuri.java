package classes;

import java.sql.Connection;

public class ManagerCursuri {
    Curs[] cursuri;

    public ManagerCursuri(){
        Connection conn = null;
        cursuri = new Curs[0];
    }

    public void adaugareCurs(Curs curs){
        int nouaLungime = cursuri.length + 1;
        Curs[] aux = new Curs[nouaLungime];
        int index = 0;

        for(Curs c : cursuri){
            aux[index++]=c;
        }
        aux[index] = curs;
        this.cursuri = new Curs[nouaLungime];
        System.arraycopy(aux, 0, cursuri, 0, nouaLungime);
    }

    public void afisareCursuriConsola(){
        for(Curs curs: cursuri){
            System.out.println(curs);
        }
    }

    public void inscrieStudentInCurs(String numeCurs, Student student) {
        for (Curs curs : cursuri) {
            if (curs.nume.equals(numeCurs)) {
                curs.adaugareStudent(student);
                break;
            }
        }
    }

    public void listeazaStudentiInCurs(String numeCurs) {
        for (Curs curs : cursuri) {
            if (curs.nume.equals(numeCurs)) {
                System.out.println("Studentii din cursul " + curs.nume + " sunt:");

                for(Student student : curs.studenti){
                    System.out.println(student.getNumeComplet());
                }
                break;
            }
            else{
                System.out.println("Nu exista nici un student in cursul " + curs.nume);
            }
        }
    }

    public void calculeazaMediaNoteiPentruCurs(String numeCurs) {
        for (Curs curs : cursuri) {
            if (curs.nume.equals(numeCurs)) {
                Student[] studentiInCurs = curs.studenti;

                if (studentiInCurs.length == 0) {
                    System.out.println("Nu exista nici un student in cursul " + curs.nume);
                }
                int totalNote = 0;

                for (Student student : studentiInCurs) {
                    totalNote += student.nota;
                }
                System.out.println("Media acestui curs " + curs.nume + " este: " + (double) totalNote / studentiInCurs.length);
            }
            else{
                System.out.println("Cursul acesta nu exista");
            }
        }
    }

    public void calculeazaMediaNoteiDupaProfesor(Profesor profesor) {
        int totalNote = 0;
        int totalStudenti = 0;

        for (Curs curs : cursuri) {
            if (curs.profesor.equals(profesor)) {
                Student[] studentiInCurs = curs.studenti;
                totalStudenti += studentiInCurs.length;

                for (Student student : studentiInCurs) {
                    totalNote += student.nota;
                }
            }
        }

        System.out.println("Media tuturor cursurilor ale profesorului " + profesor.getNumeComplet() + " este: " + (double) totalNote / totalStudenti);
    }
}

