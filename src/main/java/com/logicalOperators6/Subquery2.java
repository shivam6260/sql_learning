package com.logicalOperators6;

public class Subquery2 {
    public static void main(String[] args) {
        /**
         1️⃣ What is a Subquery?
         A subquery is:
         One SQL query written inside another SQL query

         2️⃣ Basic Structure
         SELECT ...
         FROM table
         WHERE column OPERATOR (SELECT ...);

         3️⃣ Types of Subqueries (IMPORTANT)
         | Type                  | Returns      | Used with          |
         | --------------------- | ------------ | ------------------ |
         | Scalar subquery       | Single value | =, >, <            |
         | Multiple-row subquery | Many rows    | IN, ANY, ALL       |
         | Correlated subquery   | Row-by-row   | Interview favorite |

         4️⃣ Scalar Subqueries (Single Value)
         Example 1: Employees earning above average salary
         Step-by-step thinking:
         Find average salary
         Use it in main query

         SELECT *
         FROM employees
         WHERE salary > (SELECT AVG(salary) FROM employees);

         Example 2: Oldest employee
         SELECT *
         FROM employees
         WHERE age = (SELECT MAX(age) FROM employees);

         Example 3: Second highest salary
         Logic:
         Remove highest salary
         Find max of remaining

         SELECT MAX(salary)
         FROM employees
         WHERE salary < (SELECT MAX(salary) FROM employees);

         5️⃣ Subqueries in SELECT clause
         Yes, subqueries can go in SELECT.
         Example: Show each employee + company average salary

         SELECT
         name,
         salary,
         (SELECT AVG(salary) FROM employees) AS avg_salary
         FROM employees;

         6️⃣ Multiple-row Subqueries (IN, ANY, ALL)
         Example 4: Employees earning same salary as someone else
         SELECT *
         FROM employees
         WHERE salary IN (
         SELECT salary
         FROM employees
         GROUP BY salary
         HAVING COUNT(*) > 1
         );

         Example 5: Employees earning more than all HR employees
         SELECT *
         FROM employees
         WHERE salary > ALL (
         SELECT salary
         FROM employees
         WHERE department = 'HR'
         );



         */
    }
}
