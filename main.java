class Shapes{
public void area(){
System.out.println("Find area");
}
public void area(int r){
System.out.println("Circle area:"+3.04*r*r);
}
public void area(double b,double h){
System.out.println("Tringle area:"+1.5*b*h);
}
public void area(int l,int h){
System.out.println("Rectangle area:"+l*h);
}
}
public class main{
public static void main (String args[]){
Shapes myshape=new shapes();
myshape.area();
myshape.area(5);
myshape.area(6,0,1,2);
myshape.area(6,2);
}
}
