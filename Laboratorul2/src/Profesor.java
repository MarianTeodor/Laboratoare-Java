package classes;

public class Profesor {
    String prenume;
    String nume;

    @Override
    public String toString(){
        return "Profesor{" + "prenume=" + prenume + ", nume=" + nume + '}';
    }

    public Profesor(String prenume, String nume){
        this.prenume = prenume;
        this.nume = nume;
    }

    public String getNumeComplet(){
        return prenume + " " + nume;
    }
}

