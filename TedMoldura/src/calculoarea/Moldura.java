package calculoarea;

public class Moldura {
    private float areamoldura;
    
    public Moldura(float area_maior,float area_menor) {
        setAreaMoldura(area_maior,area_menor);
    }
    public void setAreaMoldura(float area_maior,float area_menor){
        this.areamoldura=area_maior-area_menor;
    }
    public float getAreaMoldura(){
        return this.areamoldura;
    }
}
