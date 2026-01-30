package com.logicalOperators6;

public class ComparisionAndLogicalOperators1 {
    public static void main(String[] args) {
        /**
         1 Not Equal
         SELECT * FROM books
         WHERE released_year != 2017;


         2 Not LIKE
         SELECT * FROM books
         WHERE title NOT LIKE '%e%';


         3 Greater than
         SELECT * FROM books
         WHERE released_year > 2005;

         SELECT * FROM books
         WHERE pages > 500;


         4 Less Than or Equal to
         SELECT * FROM books
         WHERE pages < 200;

         SELECT * FROM books
         WHERE released_year < 2000;

         SELECT * FROM books
         WHERE released_year <= 1985;



         5 Logical AND
         SELECT title, author_lname, released_year FROM books
         WHERE released_year > 2010
         AND author_lname = 'Eggers';

         SELECT title, author_lname, released_year FROM books
         WHERE released_year > 2010
         AND author_lname = 'Eggers'
         AND title LIKE '%novel%';

         Condition 1 AND Condition 2
         Both Side must be true



         6 Logical OR
         Condition 1 OR Condition 2
         Only one side must be true

         SQL will check every row and with AND / OR it decides whether that row will be printing in
         result or not.

         SELECT title, pages FROM books
         WHERE CHAR_LENGTH(title) > 30
         AND pages > 500;

         SELECT title, author_lname FROM books
         WHERE author_lname='Eggers' AND
         released_year > 2010;

         SELECT title, author_lname, released_year FROM books
         WHERE author_lname='Eggers' OR
         released_year > 2010;


         SELECT title, pages FROM books
         WHERE pages < 200
         OR title LIKE '%stories%';



         7 Between
         SELECT title, released_year FROM books
         WHERE released_year <= 2015
         AND released_year >= 2004;

         SELECT title, released_year FROM books
         WHERE released_year BETWEEN 2004 AND 2014;

         */
    }
}
