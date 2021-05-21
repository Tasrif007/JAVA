interface GeometricObject{
    public double getArea();
    public double getPerimeter();
}
class Circle implements GeometricObject{
    private double radius;
   public Circle(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "The given radius is :"+radius;
    }
    public double getArea(){
        return 3.1416*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.1416*radius;
    }
}
class Rectangle implements GeometricObject{
    private double width;
    private double length;
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public double getArea(){
        return 2*length*width;
    }
    public double getPerimeter(){
        return width*length;
    }
    public String toString(){
        return "The given width is : "+width+" And length is :"+length;
    }
}
class Result{
public static void main(String[] args){
    Circle res=new Circle(12.0);
    System.out.println("Circle has Area :"+res.getArea()+"\n"+"Circle has Perimeter :"+res.getPerimeter()+"\n"+res.toString());
    Rectangle cir=new Rectangle(3.0,9.0);
    System.out.println("Rectangle has Area :"+cir.getArea()+"\n"+"Rectangle has Perimeter :"+cir.getPerimeter()+"\n"+cir.toString());
    
}


