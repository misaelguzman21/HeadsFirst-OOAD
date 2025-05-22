public class GuitarSpec {

    private String model;
    private Builder builder;
    private int numStrings;
    private Type type;
    private Wood backWood, topWood;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood){
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.numStrings = numStrings;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public Builder getBuilder(){
        return this.builder;
    }

    public String getModel(){
        return this.model;
    }

    public Type getType(){
        return this.type;
    }

    public Wood getBackWood(){
        return this.backWood;
    }

    public Wood getTopWood(){
        return this.topWood;
    }

    public int getNumStrings(){
        return this.numStrings;
    }

    public boolean matches(GuitarSpec otherSpec){
        if(builder != otherSpec.builder){
            return false;
        }
        if((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))){
            return false;
        }
        if(!type.equals(otherSpec.type)){
            return false;
        }
        if(numStrings != otherSpec.numStrings){
            return false;
        }
        if(backWood != otherSpec.backWood){
            return false;
        }
        if(topWood != otherSpec.topWood){
            return false;
        }
        return true;
    }
}
