package BTH9;

import BTH2.Node;

public class DaThuc {
    HangTu head;
    public DaThuc(){
        head=null;
    }

    public void add(HangTu hangTu){
        if (hangTu.getHeso()!=0) {
            if (head == null||hangTu.getSomu()< head.getSomu()) {
                hangTu.next=head;
                head = hangTu;
            }
            else if (hangTu.getSomu()==head.getSomu()){
                head.setHeso(hangTu.getHeso()+ head.getHeso());
            }
            else {
                HangTu tmp = head;
                while (tmp.next != null && tmp.next.getSomu()<hangTu.getSomu()) {
                        tmp=tmp.next;
                }
                if (tmp.getSomu()!=hangTu.getSomu()) {
                    hangTu.next = tmp.next;
                    tmp.next = hangTu;
                }
                else {
                    tmp.setSomu(tmp.getSomu()+hangTu.getSomu());
                }
            }
        }
    }

    public void mul(HangTu hangTu){
        HangTu tmp=head;
        while (tmp!=null){
            tmp.setHeso(tmp.getHeso()*hangTu.getHeso());
            tmp.setSomu(tmp.getSomu()+hangTu.getSomu());
            tmp=tmp.next;
        }
    }

    public static DaThuc AddDaThuc(DaThuc daThuc1,DaThuc daThuc2){
        HangTu tmp1=daThuc1.head;
        HangTu tmp2=daThuc2.head;
        DaThuc result=new DaThuc();
        while (true){
            if (tmp1==null){
                while (tmp2!=null){
                    result.add(new HangTu(tmp2.getHeso(),tmp2.getSomu()));
                    tmp2=tmp2.next;
                }
                break;
            } else if (tmp2==null) {
                while (tmp1!=null){
                    result.add(new HangTu(tmp1.getHeso(),tmp1.getSomu()));
                    tmp1=tmp1.next;
                }
                break;
            }
            else if (tmp2.getSomu()== tmp1.getSomu()){
                result.add(new HangTu(tmp1.getHeso()+ tmp2.getHeso(),tmp1.getSomu()));
                tmp2=tmp2.next;
                tmp1=tmp1.next;
            }
            else if (tmp2.getSomu()<tmp1.getSomu()){
                result.add(new HangTu(tmp2.getHeso(),tmp2.getSomu()));
                tmp2=tmp2.next;
            }
            else {
                result.add(new HangTu(tmp1.getHeso(),tmp1.getSomu()));
                tmp1=tmp1.next;
            }
        }
        return result;
    }

    public double caculate(double x){
        HangTu tmp = head;
        double sum=0;
        if (head==null) return sum;
        while (tmp!=null){
            sum+=tmp.getHeso()*Math.pow(x,tmp.getSomu());
            tmp=tmp.next;
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder dathuc = new StringBuilder();
        HangTu hangTu = head;
        if (hangTu==null) return dathuc.toString();
        while (hangTu.next!=null){
            dathuc.append(hangTu.getHeso()).append("X^").append(hangTu.getSomu()).append(" + ");
            hangTu=hangTu.next;
        }
        dathuc.append(hangTu.getHeso()).append("X^").append(hangTu.getSomu());
        return dathuc.toString();

    }


}
