public class BodyArmor implements ArmorInterface {
    
    int level;
    String name;
    double minDefence;
    double maxDefence;
    String quality;

    private BodyArmor(BodyArmorBuilder BodyArmorBuilder){
        this.level = BodyArmorBuilder.level;
        this.name = BodyArmorBuilder.name;
        this.minDefence = BodyArmorBuilder.minDefence;
        this.maxDefence = BodyArmorBuilder.maxDefence;
        this.quality = BodyArmorBuilder.quality;
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
    public class BodyArmorBuilder{
        private int level;
        private String name;
        private double minDefence;
        private double maxDefence;
        private String quality;

        public BodyArmorBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public BodyArmorBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public BodyArmorBuilder minDefence(int minDefence_){
            this.minDefence = minDefence_;
            return this;
        }
        public BodyArmorBuilder maxDefence(int maxDefence_){
            this.maxDefence = maxDefence_;
            return this;
        }
        public BodyArmorBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public BodyArmor build(){
            return new BodyArmor(this);
        }
    }
}

