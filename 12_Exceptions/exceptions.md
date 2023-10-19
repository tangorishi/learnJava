
# Exception

In Java, an Exception is an unexpected event that can cause a program to terminate abruptly.\
Handling exceptions is important to ensure smooth program termination even in unexpected situations.\

 **Types of exception**
1. Checked Exception\
       Unchecked Exception will be compiled easily and if any exception(Unchecked) occurs at runtime, abnormal termination of the program.
2. Unchecked Exception\
        At runtime, a Checked exception may occur, but the difference here is that handling code must be written for it to compile.

**** ****

***Exception Handling***

* Handling exceptions in Java involves using try-catch, throw, throws, and finally keywords.We will examine each of these in detail.


* try-catch

     Whenever you're writing some code that could potentially cause an exception put it in a try block. This way, if an exception occurs, you can catch it and handle it appropriately in a catch block.


    ```
      try{

        // code that could potentially cause an exception put it here
   
      }catch(ExceptionClass e){
   
        // handling code
   
      }
    ```




  *example:*
  if you attempt to divide a number by zero, ArithmeticException will occur.
  ```
    public class Main {

	      public static void main(String [] args) {
		
		      try{

                 int x = 10/0;         //ArithmeticException occurred here
                
              } catch (ArithmeticException e) {    // handling code for Exception 

			        System.out.println(e.getMessage());
		       }

		      System.out.println("normal termination"); //Handling exceptions prevents program crashes.
       
          }
   }

  ```

* throws 

     If you don't want to handle the exception,  you can duck it, by declaring it in the method signature, and the caller of this method has to handle it. It is recommended not to throw the unchecked exception.


    ```  
    public class Main {

            public static void main(String [] args) {
	                 try { 
		                  m1(10 ,0);
	                 }catch (ArithmeticException e ) {
		                   System.out.println(e.getMessage());
	                 }
            }
	
	        public static void m1(int a, int b) throws ArithmeticException {
		             int ans = 0;
	                 ans = a / b;
		             System.out.println("a/b = "+ans);
            }
	
    }
    ```

* throw

    Even after handling the Exception, if you want to throw the exception object to the caller use the throw keyword.
lines after throw will not be executed.
   ```  
    public class Main {

        	 public static void main(String [] args) {
	               try { 
		           m1(10 ,0);
	               }catch (ArithmeticException e ) {
		            System.out.println(e.getMessage());
	               }
             }
	
	        public static void m1(int a, int b) throws ArithmeticException {
		            int ans = 0;
		            try {
		            ans = a / b;
		            } catch (ArithmeticException e ) {
		            System.out.println(e.toString());
		            throw e;
	            	}
		            System.out.println("a/b = "+ans);
                }
	
    }
  ```

* finally 
   
   code inside finally lock will be executed when


     | Condition | finally block |
     |:--|:--|
     | Exception not occured | &#x2611; |  
     | Exception occured & catch block matched |  &#x2611; |
     | Exception occured & catch block not matched |  &#x2611; |


finally block is generally used to close the resources.


  ```
    public static void m1(int a, int b) throws ArithmeticException {
		   int ans = 0;

		   try {
		        ans = a / b;
		   } catch (ArithmeticException e ) {
		         System.out.println(e.toString());
		         throw e;
		   }finally {
			      System.out.println("this code will be executed");
		   }

    }

  ```


    
 *To understand the hierarchy of Exception, please refer to the [Exception Hierarchy.](./ExceptionHierarchy.jpeg)*




### Here are some points related to exception handling. 




