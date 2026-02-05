package com.exerciseWithoutJoins10;

public class Exercise1 {
    public static void main(String[] args) {
        /**
         1.
         CREATE DATABASE sql_practice;

         2.
         USE sql_practice;

         3.
         CREATE TABLE employees (
         emp_id INT PRIMARY KEY,
         name VARCHAR(50),
         department VARCHAR(50),
         salary INT,
         age INT,
         city VARCHAR(50),
         join_date DATE,
         status VARCHAR(20)
         );

         4.
         desc employees ;

         5.
         INSERT INTO employees VALUES
         (1, 'Amit', 'IT', 60000, 25, 'Delhi', '2021-01-10', 'ACTIVE'),
         (2, 'Rahul', 'HR', 45000, 28, 'Mumbai', '2020-03-15', 'ACTIVE'),
         (3, 'Priya', 'IT', 75000, 30, 'Bangalore', '2019-07-23', 'ACTIVE'),
         (4, 'Neha', 'Finance', 50000, 26, 'Delhi', '2021-11-01', 'INACTIVE'),
         (5, 'Suresh', 'HR', 40000, 35, 'Chennai', '2018-05-19', 'ACTIVE'),
         (6, 'Anita', 'Finance', 90000, 40, 'Mumbai', '2016-02-14', 'ACTIVE'),
         (7, 'Vikas', 'IT', 55000, 24, 'Delhi', '2022-06-30', 'ACTIVE'),
         (8, 'Pooja', 'HR', 48000, 29, 'Bangalore', '2021-09-12', 'INACTIVE'),
         (9, 'Rohit', 'IT', 80000, 34, 'Mumbai', '2017-12-05', 'ACTIVE'),
         (10, 'Kiran', 'Finance', 65000, 31, 'Chennai', '2019-04-27', 'ACTIVE'),
         (11, 'Deepak', 'IT', 72000, 27, 'Delhi', '2020-10-10', 'ACTIVE'),
         (12, 'Meena', 'HR', 52000, 33, 'Mumbai', '2018-08-08', 'ACTIVE'),
         (13, 'Arjun', 'Finance', 47000, 23, 'Bangalore', '2022-01-17', 'ACTIVE'),
         (14, 'Sneha', 'IT', 58000, 28, 'Chennai', '2021-03-22', 'INACTIVE'),
         (15, 'Manish', 'HR', 61000, 36, 'Delhi', '2016-06-01', 'ACTIVE');


         🟢 Level 1: Basics

         1. Display all employees
         SELECT * FROM employees;

         2. Display only name and salary
         SELECT name, salary FROM employees;

         3. Display unique departments
         SELECT DISTINCT department FROM employees;
         ⚠️ DISTINCT(department) also works, but standard style is without brackets.

         4. Display employees from IT department
         SELECT *
         FROM employees
         WHERE department = 'IT';

         5. Display employees with salary > 60000
         SELECT *
         FROM employees
         WHERE salary > 60000;

         6. Display employees with age < 30
         SELECT *
         FROM employees
         WHERE age < 30;

         7. Display employees from Delhi
         SELECT *
         FROM employees
         WHERE city = 'Delhi';

         8. Display employees whose status is ACTIVE
         SELECT *
         FROM employees
         WHERE status = 'ACTIVE';

         9. Display employees ordered by salary ascending
         SELECT *
         FROM employees
         ORDER BY salary ASC;
         ℹ️ ASC is default, but writing it is a good habit.

         10. Display employees ordered by salary descending
         SELECT *
         FROM employees
         ORDER BY salary DESC;

         11. Display top 5 highest paid employees
         SELECT *
         FROM employees
         ORDER BY salary DESC
         LIMIT 5;

         12. Display employees with salary between 50000 and 80000
         SELECT *
         FROM employees
         WHERE salary BETWEEN 50000 AND 80000;
         ⚠️ BETWEEN is inclusive (includes 50000 & 80000).

         13. Display employees whose name starts with 'A'
         SELECT *
         FROM employees
         WHERE name LIKE 'A%';

         14. Display employees whose name ends with 'a'
         SELECT *
         FROM employees
         WHERE name LIKE '%a';

         15. Display employees whose city is Mumbai or Delhi
         SELECT *
         FROM employees
         WHERE city IN ('Mumbai', 'Delhi');
         ✔️ This is the cleaner & scalable way.

         16. Display employees who are NOT ACTIVE
         SELECT *
         FROM employees
         WHERE status != 'ACTIVE';

         17. Display employees older than 30
         SELECT *
         FROM employees
         WHERE age > 30;

         18. Display employees joined after 2020
         SELECT *
         FROM employees
         WHERE join_date > '2020-12-31';
         ✔️ This correctly means after 2020, not including 2020.

         19. Display employees joined before 2019
         SELECT *
         FROM employees
         WHERE join_date < '2019-01-01';

         20. Display employees ordered by age
         SELECT *
         FROM employees
         ORDER BY age;



         🟡 Level 2: Aggregates (21–40)

         Count total employees

         Find maximum salary

         Find minimum salary

         Find average salary

         Find total salary paid

         Count employees in IT department

         Count employees in each department

         Find average salary of IT department

         Find max salary per department

         Find min salary per department

         Count employees per city

         Find average age of employees

         Find average age per department

         Count ACTIVE employees

         Count INACTIVE employees

         Find highest salary in Finance

         Find lowest salary in HR

         Find total salary per department

         Find average salary per city

         Count employees older than 30


         Solution -
         select count(*) from employees;
         select max(salary) from employees;
         select min(salary) from employees;
         select avg(salary) from employees;
         select sum(salary) from employees;
         select department, count(*) from employees where department = 'IT' group by department;
         select department, count(*) from employees group by department;
         select department, avg(salary) from employees where department = 'IT' group by department;
         select department, max(salary) as max_salary from employees group by department;
         select department, min(salary) as min_salary from employees group by department;
         select city, count(*) from employees group by city;
         select avg(age) from employees;
         select department, avg(age) from employees group by department;
         select count(*) from employees where status = 'ACTIVE' group by status;
         select count(*) from employees where status = 'INACTIVE' group by status;
         select max(salary) from employees where department = 'FINANCE' group by department;
         select min(salary) from employees where department = 'HR' group by department;
         select department, sum(salary) from employees group by department;
         select city, avg(salary) from employees group by city;
         select count(*) from employees where age > 30;


         But for some cases Group By is not required

         26. Count employees in IT department
         SELECT COUNT(*)
         FROM employees
         WHERE department = 'IT';
         ✅ Correct
         ⚠️ GROUP BY department is not required here.

         28. Find average salary of IT department
         SELECT AVG(salary)
         FROM employees
         WHERE department = 'IT';
         ✅ Correct
         ⚠️ GROUP BY not needed when result is single row.

         34. Count ACTIVE employees
         SELECT COUNT(*)
         FROM employees
         WHERE status = 'ACTIVE';
         ✅ Correct
         ⚠️ No need for GROUP BY status

         36. Find highest salary in Finance
         SELECT MAX(salary)
         FROM employees
         WHERE department = 'Finance';
         ✅ Correct
         ⚠️ MySQL is case-insensitive, but keep consistent casing.


         */
    }
}
