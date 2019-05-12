package lesson4;

public class City {

    private String state;
    private long population;

    public City(String state, long population){
        this.state = state;
        this.population = population;
    }

    public String getState(){
        return this.state;
    }

    public long getPopulation(){
        return this.population;
    }
}
