// G.Sai Aasrith
// 23WU0102057

public class OOP {
    public static void main(String[] args) {
        Pen p1=new Pen();//creation of  object
        p1.setColor("Red");    
        p1.setTip(5);
        p1.setPrice(10);
        System.out.println(p1.getColor() +" "+p1.getTip()  +" "+p1.price); 
    }
}
class Pen{
    private String color;//attributes
    private int tip;
    int price;
    
    
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }


    public void setColor(String newColor){//methods
        color=newColor;
    }
    protected void setTip(int newTip){
        tip=newTip;
    }
    void setPrice(int newPrice){
        price=newPrice;
    }
}
