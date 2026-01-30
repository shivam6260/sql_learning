package com.crud2;

public class CrudBasic1 {
    public static void main(String[] args) {
        /**
         Create a Table and Add data -
         CREATE TABLE cats (
            cat_id INT AUTO_INCREMENT,
            name VARCHAR(100),
            breed VARCHAR(100),
            age INT,
            PRIMARY KEY (cat_id)
         );

         INSERT INTO cats(name, breed, age)
         VALUES ('Ringo', 'Tabby', 4),
                ('Cindy', 'Maine Coon', 10),
                ('Dumbledore', 'Maine Coon', 11),
                ('Egg', 'Persian', 4),
                ('Misty', 'Tabby', 13),
                ('George Michael', 'Ragdoll', 9),
                ('Jackson', 'Sphynx', 7);

         1 - SELECT statement

         -- To get all the columns:
         SELECT * FROM cats;

         -- To only get the age column:
         SELECT age FROM cats;

         -- To select multiple specific columns:
         SELECT name, breed FROM cats;

         2 - Where
         -- Use where to specify a condition:

         SELECT * FROM cats WHERE age = 4;
         SELECT * FROM cats WHERE name ='Egg';

         3 - Aliases
         -- Use 'AS' to alias a column in your results
         (it doesn't actually change the name of the column in the table)
         Temporary for Query only.

         SELECT cat_id AS id, name FROM cats;

         4 - Updating Data

         Change tabby cats to shorthair:
         UPDATE cats SET breed='Shorthair' WHERE breed='Tabby';

         Another update:
         UPDATE cats SET age=14 WHERE name='Misty';

         Note -
         Before executing UPDATE query, always execute the SELECT query of same update query
         for safety and to avoid mistakes.

         5 - Delete

         To delete the entire data inside table ( not delete table )
         delete from cats;

         -- Delete all cats with name of 'Egg':
         DELETE FROM cats WHERE name='Egg';



         */




    }
}
