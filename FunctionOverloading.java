import java.util.*;

class FunctionOverloading{
    public static int volume(int l)             // volume of cube 
    {
        return l*l*l;     
    }
    public static int volume(int l, int b , int h)   //volume of cuboied
    {
        return l*b*h;
    }
    public static int volume(int r , int h)     // volume of cylinder 
    {
        return (int)3.14*r*r*h;       
    }
    public static void main(String args[])
    {
       System.out.println("Volume of cube :" + volume(3));
       System.out.println("Volume of cuboid :" + volume(3,5,7));
       System.out.println("Volume of cylinder :" + volume(4,6));
    }
}