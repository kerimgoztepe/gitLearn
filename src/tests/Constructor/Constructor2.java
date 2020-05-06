package tests.Constructor;

public class Constructor2 {
    String name = "John";
    int age = 30;
    // below const. example
    Constructor2(){
        this.name="John Berger";
        this.age=30;
    }

    public static void main(String[] args) {
        Constructor2 obj1 = new Constructor2();
        Constructor2 obj2= new Constructor2();

        System.out.println("name is = "+obj1.name+"| age is "+obj1.age);


    }


}
