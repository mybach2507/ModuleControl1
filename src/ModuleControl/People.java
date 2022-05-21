package ModuleControl;

public class People {
    private String name;

    private boolean canGoToWar;

    private String rank;

    private String soldier;

    private String captain;

    private String general;

    private boolean ableToSay;
    private boolean hasDependencies;
    private int size;
    private String[] array = new String[size];

    public People()
    {
        this.rank=soldier;
        this.canGoToWar=true;
    }
    public String getRank(String rank)
    {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setSize(int size)
    {
        this.size=size;
    }
    public void addPeople(String rank)
    {
        int counter=0;
        String[] array = new String[size];

        if(array[counter] == null){
            counter++;
            for (int i = 1;i<size; i++) {
                if(array[i]==null)
                {
                    array[i] = name;
                }
                if(counter==size){
                    break;
                }
            }
        }
    }
    public void searchPeople(String rank)
    {

    }
    public void printDependencies(String rank)
    {
        int soldierCounter = 0;
        for(int i = 0; i<size; i++)
        {
            if(this.rank==soldier)
            {
                soldierCounter++;
            }
        }
        int captainCounter = 0;
        for(int i = 0; i<size; i++)
        {
            if(this.rank==captain)
            {
                int dependencies=0;
                for(int y=0;y<size;y++)
                {
                    if(array[y]==soldier)
                    {
                        dependencies++;
                        System.out.println("captain has "+dependencies+" dependencies");
                    }
                }
                captainCounter++;
            }
        }
        int generalCounter = 0;
        for(int i = 0; i<size; i++)
        {
            if(this.rank==general)
            {
                captainCounter++;
            }
        }

    }
    public interface ableToWar{

    }


}

