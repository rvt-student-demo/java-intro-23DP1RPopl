package lv.rvt.semestris2;

    class CD   {
    private String artist;
    private String name;
    private Integer year;
    private double weight = 0.1;

    public CD(String artist, String name, Integer year){
        this.artist = artist;
        this.name = name;
        this.year = year;
    }
    public double weight() {
        return weight;
    }
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }   
}
