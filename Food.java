public class Food {

    private String name;
    private double hp;

    private Food(FoodBuilder foodBuilder){
        this.name = foodBuilder.name;
        this.hp = foodBuilder.hp;
    }
    public String getName(){
        return this.name;

    }
    public double getHp(){
        return this.hp;
    }
    public class FoodBuilder{
        
        private String name;
        private double hp;

        public FoodBuilder name(String name_){
            this.name = name_;
            return this;
        }
        public FoodBuilder hp(double hp_){
            this.hp = hp_;
            return this;
        }
        public Food build(){
            return new Food(this);
        }
    }
}
