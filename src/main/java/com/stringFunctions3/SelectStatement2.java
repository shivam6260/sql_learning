package com.stringFunctions3;

public class SelectStatement2 {
    /**
     1 Distinct - ( Treat it like a Set in Java )
     Matlab - Remove Duplicates

     Important - Distinct goes after Select and Before Column Name

     SELECT DISTINCT released_year FROM books;
     SELECT author_lname FROM books;
     SELECT DISTINCT author_lname FROM books;
     SELECT author_fname, author_lname FROM books;
     SELECT DISTINCT CONCAT(author_fname,' ', author_lname) FROM books;

     If we add more than one column - then uniqueness will be decided based on combination of column

     SELECT DISTINCT author_fname, author_lname FROM books; ( Both Column combination result should be unique )
     SELECT DISTINCT author_fname, author_lname , released_year FROM books; ( All three Column combination result should be unique )



     2 Order By

     SELECT * FROM books ORDER BY released_year DESC;
     Meaning: Sort all books by released_year in descending order (newest year first).

     SELECT * FROM books ORDER BY released_year, pages DESC;
     SELECT book_id, author_fname, author_lname, pages FROM books ORDER BY author_lname, author_fname;

     Meaning:
     First sort by released_year in ascending order (default, because no DESC or ASC is specified).
     If two or more books have the same released_year, then sort those books by pages in descending order.


     Order by and Distinct combine query -
     select distinct concat(author_fname , ' ' , author_lname ) as author from books order by author;




     3 Limit

     select book_id , title , concat(author_fname , ' ' , author_lname),released_year from books
     order by released_year desc limit 4;
     Meaning - This will give 4 result starting from 0th row.

     select book_id , title , concat(author_fname , ' ' , author_lname),released_year from books
     order by released_year desc limit 1,4;
     Meaning - This will also give 4 result starting from 1st row.

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 5;

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 1;

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 14;

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 0,5;

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 0,3;

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 1,3;

     SELECT title, released_year FROM books
     ORDER BY released_year DESC LIMIT 10,1;

     SELECT title FROM books LIMIT 5;




     4 Like
     select * from books where title like '%:%';

     To get all rows where author_fname is exactly 4 letters, use LIKE with 4 underscores (each underscore = one character):

     SELECT *
     FROM books
     WHERE author_fname LIKE '____';

     or

     select * from books where char_length(author_fname) = 4;

     Interview Question -

     A. Find all the records where Author first name is 3 letter and middle letter is a?
     SELECT * FROM books WHERE author_fname LIKE '_a_';

     B. Find all the records where Author first name ends with letter N?
     select * from books where author_fname like '%N';

     -- To select books with '%' in their title:
     SELECT * FROM books
     WHERE title LIKE '%\%%';

     -- To select books with an underscore '_' in title:
     SELECT * FROM books
     WHERE title LIKE '%\_%';


     Some Exercise -
     SELECT title FROM books WHERE title LIKE '%stories%';

     SELECT title, pages FROM books ORDER BY pages DESC LIMIT 1;

     SELECT
     CONCAT(title, ' - ', released_year) AS summary
     FROM books ORDER BY released_year DESC LIMIT 3;

     SELECT title, author_lname FROM books WHERE author_lname LIKE '% %';

     SELECT title, released_year, stock_quantity
     FROM books ORDER BY stock_quantity LIMIT 3;

     SELECT title, author_lname
     FROM books ORDER BY author_lname, title;

     SELECT title, author_lname
     FROM books ORDER BY 2,1;

     SELECT
     CONCAT(
     'MY FAVORITE AUTHOR IS ',
     UPPER(author_fname),
     ' ',
     UPPER(author_lname),
     '!'
     ) AS yell
     FROM books ORDER BY author_lname;

     */
}
