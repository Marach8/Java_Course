package Java_Course;

public class Hello {
    public static void main(String [] args){
        System.out.println("This is my first time using intelliJ");
        System.out.println("I actually love writing Java");
        Laptop hp = new Laptop();
        Laptop.Nnanna myName = hp.new Nnanna();
        hp.printNameOfLaptop();
        Laptop.NamesOfPeople[] namesOfPeople = Laptop.NamesOfPeople.values();
        for(var name : namesOfPeople){
            System.out.println(name);
        }
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

    public enum NamesOfPeople {Daniel, Emmanuel, David, Okoro;}

    class Nnanna{
        final String name = "Ajah Emmanuel Nnanna";
        public void printNameOfPerson(){
            System.out.println(name);
        }
    }
}