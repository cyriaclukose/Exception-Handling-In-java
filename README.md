# Exception-Handling-In-java

Exception is an event that disrupts the normal flow of a program.
There are two kinds of exception.
Error :
Which occurs due to environmental issues.Its not possible to recover from an error.
Eg:Out of Memory error,Stack over flow error etc

Exception:
Exception occurs due to the application .The programme can recover from exception

   In the exception hierarchy we have throwable class at the top
 Then we have two sub classes Exception and Error.
   
   The Exception is further classified into checked and unchecked exception
   a)Unchecked Exception:They extend the RuntimeException class.It  is not necessary to handle the 
    unchecked exceptions .They occur during run time
   b)Checked Exception:They extend the Exception class directly.A checked exception needs to be handled
   other wise it will throw compile time error
   
   
  How to handle Checked Exception
     There are two ways to handle checked Exception. Either the exception 
     needs to be handled in the method or the  responsibility to handle the exception 
     should be passed on the calling method
     
     try -catch block is used to handle the exception with in the method
     
     Eg:
     try 
     {
     }catch(Exception e)
     {
     }
     
     if we want to pass the exception handling to the calling method then we have to declare the Exception using the throws key word in      the method
     
     Eg:
     public int sum(int a,int b) throws InvalidInput
     
     
     
     
