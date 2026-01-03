public class ArmGear implements ArmorInterface {
    
    int level;
    String name;
    double minDefence;
    double maxDefence;
    String quality;

    private ArmGear(ArmGearBuilder ArmGearBuilder){
        this.level = ArmGearBuilder.level;
        this.name = ArmGearBuilder.name;
        this.minDefence = ArmGearBuilder.minDefence;
        this.maxDefence = ArmGearBuilder.maxDefence;
        this.quality = ArmGearBuilder.quality;
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
    public class ArmGearBuilder{
        int level;
        String name;
        double minDefence;
        double maxDefence;
        String quality;

        public ArmGearBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public ArmGearBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public ArmGearBuilder minDefence(int minDefence_){
            this.minDefence = minDefence_;
            return this;
        }
        public ArmGearBuilder maxDefence(int maxDefence_){
            this.maxDefence = maxDefence_;
            return this;
        }
        public ArmGearBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public ArmGear build(){
            return new ArmGear(this);
        }
    }
}

