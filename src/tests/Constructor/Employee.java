package tests.Constructor;

public class Employee {
    String name;
    int age;

    Employee(String name, int age){
      this.name = name;
      this.age = age;
    }
    void info() {
        System.out.println("Worker: " + name + "|  Age: " + age);
    }

    public static void main(String[] args) {
        Employee worker1 = new Employee("John Isaac", 33);
        Employee worker2 = new Employee("Mary Lee",24);
        System.out.println("Worker1 info is = "+worker1.name);
            worker1.info();
            worker2.info();

    }
}
