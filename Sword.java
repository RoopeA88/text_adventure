public class Sword {

    private int level;
    private String name;
    private int minDamage;
    private int maxDamage;
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

    private class SwordBuilder{

        private int level;
        private String name;
        private int minDamage;
        private int maxDamage;
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

        public SwordBuilder minDamage(int minDamage_){
            this.minDamage = minDamage_;
            return this;
        }

        public SwordBuilder maxDamage(int maxDamage_){
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
