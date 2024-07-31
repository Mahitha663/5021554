Concept of Recursion
Recursion is a method of solving a problem where the solution involves solving smaller instances of the same problem. A recursive algorithm typically has two parts:

Base Case: The simplest instance of the problem, which can be solved directly without further recursion.
Recursive Case: The more complex instance of the problem, which is broken down into smaller instances and solved using the same algorithm.
Recursion can simplify problems by breaking them down into more manageable subproblems. However, recursive algorithms can lead to excessive computation and stack overflow if not handled properly, especially for large inputs.

Analysis
Time Complexity
The time complexity of the recursive algorithm is O(n), where n is the number of years. This is because each recursive call decreases the number of years by one until it reaches the base case.

Optimization
To optimize the recursive solution and avoid excessive computation, we can use memoization. Memoization stores the results of expensive function calls and reuses them when the same inputs occur again, reducing the number of redundant calculations.

