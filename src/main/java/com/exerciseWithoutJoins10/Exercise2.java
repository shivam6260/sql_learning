package com.exerciseWithoutJoins10;

public class Exercise2 {
    public static void main(String[] args) {
        /**
         41. Departments having more than 3 employees
         SELECT department
         FROM employees
         GROUP BY department
         HAVING COUNT(*) > 3;

         42. Cities having more than 2 employees
         SELECT city
         FROM employees
         GROUP BY city
         HAVING COUNT(*) > 2;

         43. Departments with average salary > 60000
         SELECT department
         FROM employees
         GROUP BY department
         HAVING AVG(salary) > 60000;

         44. Cities with average salary < 60000
         SELECT city
         FROM employees
         GROUP BY city
         HAVING AVG(salary) < 60000;

         45. Departments with max salary > 80000
         SELECT department
         FROM employees
         GROUP BY department
         HAVING MAX(salary) > 80000;

         46. Departments with min salary < 45000
         SELECT department
         FROM employees
         GROUP BY department
         HAVING MIN(salary) < 45000;

         47. Departments having exactly 3 employees
         SELECT department
         FROM employees
         GROUP BY department
         HAVING COUNT(*) = 3;

         48. Cities having at least 4 employees
         SELECT city
         FROM employees
         GROUP BY city
         HAVING COUNT(*) >= 4;

         49. Departments where total salary > 200000
         SELECT department
         FROM employees
         GROUP BY department
         HAVING SUM(salary) > 200000;

         50. Cities where total salary > 150000
         SELECT city
         FROM employees
         GROUP BY city
         HAVING SUM(salary) > 150000;

         51. Departments with avg age > 30
         SELECT department
         FROM employees
         GROUP BY department
         HAVING AVG(age) > 30;

         52. Cities with avg age < 30
         SELECT city
         FROM employees
         GROUP BY city
         HAVING AVG(age) < 30;

         53. Departments having more than 1 inactive employee
         SELECT department
         FROM employees
         WHERE status = 'INACTIVE'
         GROUP BY department
         HAVING COUNT(*) > 1;

         54. Cities having only ACTIVE employees
         SELECT city
         FROM employees
         GROUP BY city
         HAVING SUM(status = 'INACTIVE') = 0;
         or
         SELECT city FROM employees GROUP BY city HAVING COUNT(*) = SUM(CASE WHEN status = 'ACTIVE' THEN 1 ELSE 0 END);

         55. Departments having at least 2 ACTIVE employees
         SELECT department
         FROM employees
         WHERE status = 'ACTIVE'
         GROUP BY department
         HAVING COUNT(*) >= 2;

         56. Departments where avg salary between 50000 and 70000
         SELECT department
         FROM employees
         GROUP BY department
         HAVING AVG(salary) BETWEEN 50000 AND 70000;

         57. Cities where employee count between 2 and 4
         SELECT city
         FROM employees
         GROUP BY city
         HAVING COUNT(*) BETWEEN 2 AND 4;

         58. Departments where min salary > 45000
         SELECT department
         FROM employees
         GROUP BY department
         HAVING MIN(salary) > 45000;

         59. Cities where max salary < 90000
         SELECT city
         FROM employees
         GROUP BY city
         HAVING MAX(salary) < 90000;

         60. Departments having employees joined before 2018
         SELECT department
         FROM employees
         WHERE join_date < '2018-01-01'
         GROUP BY department;

         61. Cities having employees joined after 2021
         SELECT city
         FROM employees
         WHERE join_date > '2021-12-31'
         GROUP BY city;

         62. Department where avg salary is highest
         SELECT department
         FROM employees
         GROUP BY department
         ORDER BY AVG(salary) DESC
         LIMIT 1;

         63. City with maximum employee count
         SELECT city
         FROM employees
         GROUP BY city
         ORDER BY COUNT(*) DESC
         LIMIT 1;

         64. Department with minimum employee count
         SELECT department
         FROM employees
         GROUP BY department
         ORDER BY COUNT(*) ASC
         LIMIT 1;

         65. Department with highest total salary
         SELECT department
         FROM employees
         GROUP BY department
         ORDER BY SUM(salary) DESC
         LIMIT 1;

         66. City with lowest average salary
         SELECT city
         FROM employees
         GROUP BY city
         ORDER BY AVG(salary) ASC
         LIMIT 1;

         67. Department where youngest employee age > 25
         SELECT department
         FROM employees
         GROUP BY department
         HAVING MIN(age) > 25;

         68. City where oldest employee age < 40
         SELECT city
         FROM employees
         GROUP BY city
         HAVING MAX(age) < 40;

         69. Departments with more ACTIVE than INACTIVE employees
         SELECT department
         FROM employees
         GROUP BY department
         HAVING
         SUM(status = 'ACTIVE') > SUM(status = 'INACTIVE');

         70. Cities with no INACTIVE employees
         SELECT city
         FROM employees
         GROUP BY city
         HAVING SUM(status = 'INACTIVE') = 0;
         */
    }
}
