public class Shield {
    
    int level;
    String name;
    double minDefence;
    double maxDefence;
    String quality;

    private Shield(ShieldBuilder shieldBuilder){
        this.level = shieldBuilder.level;
        this.name = shieldBuilder.name;
        this.minDefence = shieldBuilder.minDefence;
        this.maxDefence = shieldBuilder.maxDefence;
        this.quality = shieldBuilder.quality;
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
    public class ShieldBuilder{
        int level;
        String name;
        double minDefence;
        double maxDefence;
        String quality;

        public ShieldBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public ShieldBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public ShieldBuilder minDefence(int minDefence_){
            this.minDefence = minDefence_;
            return this;
        }
        public ShieldBuilder maxDefence(int maxDefence_){
            this.maxDefence = maxDefence_;
            return this;
        }
        public ShieldBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public Shield build(){
            return new Shield(this);
        }
    }
}
