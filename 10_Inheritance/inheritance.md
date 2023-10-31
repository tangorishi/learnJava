# INHERITANCE IN JAVA

Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. 

In Java, the class which inherits the members of another class is called **derived class** and the class whose members are inherited is called **base class**. The derived class is the specialized class for the base class. 

***Types of Inheritance :***

## **1. Single inheritance :**

When one class inherits another class, it is known as single level inheritance 

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
```

## **2. Hierarchical inheritance :**

Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 

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
```

## **3. Multilevel inheritance :**

 Multilevel inheritance is a process of deriving a class from another derived class. 

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
class EquilateralTriangle extends Triangle {
   int side;
}
```

## **4. Hybrid inheritance :**

Hybrid inheritance is a combination of 
simple, multiple inheritance and hierarchical inheritance. 


