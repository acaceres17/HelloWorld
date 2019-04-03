package CH8Classes;

public class AntonioCaceresDVDMod {
     //DVD title
    private String title;
    // DVD director
    private String director;
    // DVD year
    private int year;
    private double cost;
     //is blueray class
    private boolean blueray;


    public AntonioCaceresDVDMod(String title, String director, int year, double cost, boolean blueray) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
        this.blueray = blueray;
    }

    @Override
    public String toString() {
        String result = "$" + String.format("%.2f", cost) + "\t" + year + "\t" + String.format("%-20s", title) + "\t" + String.format("%-25s", director);
        if(blueray)
            result += "\tBlu-Ray";

        return result;
    }
}