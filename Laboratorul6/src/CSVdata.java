package classes;

public class CSVdata implements Comparable<CSVdata>{
    String Rankul;
    String Genul;
    String Numele;

    public CSVdata(String Rankul, String Genul, String Numele) {
        this.Numele = Numele;
        this.Rankul = Rankul;
        this.Genul = Genul;

    }

    public int compareTo(CSVdata other){
        return this.Numele.compareTo(other.Numele);
    }

    @Override
    public String toString() {
        return  "Rankul=" + Rankul +
                ", Genul=" + Genul +
                ", Numele=" + Numele;
    }
}