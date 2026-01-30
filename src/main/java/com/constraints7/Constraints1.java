package com.constraints7;

public class Constraints1 {
    public static void main(String[] args) {
        /**
         1 UNIQUE
         create table contacts (
         name varchar(255) not null,
         phone varchar(15) not null unique
         );

         desc contacts;

         insert into contacts (name,phone)
         values
         ('Shivam','9130536792'),
         ('Shweta','7979942524');

         insert into contacts (name,phone)
         values
         ('Satyam','9130536792');



         2 Check Constraints

         CREATE TABLE users (
         username VARCHAR(20) NOT NULL,
         age INT CHECK (age > 0)
         );

         CREATE TABLE palindromes (
         word VARCHAR(100) CHECK(REVERSE(word) = word)
         )



         3 Named Constraints
         CREATE TABLE users2 (
         username VARCHAR(20) NOT NULL,
         age INT,
         CONSTRAINT age_not_negative CHECK (age >= 0)
         );

         CREATE TABLE palindromes2 (
         word VARCHAR(100),
         CONSTRAINT word_is_palindrome CHECK(REVERSE(word) = word)
         );

         CREATE TABLE companies (
         name VARCHAR(255) NOT NULL,
         address VARCHAR(255) NOT NULL,
         CONSTRAINT name_address UNIQUE (name , address)
         );

         CREATE TABLE houses (
         purchase_price INT NOT NULL,
         sale_price INT NOT NULL,
         CONSTRAINT sprice_gt_pprice CHECK(sale_price >= purchase_price)
         );


         */
    }
}
