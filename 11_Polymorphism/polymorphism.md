# POLYMORPHISM IN JAVA

Polymorphism is the ability to present the same interface for differing underlying forms (data types). With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and morphism means ‘forms’. 


**Types of Polymorphism** 


1. Compile Time Polymorphism (Static)

2. Runtime Polymorphism (Dynamic) 

## ***Compile Time Polymorphism :***

The polymorphism which is implemented at the compile time is known as compile-time polymorphism. Example - Method Overloading 

*Method Overloading*

Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. Method overloading can be possible on the following basis: 


1. The type of the parameters passed to the function.


2. The number of parameters passed to the function.

```
class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }


   public void displayInfo(int age) {
       System.out.println(age);
   }


   public void displayInfo(String name, int age) {
 System.out.println(name);
       System.out.println(age);
   }
}

```

## ***Runtime Polymorphism :***

 Runtime polymorphism is also known as dynamic polymorphism. 

 
 ***Function overriding is an example of runtime polymorphism.***

 
Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class. In case of function overriding, ***parent and child classes both contain the same function with a different definition.*** The call to the function is determined at runtime is known as runtime polymorphism.


```
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}
```

### Benefits of polymorphism**


Polymorphism offers a number of benefits, including:

## Code reuse: 

Polymorphism allows you to reuse code by writing methods that can be used with different types of objects. This can save you time and effort, and it can also make your code more maintainable.


## Flexibility: 
Polymorphism makes your code more flexible by allowing you to change the behavior of your program at runtime. This can be useful for implementing features such as pluggability and dynamic dispatch.



## Extensibility:
Polymorphism makes your code more extensible by allowing you to add new functionality without breaking existing code. This is because you can override existing methods in subclasses to provide new implementations.


**Conclusion**
Polymorphism is a powerful feature of Java that can be used to write more reusable, flexible, and extensible code. By understanding how to use polymorphism, you can write better code that is easier to maintain and extend.
