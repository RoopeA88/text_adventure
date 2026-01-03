public class Potion {
    private String name;
    private double hp;
    private double mp;
    private double poison;
    private double earth;
    private double fire;
    private double ice;
    private double air;

    private Potion(PotionBuilder potionBuilder){
        this.name = potionBuilder.name;
        this.hp = potionBuilder.hp;
        this.mp = potionBuilder.mp;
        this.poison = potionBuilder.poison;
        this.earth = potionBuilder.earth;
        this.fire = potionBuilder.fire;
        this.ice = potionBuilder.ice;
        this.air = potionBuilder.air;
    }

    public String getName(){
        return this.name;
    }
    public double getHp(){
        return this.hp;
    }
    public double getMp(){
        return this.mp;
    }
    public double getPoison(){
        return this.poison;
    } 
    public double getEarth(){
        return this.earth;
    }
    public double getFire(){
        return this.fire;
    }
    public double getIce(){
        return this.ice;
    }
    public double getAir(){
        return this.air;
    }
    public class PotionBuilder{
    private String name;
    private double hp;
    private double mp;
    private double poison;
    private double earth;
    private double fire;
    private double ice;
    private double air;

    public PotionBuilder name(String name_){
        this.name = name_;
        return this;
    }
    public PotionBuilder hp(double hp_){
        this.hp = hp_;
        return this;
    }
    public PotionBuilder mp(double mp_){
        this.mp = mp_;
        return this;
    }
    public PotionBuilder poison(double poison_){
        this.poison = poison_;
        return this;
    }
    public PotionBuilder earth(double earth_){
        this.earth = earth_;
        return this;
    }
    public PotionBuilder fire(double fire_){
        this.fire = fire_;
        return this;
    }
    public PotionBuilder ice(double ice_){
        this.ice = ice_;
        return this;
    }
    public PotionBuilder air(double air_){
        this.air = air_;
        return this;
    }
    public Potion build(){
        return new Potion(this);
    }

}
}
