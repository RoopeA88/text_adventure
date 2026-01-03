public class Wand implements WeaponInterface{
    private int level;
    private String name;
    private double minDamage;
    private double maxDamage;
    private String quality;

    private Wand(WandBuilder wandBuilder){
        this.level = wandBuilder.level;
        this.name = wandBuilder.name;
        this.minDamage = wandBuilder.minDamage;
        this.maxDamage = wandBuilder.maxDamage;
        this.quality = wandBuilder.quality;
    }

    public int getLevel(){
        return this.level;
    }
    public String getName(){
        return this.name;
    }
    public double getMinDamage(){
        return this.minDamage;
    }
    public double getMaxDamage(){
        return this.maxDamage;
    }
    public String getQuality(){
        return this.quality;
    }

    public class WandBuilder{
        private int level;
        private String name;
        private double minDamage;
        private double maxDamage;
        private String quality;

        public WandBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public WandBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public WandBuilder minDamage(double minDamage_){
            this.minDamage = minDamage_;
            return this;
        }
        public WandBuilder maxDamage(double maxDamage_){
            this.maxDamage = maxDamage_;
            return this;
        }
        public WandBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public Wand builder(){
            return new Wand(this);
        }
    }
}
