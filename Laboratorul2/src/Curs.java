package classes;

public class Curs {
    String nume;
    String descriere;
    Profesor profesor;
    Student[] studenti;

    public Curs(String nume, String descriere, Profesor profesor, Student[] studenti){
        this.nume = nume;
        this.descriere = descriere;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public void actualizareProfesor(Profesor profesor){
        this.profesor = profesor;
    }

    public void adaugareStudent(Student student){
        int nouaLungime = studenti.length + 1;
        Student[] aux = new Student[nouaLungime];
        int index = 0;
        for(Student s : studenti){
            aux[index++] = s;
        }

        aux[index] = student;

        this.studenti = new Student[nouaLungime];
        System.arraycopy(aux, 0, studenti, 0, nouaLungime);
    }

    @Override
    public String toString(){
        String str = "Curs:" + "nume=" + nume + ", descriere=" + descriere + ",\nProfesor=" + profesor + ".\nStudenti:\n";
        for(Student s : studenti){
            str += s + "\n";
        }
        return str;
    }
}

