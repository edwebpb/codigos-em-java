package calculoarea;

public class CalculaArea {
    private boolean interno;
    private float largura;
    private float altura;
    private float area;
    
    public CalculaArea(float largura,float altura){
        setLargura(largura);
        setAltura(altura);
    }
    public CalculaArea (float largura,float altura, boolean interno, float larguranova){
        this.interno = interno;
        if (this.interno){ 
            setLargura(largura-larguranova);
            setAltura(altura-larguranova);
        } else {
            setLargura(largura+larguranova);
            setAltura(altura+larguranova);
        }
    }
    public final void setLargura(float largura){
        this.largura=largura;
    }
    public final void setAltura(float altura){
        this.altura=altura;
    }
    public void setArea(){
        this.area=this.altura*this.largura;
    }
    public float getArea(){
        return this.area;
    }
}


