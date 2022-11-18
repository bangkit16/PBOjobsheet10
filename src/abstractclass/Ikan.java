package abstractclass;

public class Ikan extends Hewan{
    @Override
    public void bergerak(){
        System.out.println("Berjalan dengan SIRIP, \"wush..wush..\"");
    }
    public void makan(){
        System.out.println("Ikan juga bisa makan");
    }
}
