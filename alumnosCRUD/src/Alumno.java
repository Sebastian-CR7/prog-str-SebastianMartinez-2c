public class Alumno {
    private int id;
    private String nom;
    private double prom;
    private boolean activo;

    public Alumno(){}

    public Alumno(int id, String nom, double prom, boolean activo) {
        this.id = id;
        this.nom = nom;
        this.prom = prom;
        this.activo = activo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getProm() {
        return prom;
    }

    public void setProm(double prom) {
        this.prom = prom;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo)                                            {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prom=" + prom +
                ", activo=" + activo +
                '}';
    }
}