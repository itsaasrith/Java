// public class OOPs {
//         public static void main(String args[]) {
//         Pen p1=new Pen();//creted object
//         p1.setColor("Red");    
//         p1.setTip(5);
//         p1.setPrice(10);
//         System.out.println(p1.getColor() +" "+p1.getTip()  +" "+p1.price);

//         Bird eagle=new Bird();
//         eagle.wings();
//         eagle.breathe();
//         eagle.eat();

//         Parrot p_1=new Parrot();
//         p_1.setColor("Green");
//         System.out.println(p_1.Color);
//         p_1.eat();

//         Lion l=new Lion();
//         l.eat();
//         l.walks();
//         Hen h=new Hen();
//         h.eat();
//         h.walks();
//    }
// }

// class Pen{
//     private String color;//attributes
//     private int tip;
//     int price;
    
    
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }


//     public void setColor(String newColor){//methods
//         color=newColor;
//     }
//     protected void setTip(int newTip){
//         tip=newTip;
//     }
//     void setPrice(int newPrice){
//         price=newPrice;
//     }
// }

// // class BankAccount{
// //     public String username;
// //     private String Password;

// // }


// // single level inheritance:
// class Animal{  //parent or base class 
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// class Bird extends Animal{//child or Derived or sub class
//     int wings;
//     void wings(){
//         System.out.println("2");
//     }
//     void eat(){
//         System.out.println("eats only snakes");//method overriding(Polymorphism)
//     }
// }

// class Parrot extends Bird{//multi level inheritance
//     String Color;
//     void setColor(String writecolor){
//         Color=writecolor;
//     }

// }
// class Fish extends Animal{//Hierarchial inheritance
//     void swims(){
//         System.out.println("it swims");
//     }
// }
// // if we mix all class then it is called Hybrid inheritance

// // Abstractoin

// abstract class Carnivarous{
//     void eat(){
//         System.out.println("it eats");
//     }
//     abstract void walks();//we cant create a object for the carnivarous class
// }

// class Lion extends Carnivarous{
//     void walks(){
//         System.out.println("walks on four legs");
//     }
// }
// class Hen extends Carnivarous{
//     void walks(){
//         System.out.println("walks on 2 legs");
//     }
// } 