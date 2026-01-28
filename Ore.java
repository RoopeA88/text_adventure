public class Ore {

    private String name;
    

    private Ore(OreBuilder OreBuilder){
        this.name = OreBuilder.name;
        
    }
    public String getName(){
        return this.name;

    }
    
    public static class OreBuilder{
        
        private String name;
        

        public OreBuilder name(String name_){
            this.name = name_;
            return this;
        }
        
        public Ore build(){
            return new Ore(this);
        }
    }
}

