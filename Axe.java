public class Axe {
    private int level;
    private String name;
    private int minDamage;
    private int maxDamage;
    private String quality;

    private Axe(AxeBuilder axeBuilder){
        this.level = axeBuilder.level;
        this.name = axeBuilder.name;
        this.minDamage = axeBuilder.minDamage;
        this.maxDamage = axeBuilder.maxDamage;
        this.quality = axeBuilder.quality;
    }

    public int getLevel(){
        return this.level;
    }
    public String getName(){
        return this.name;
    }
    public int getMinDamage(){
        return this.minDamage;
    }
    public int getMaxDamage(){
        return this.maxDamage;
    }
    public String getQuality(){
        return this.quality;
    }
    
    public class AxeBuilder{
        private int level;
        private String name;
        private int minDamage;
        private int maxDamage;
        private String quality;

        public AxeBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public AxeBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public AxeBuilder minDamage(int minDamage_){
            this.minDamage = minDamage_;
            return this;
        }
        public AxeBuilder maxDamage(int maxDamage_){
            this.maxDamage = maxDamage_;
            return this;
        }
        public AxeBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public Axe builder(){
            return new Axe(this);
        }

    }
}
