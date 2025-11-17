public class Shield {
    
    int level;
    String name;
    int minDamage;
    int maxDamage;
    String quality;

    private Shield(ShieldBuilder shieldBuilder){
        this.level = shieldBuilder.level;
        this.name = shieldBuilder.name;
        this.minDamage = shieldBuilder.minDamage;
        this.maxDamage = shieldBuilder.maxDamage;
        this.quality = shieldBuilder.quality;
    }

    public class ShieldBuilder{
        int level;
        String name;
        int minDamage;
        int maxDamage;
        String quality;

        public ShieldBuilder level(int level_){
            this.level = level_;
            return this;
        }
        public ShieldBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public ShieldBuilder minDamage(int minDamage_){
            this.minDamage = minDamage_;
            return this;
        }
        public ShieldBuilder maxDamage(int maxDamage_){
            this.maxDamage = maxDamage_;
            return this;
        }
    }
}
