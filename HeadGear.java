public class HeadGear implements ArmorInterface {
    
    int level;
    String name;
    double minDefence;
    double maxDefence;
    String quality;

    private HeadGear(HeadGearBuilder HeadGearBuilder){
        this.level = HeadGearBuilder.level;
        this.name = HeadGearBuilder.name;
        this.minDefence = HeadGearBuilder.minDefence;
        this.maxDefence = HeadGearBuilder.maxDefence;
        this.quality = HeadGearBuilder.quality;
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
    public class HeadGearBuilder{
        private int level;
        private String name;
        private double minDefence;
        private double maxDefence;
        private String quality;

        public HeadGearBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public HeadGearBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public HeadGearBuilder minDefence(int minDefence_){
            this.minDefence = minDefence_;
            return this;
        }
        public HeadGearBuilder maxDefence(int maxDefence_){
            this.maxDefence = maxDefence_;
            return this;
        }
        public HeadGearBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public HeadGear build(){
            return new HeadGear(this);
        }
    }
}

