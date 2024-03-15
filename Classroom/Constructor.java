package Classroom;

public class Constructor {
    Constructor(int number){
      System.out.println("Constructer Created"); 
      System.out.println("Bike no is "+number); 
      System.out.println(id +" "+name);
    }
    Constructor(int i,String str,int m){
        id=i;
        name=str;
        marks=m;
    }

    int id;
    String name;
    int marks;
    public static void main(String[] args) {
        Constructor obj=new Constructor(105);//constructor decleres automatic
        Constructor obj1=new Constructor(5, "Tony", 98);
        System.out.println(obj1.id+obj1.name+obj1.marks);
        Student st=new Student();//diff b/w constructer and class
        st.id();//we are declering the object
    }
}
class Student{
    int id;
    String Name;
    void id(){
        System.out.println("hello");
    }

}
