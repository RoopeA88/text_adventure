public class Sword implements WeaponInterface{

    private int level;
    private String name;
    private double minDamage;
    private double maxDamage;
    private String quality;
    private String character;

    public Sword(SwordBuilder swordBuilder){

        this.level = swordBuilder.level;
        this.name = swordBuilder.name;
        this.minDamage = swordBuilder.minDamage;
        this.maxDamage = swordBuilder.maxDamage;
        this.quality = swordBuilder.quality;
        this.character = swordBuilder.character;
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

    public static class SwordBuilder{

        private int level;
        private String name;
        private double minDamage;
        private double maxDamage;
        private String quality;
        private String character;

        public SwordBuilder level(int level_){

            this.level = level_;
            return this;
        }

        public SwordBuilder name(String name_){
            this.name = name_;
            return this;
        }

        public SwordBuilder minDamage(double minDamage_){
            this.minDamage = minDamage_;
            return this;
        }

        public SwordBuilder maxDamage(double maxDamage_){
            this.maxDamage = maxDamage_;
            return this;
        }

        public SwordBuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }

        public SwordBuilder character(String character_){
            this.character = character_;
            return this;
        }

        public Sword build(){
            return new Sword(this);
        }
        

    }
}
