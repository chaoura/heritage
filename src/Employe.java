public class Employe extends Personne {
    String cnss;

    public String getCnss() {
        return cnss;
    }

    public void setCnss(String cnss) {
        this.cnss = cnss;
    }

    public Employe(String nom, String adresse, String cnss) {
        super(nom, adresse);
        this.cnss = cnss;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "cnss='" + cnss + '\'' +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
