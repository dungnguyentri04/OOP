package bth9;

public class HangTu {
    private double heso;
    private int somu;
    HangTu next;
    public HangTu(double heso, int somu){
        this.heso = heso;
        this.somu = somu;
        next = null;
    }

    public double getHeso() {
        return heso;
    }

    public int getSomu() {
        return somu;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    public void setSomu(int somu) {
        this.somu = somu;
    }
}
