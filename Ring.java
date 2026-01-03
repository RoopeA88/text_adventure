public class Ring {
    private String name;
    private int level;
    private double iceDefence;
    private double fireDefence;
    private double earthDefence;
    private double poisonDefence;
    private double airDefence;
    private String quality;

    private Ring(RingBuilder RingBuilder){
        this.name = RingBuilder.name;
        this.level = RingBuilder.level;
        this.iceDefence = RingBuilder.iceDefence;
        this.fireDefence = RingBuilder.fireDefence;
        this.earthDefence = RingBuilder.earthDefence;
        this.poisonDefence = RingBuilder.poisonDefence;
        this.airDefence = RingBuilder.airDefence;
        this.quality = RingBuilder.quality;
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
    public class RingBuilder{

    private String name;
    private int level;
    private double iceDefence;
    private double fireDefence;
    private double earthDefence;
    private double poisonDefence;
    private double airDefence;
    private String quality;

    public RingBuilder name(String name_){
        this.name = name_;
        return this;
    }
    public RingBuilder level(int level_){
        this.level = level_;
        return this;
    }
    public RingBuilder iceDefence(double iceDefence_){
        this.iceDefence = iceDefence_;
        return this;
    }
    public RingBuilder fireDefence(double fireDefence_){
        this.fireDefence = fireDefence_;
        return this;
    }
    public RingBuilder earthDefence(double earthDefence_){
        this.earthDefence = earthDefence_;
        return this;
    }
    public RingBuilder poisonDefence(double poisonDefence_){
        this.poisonDefence = poisonDefence_;
        return this;
    }
    public RingBuilder airDefence(double airDefence_){
        this.airDefence = airDefence_;
        return this;
    }
    public RingBuilder quality(String quality_){
        this.quality = quality_;
        return this;
    }
    public Ring build(){
        return new Ring(this);
    }
    }
}
