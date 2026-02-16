class Animal{
  public void bark(){
    System.out.println("Animal Barks");
  }
}
class Dog extends Animal{
  public void bark(){
    System.out.println("Dog Barks");
  }
}
public class Main{
  public static void main(String args[]){
    Animal animal=new Animal();
    animal.bark();
    animal=new Dog();
    animal.bark();
  }
}
