public class Dagger {
    
    private int level;
    private String name;
    private int minDamage;
    private int maxDamage;
    private String quality;

    private Dagger(Daggerbuilder daggerbuilder){
        this.level = daggerbuilder.level;
        this.name = daggerbuilder.name;
        this.minDamage = daggerbuilder.minDamage;
        this.maxDamage = daggerbuilder.maxDamage;
        this.quality = daggerbuilder.quality;
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

    public class Daggerbuilder{

        public int level;
        public String name;
        public int minDamage;
        public int maxDamage;
        public String quality;

        public Daggerbuilder level(int level_){
            this.level = level_;
            return this;
        }
        public Daggerbuilder name(String name_){
            this.name = name_;
            return this;
        }
        public Daggerbuilder minDamage(int minDamage_){
            this.minDamage = minDamage_;
            return this;
        }
        public Daggerbuilder maxDamage(int maxDamage_){
            this.maxDamage = maxDamage_;
            return this;
        }
        public Daggerbuilder quality(String quality_){
            this.quality = quality_;
            return this;
        }
        public Dagger builder(){
            return new Dagger(this);
        }
    }
}
