public class KpopFans extends Fans
{
    public KpopFans()
    {

    }
    public KpopFans(String name)
    {
        super(name);
    }
    public void watchingPerformance(Musician musician, String expresion)
    {
        if(musician instanceof Singer)
        {
            Singer singer = (Singer) musician;
            showName();
            System.out.print(": " + expresion + " ");
            singer.perform();
        }
        else if(musician instanceof Kpop)
        {
            Kpop kpop = (Kpop) musician;
            showName();
            System.out.print(": " + expresion + " ");
            kpop.perform();
        }
        else if(musician instanceof Biduan)
        {
            Biduan biduan = (Biduan) musician;
            showName();
            System.out.print(": " + expresion + " ");
            biduan.perform();
        }
        else
        {
            showName();
            System.out.print(": " + expresion + " ");
            musician.perform();
        }

    }
}
