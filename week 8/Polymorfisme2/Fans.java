public class Fans
{
    private  String name;

    public Fans()
    {
        this.name = "noname";
    }
    public Fans(String name)
    {
        this.name = name;
    }
    public void showName()
    {
        System.out.print(name);
    }
    public void watchingPerformance()
    {
        System.out.println(name + ": Melihat idolanya di Youtube");
    }
    public void watchingPerformance(Musician musician)
    {
        if(musician instanceof Singer)
        {
            Singer singer = (Singer) musician;
            System.out.print(name + ": ");
            singer.perform();
        }
        else if(musician instanceof Kpop)
        {
            Kpop kpop = (Kpop) musician;
            System.out.print(name + ": ");
            kpop.perform();
        }
        else if(musician instanceof Biduan)
        {
            Biduan biduan = (Biduan) musician;
            System.out.print(name + ": ");
            biduan.perform();
        }
        else
        {
            System.out.print(name + ": ");
            musician.perform();
        }

    }
}
