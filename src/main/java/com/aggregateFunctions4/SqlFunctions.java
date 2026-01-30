package com.aggregateFunctions4;

public class SqlFunctions {
    public static void main(String[] args) {
        /**

         1 Count - Basically counting number of rows.
         select count(*) from books;

         Count return the result as a number. Single number.
         SELECT COUNT(*) FROM books;

         SELECT COUNT(author_lname) FROM books;

         SELECT COUNT(DISTINCT author_lname) FROM books;

         SELECT COUNT(*) FROM books WHERE title LIKE '%the%';




         2 Group By
         GROUP BY collects rows into buckets based on the column(s) you specify.
         Then aggregate functions (like COUNT, MIN, MAX, SUM, etc.) are applied per bucket.

         Every column in SELECT must be either:
         ✔ part of GROUP BY
         or
         ✔ inside an aggregate function (MAX, MIN, SUM, COUNT, etc.)


         select count(author_lname) as value, author_lname from books group by author_lname;

         select author_lname from books group by author_lname;

         SELECT
         author_lname, COUNT(*) AS books_written
         FROM
         books
         GROUP BY author_lname
         ORDER BY books_written DESC;




         3 MAX and MIN
         For Strings - It works Alphabetically

         SELECT MAX(pages) FROM books;

         SELECT MIN(author_lname) FROM books;

         Question -
         You want to find the title which has highest number of pages-

         Solution 1 -
         select title,pages from books where pages = (select max(pages) from books) ;

         Solution 2 -
         select title,pages from books order by pages limit 1;

         Always use solution 1 because if there are 3 rows which have same maximum value then solution 1
         will give correct result.

         SELECT title, pages FROM books
         WHERE pages = (SELECT MAX(pages) FROM books);

         SELECT MIN(released_year) FROM books;

         SELECT title, released_year FROM books
         WHERE released_year = (SELECT MIN(released_year) FROM books);



         4 Multiple Columns Group By
         select concat(author_fname,' ',author_lname) as author,
         count(*) as number from books group by author order by number desc;

         SELECT CONCAT(author_fname, ' ', author_lname) AS author,  COUNT(*)
         FROM books
         GROUP BY author;



         5 MIN and MAX with Group By

         SELECT author_lname, MIN(released_year) FROM books GROUP BY author_lname;

         SELECT author_lname, MAX(released_year), MIN(released_year) FROM books GROUP BY author_lname;

         SELECT
         author_lname,
         COUNT(*) as books_written,
         MAX(released_year) AS latest_release,
         MIN(released_year)  AS earliest_release,
         MAX(pages) AS longest_page_count
         FROM books GROUP BY author_lname;


         SELECT
         author_lname,
         author_fname,
         COUNT(*) as books_written,
         MAX(released_year) AS latest_release,
         MIN(released_year)  AS earliest_release
         FROM books GROUP BY author_lname, author_fname;



         6 SUM
         select author_fname , author_lname ,min(pages),max(pages), sum(pages) as total_page from books
         group by author_fname , author_lname order by total_page desc ;

         SELECT SUM(pages) FROM books;


         SELECT author_lname, COUNT(*), SUM(pages)
         FROM books
         GROUP BY author_lname;




         7 AVG
         SELECT AVG(pages) FROM books;

         SELECT AVG(released_year) FROM books;

         SELECT
         released_year,
         AVG(stock_quantity),
         COUNT(*) FROM books
         GROUP BY released_year;


         Some Exercise -

         SELECT COUNT(*) FROM books;

         SELECT released_year, COUNT(*)
         FROM books GROUP BY released_year;

         SELECT SUM(stock_quantity) FROM books;

         SELECT AVG(released_year)
         FROM books GROUP BY author_lname, author_fname;


         SELECT CONCAT(author_fname, ' ', author_lname) AS author, pages FROM books
         WHERE pages = (SELECT MAX(pages) FROM books);

         SELECT CONCAT(author_fname, ' ', author_lname) AS author, pages FROM books
         ORDER BY pages DESC LIMIT 1;


         SELECT
         released_year AS year,
         COUNT(*) AS '# books',
         AVG(pages) AS 'avg pages'
         FROM books
         GROUP BY released_year
         ORDER BY released_year;


         */
    }
}























