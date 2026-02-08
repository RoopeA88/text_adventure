public class Amulet {
    private String name;
    private int level;
    private double iceDefence;
    private double fireDefence;
    private double earthDefence;
    private double poisonDefence;
    private double airDefence;
    private String quality;

    private Amulet(AmuletBuilder amuletBuilder){
        this.name = amuletBuilder.name;
        this.level = amuletBuilder.level;
        this.iceDefence = amuletBuilder.iceDefence;
        this.fireDefence = amuletBuilder.fireDefence;
        this.earthDefence = amuletBuilder.earthDefence;
        this.poisonDefence = amuletBuilder.poisonDefence;
        this.airDefence = amuletBuilder.airDefence;
        this.quality = amuletBuilder.quality;
    }
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }
    public double getIceDefence(){
        return this.iceDefence;
    }
    public double getFireDefence(){
        return this.fireDefence;
    }
    public double getEarthDefence(){
        return this.earthDefence;
    }
    public double getPoisonDefence(){
        return this.poisonDefence;
    }
    public double getAirDefence(){
        return this.airDefence;
    }
    public String getQuality(){
        return this.quality;
    }
    public class AmuletBuilder{

    private String name;
    private int level;
    private double iceDefence;
    private double fireDefence;
    private double earthDefence;
    private double poisonDefence;
    private double airDefence;
    private String quality;

    public AmuletBuilder name(String name_){
        this.name = name_;
        return this;
    }
    public AmuletBuilder level(int level_){
        this.level = level_;
        return this;
    }
    public AmuletBuilder iceDefence(double iceDefence_){
        this.iceDefence = iceDefence_;
        return this;
    }
    public AmuletBuilder fireDefence(double fireDefence_){
        this.fireDefence = fireDefence_;
        return this;
    }
    public AmuletBuilder earthDefence(double earthDefence_){
        this.earthDefence = earthDefence_;
        return this;
    }
    public AmuletBuilder poisonDefence(double poisonDefence_){
        this.poisonDefence = poisonDefence_;
        return this;
    }
    public AmuletBuilder airDefence(double airDefence_){
        this.airDefence = airDefence_;
        return this;
    }
    public AmuletBuilder quality(String quality_){
        this.quality = quality_;
        return this;
    }
    public Amulet build(){
        return new Amulet(this);
    }
    }
}
