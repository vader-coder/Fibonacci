## Fibonacci
fibonacci.java contains a Solution class, which contains methods to calculate the nth number of the fibonnaci sequence.
Solution.dynamicFibonacci(n) does this using dynamic programming, whereas Solution.recursiveFibonacci(n) uses the simple recursive approach.
The dynamic solution is faster than the simple recursive one because it stores intermediate values in an ArrayList the first time
it calculates then and calls them any other time, whereas the simple recursive approach discards these values. 
You can test this by compiling javac fibTest.java and running it with the command line arguments specifiying which nth fibonnaci numbers you want it to calculate. 
Example:
```
javac fibTest.java
java fibTest 3 50 100
```
This returns the 3rd, 50th, and 100th fibonnaci numbers. 
