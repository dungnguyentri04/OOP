package BTH5;

public class Journalist extends Employee{
    public Journalist(String name) {
        super(name);
    }

    @Override
    public void outNewspaper(){
        this.getNewspaper().removeJournalist(this);
    }

    @Override
    public void joinNewspaper(Newspaper newspaper){
        newspaper.addJournalist(this);
    }
}
