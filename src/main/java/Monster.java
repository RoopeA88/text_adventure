public class Monster implements MonsterInterface {
    
    private String name;

    private double hitpoints;

    private double maxDamage;

    private double minDamage;

    private int level;

    public Monster(String type, int level_){
        if(type == "imp"){
            this.name = type;
            this.level = level_;
            this.hitpoints = level_*6;
            this.maxDamage = level_*0.75f;
            this.minDamage = level_*0.25f;
        }
    }

    public double getHitpoints(){
        return this.hitpoints;
    }
    public String getName(){
        return this.name;
    }
    public double getMaxDamage(){
        return this.maxDamage;
    }
    public double getMinDamage(){
        return this.minDamage;
    }
    public int getLevel(){
        return this.level;
    }

    
}
