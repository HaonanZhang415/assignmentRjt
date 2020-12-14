package homework1211;

public abstract class Event {

    protected String name;
    protected String detail;
    protected String type;
    protected String organizer;

    public Event(String name, String detail, String type, String organizer) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organizer = organizer;
    }

    protected abstract Double calculateAmount();
}

class Exhibition extends Event {

    private Integer noOfStalls;
    private Double rentPerStall;

    public Exhibition(String name, String detail, String type, String organizer, Integer noOfStalls, Double rentPerStall) {
        super(name, detail, type, organizer);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    @Override
    public Double calculateAmount() {
        return noOfStalls * rentPerStall;
    }
}

class StageEvent extends Event {

    private Integer noOfShows;
    private Double costPerShow;

    public StageEvent(String name, String detail, String type, String organizer, Integer noOfShows, Double costPerShow) {
        super(name, detail, type, organizer);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    @Override
    public Double calculateAmount() {
        return noOfShows * costPerShow;
    }
}

class Main2 {

    public static void main(String[] args) {

        StageEvent se = new StageEvent("JJ magic show","Comedy magic","Entertainment","Jegadeesh",5,1000d);
        System.out.println(se.calculateAmount());

    }

}