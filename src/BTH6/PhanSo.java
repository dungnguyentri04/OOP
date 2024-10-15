package BTH6;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo(int tu,int mau){
        this.tu=tu;
        if (mau!=0){
            this.mau=mau;
        }
        else throw new IllegalArgumentException("mau khac 0");
    }

    private int ucln(int a,int b){
        while (b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }

    final PhanSo add(PhanSo a){
        int tuso = this.tu*a.mau+this.mau*a.tu;
        int mauso = this.mau*a.mau;
        PhanSo result = new PhanSo(tuso,mauso);
        result.toigian(result);
        return result;
    }

    final PhanSo sub(PhanSo a){
        int tuso = this.tu*a.mau-this.mau*a.tu;
        int mauso = this.mau*a.mau;
        PhanSo result = new PhanSo(tuso,mauso);
        result.toigian(result);
        return result;
    }

    final PhanSo mul(PhanSo a){
        int tuso = this.tu*a.tu;
        int mauso = this.mau*a.mau;
        PhanSo result = new PhanSo(tuso,mauso);
        result.toigian(result);
        return result;
    }

    final PhanSo div(PhanSo a){
        if (a.tu==0) throw new IllegalArgumentException("Wrong");
        else {
            int tuso = this.tu * a.mau;
            int mauso = this.mau * a.tu;
            PhanSo result = new PhanSo(tuso, mauso);
            result.toigian(result);
            return result;
        }
    }

    public void toigian(PhanSo phanSo){
        int k=ucln(phanSo.tu,phanSo.mau);
        phanSo.tu=phanSo.tu/k;
        phanSo.mau=phanSo.mau/k;
    }

    public String toString(){
        return tu + "/" + mau;
    }
}
