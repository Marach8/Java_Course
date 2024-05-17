package Java_Course;

public class Hello {
    public static void main(String [] args){
        System.out.println("This is my first time using intelliJ");
        System.out.println("I actually love writing Java");
        Laptop hp = new Laptop();
        hp.printNameOfLaptop();

    }
}


class Computer{
    public void printNameOfLaptop(){
        System.out.println("This Laptop is now giving me joy");
    }
}
class Laptop extends Computer{
    @Override
    public void printNameOfLaptop(){
        System.out.println("IntelliJ IDEA is a nice editor for Java");
    }
}