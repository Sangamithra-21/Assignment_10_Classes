package Assignment_10_class;


public class Team {

       public String name;
       public String city;
       public String division;
       Player[] players;
       Team(String name,String city,String division,Player[] players)
       {
           this.name=name;
           this.city=city;
           this.division=division;
           this.players=players;
       }
       public void playGame()
       {
           System.out.println("Team"+name+"from"+city+"("+division+") playing Game");
       }
       public void hireCoach()
       {
           System.out.println("Coach Hiring...!");
       }

}
class Player
{
    public String name;
    public String position;
    public int jersyNumber;

    Player(String name,String position,int jersyNumber)
    {
        this.name=name;
        this.position=position;
        this.jersyNumber=jersyNumber;
    }

    public void playGame()
    {
        System.out.println(name+" has a position "+position+" with jersyNumber"+jersyNumber+"playing Game");
    }
    public void train()
    {
        System.out.println("Trainer trained a Players");
    }
}
