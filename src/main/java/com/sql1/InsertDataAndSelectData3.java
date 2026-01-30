package com.sql1;

public class InsertDataAndSelectData3 {
    public static void main(String[] args) {
        /**
         1 - Insert data into Tables -
         Tables Structure -
         CREATE TABLE cats (
            name VARCHAR(50),
            age INT
         );

         -- Single insert (switching order of name and age)
         INSERT INTO cats (age, name)
         VALUES
         (2, 'Beth');

         -- Multiple Insert:
         INSERT INTO cats (name, age)
         VALUES
         ('Meatball', 5),
         ('Turkey', 1),
         ('Potato Face', 15);

         2 - Creating Table without Null values
         Using NOT NULL:

         CREATE TABLE cats2 (
            name VARCHAR(100) NOT NULL,
            age INT NOT NULL
         );

         3 - Define a table with a DEFAULT name specified:

         CREATE TABLE cats3  (
            name VARCHAR(20) DEFAULT 'no name provided',
            age INT DEFAULT 99
         );

         4 - Combine NOT NULL and DEFAULT:

            CREATE TABLE cats4  (
                name VARCHAR(20) NOT NULL DEFAULT 'unnamed',
                age INT NOT NULL DEFAULT 99
            );

         5 - CODE: Introducing Primary Keys
         In SQL, a primary key is unique and not null

         -- One way of specifying a PRIMARY KEY

         CREATE TABLE unique_cats (
            cat_id INT PRIMARY KEY,
            name VARCHAR(100) NOT NULL,
            age INT NOT NULL
         );

         -- Another option:

         CREATE TABLE unique_cats2 (
            cat_id INT,
            name VARCHAR(100) NOT NULL,
            age INT NOT NULL,
            PRIMARY KEY (cat_id)
         );

         6 - CODE: Working With AUTO_INCREMENT
         --  AUTO_INCREMENT

         CREATE TABLE unique_cats3 (
            cat_id INT AUTO_INCREMENT,
            name VARCHAR(100) NOT NULL,
            age INT NOT NULL,
            PRIMARY KEY (cat_id)
         );

         Example -

         -- Defining employees table

         CREATE TABLE employees (
            id INT AUTO_INCREMENT,
            first_name VARCHAR(255) NOT NULL,
            last_name VARCHAR(255) NOT NULL,
            middle_name VARCHAR(255),
            age INT NOT NULL,
            current_status VARCHAR(255) NOT NULL DEFAULT 'employed',
            PRIMARY KEY(id)
         );
         -- A test INSERT:

         INSERT INTO employees(first_name, last_name, age) VALUES
         ('Dora', 'Smith', 58);


         */

    }
}
