package classes;

public class Student {
    String prenume;
    String nume;
    int numarGrupa;
    int nota;

    public Student(String prenume, String nume, int numarGrupa, int nota){
        this.prenume = prenume;
        this.nume = nume;
        this.numarGrupa = numarGrupa;
        this.nota = nota;
    }

    @Override
    public String toString(){
        return "Student{" + "prenume=" + prenume + ", nume=" + nume + ", numarGrupa=" + numarGrupa + '}';
    }

    public String getPrenume(){
        return prenume;
    }

    public void setPrenume(String prenume){
        this.prenume = prenume;
    }

    public String getNume(){
        return nume;
    }

    public void setNume(String nume){
        this.nume = nume;
    }

    public int getNumarGrupa(){
        return numarGrupa;
    }

    public void setNumarGrupa(int numarGrupa){
        this.numarGrupa = numarGrupa;
    }

    public String getNumeComplet(){
        return prenume + " " + nume;
    }
}
