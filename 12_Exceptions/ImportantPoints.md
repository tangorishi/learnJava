##  points related to exception handling. 


1.  You can write multiple catch Blocks for one one try{}. But make sure that you write the handling code of the Children class Exception above the parent Class Exception.

     ```
		   catch (ArithmeticException e ) {
			   System.out.println(e.toString());

		   }catch(Exception e) {
			   System.out.println(e.toString());
		   }
	
     ```

2. From JDK1.7 it is allowed to catch more than one exception in the same catch block, but there should not be a parent-child relation between them, and they are separeted by | .

    ```
      catch (ArithmeticException | ArrayIndexOutOfBoundsException e)
	
     ```

3. 
     | Condition | allowed |
     |:--|:--|
     | try - catch |  &#x2611; | 
     | catch - try |  &#x274C; |
     | single try - multiple catch | &#x2611; |
     | multiple try - single catch | &#x274C; |
     | multiple try-catch | &#x2611; |
     | try-finally | &#x2611; |
     | catch-finally | &#x274C; |

4.   #### try(R) 
       try with resources is also allowed. this will automatically close the resource after execution of try block, even if any exception occurs, it will close the resource. 

     it is same as 
    ```
          try{

          }finally{

          }
     ``` 