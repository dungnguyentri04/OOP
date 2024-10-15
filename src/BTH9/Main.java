package BTH9;

public class Main {
    public static void main(String[] args){
        DaThuc daThuc1 = new DaThuc();
        DaThuc daThuc2 = new DaThuc();
        daThuc1.add(new HangTu(1,3));
        daThuc1.add(new HangTu(-6,2));
        daThuc1.add(new HangTu(1,0));
        daThuc2.add(new HangTu(-2,1));
        daThuc2.add(new HangTu(-3,2));
        daThuc2.add(new HangTu(-7,0));
        DaThuc daThuc3 = DaThuc.AddDaThuc(daThuc1,daThuc2);
        System.out.println(daThuc1.toString());
        System.out.println(daThuc2.toString());
        System.out.println(daThuc3.toString());
        System.out.println(daThuc3.caculate(1));
    }
}
