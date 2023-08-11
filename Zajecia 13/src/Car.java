public class Car {
    private int liczbaDrzwi;
    private double pojemnoscSilnika;
    private int rokProdukcji;
    private String marka;
    private String model;
    private boolean wheel;

    public Car(int liczbaDrzwi, double pojemnoscSilnika, int rokProdukcji, String marka, String model, boolean wheel) {
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.rokProdukcji = rokProdukcji;
        this.marka = marka;
        this.model = model;
        this.wheel = wheel;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    public void setLiczbaDrzwi(int liczbaDrzwi) {
        this.liczbaDrzwi = liczbaDrzwi;
    }

    public double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isWheel() {
        return wheel;
    }

    public void setWheel(boolean wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return marka +
                ", " + pojemnoscSilnika +
                ", " + rokProdukcji +
                ", '" + liczbaDrzwi + '\'' +
                ", '" + model + '\'' +
                ", " + wheel;
    }
}
