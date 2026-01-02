public class LegArmor implements ArmorInterface {

    private String name;
    private int level;
    double minDefence;
    double maxDefence;
    String quality;

    private LegArmor(LegArmorBuilder legArmorBuilder){
        this.name = legArmorBuilder.name;
        this.level = legArmorBuilder.level;
        this.minDefence = legArmorBuilder.minDefence;
        this.maxDefence = legArmorBuilder.maxDefence;
        this.quality = legArmorBuilder.quality;
    }
    public int getLevel(){
        return this.level;
    }
    public String getName(){
        return this.name;
    }
    public double getMinDefence(){
        return this.minDefence;
    }
    public double getMaxDefence(){
        return this.maxDefence;
    }
    public String getQuality(){
        return this.quality;
    }
    public class LegArmorBuilder{

        public int level;
        public String name;
        public double minDefence;
        public double maxDefence;
        public String quality;

        public LegArmorBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public LegArmorBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public LegArmorBuilder minDefence(double minDefence_){
            this.minDefence = minDefence_;
            return this;
        }
        public LegArmorBuilder maxDefence(double maxDefence_){
            this.maxDefence = maxDefence_;
            return this;
        }
        public LegArmorBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public LegArmor builder(){
            return new LegArmor(this);
        }
    }
}
