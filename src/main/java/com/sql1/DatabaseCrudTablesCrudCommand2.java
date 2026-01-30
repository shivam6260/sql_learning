package com.sql1;

public class DatabaseCrudTablesCrudCommand2 {
    public static void main(String[] args) {
        /**
         1 - To list available databases:
         SHOW DATABASES;

         2 - The general command for creating a database:
         CREATE DATABASE <database_name>;

         A specific example:
         CREATE DATABASE soap_store;

         3 -To drop a database:
         DROP DATABASE <database-name>;

         4 - To use a database:
         USE <database-name>;

         5 - To check which database is in use -
         select database();

         6 - Creating Tables:

         CREATE TABLE cats (
            name VARCHAR(50),
            age INT
         );

         CREATE TABLE dogs (
            name VARCHAR(50),
            breed VARCHAR(50),
            age INT
         );

         7 - To show all tables in database -
         show tables;

         8 - To see all column from tables -
         show columns from cats;

         or

         desc cats;

         9 - To drop a table:
         DROP TABLE <table-name>;

         To specifically drop the cats table:
         DROP TABLE cats;



         Example -
         Create the table:
         CREATE TABLE pastries
         (
            name VARCHAR(50),
            quantity INT
         );

         View tables:
         SHOW TABLES;

         View details of pastries table:
         DESC pastries;

         Delete the whole pastries table:
         DROP TABLE pastries;
         */
    }
}