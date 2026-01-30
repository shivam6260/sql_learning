package com.alterTable8;

public class AlterTable1 {
    public static void main(String[] args) {
        /**
         1 Adding new Column in Existing Table
         ALTER TABLE companies
         ADD COLUMN phone VARCHAR(15);

         ALTER TABLE companies
         ADD COLUMN employee_count INT NOT NULL DEFAULT 1;


         2 Dropping Column
         ALTER TABLE companies DROP COLUMN phone;

         alter table companies drop employee_count;


         3 Renaming the Table/Column
         Table -
         ALTER TABLE companies RENAME TO suppliers;
         ALTER TABLE suppliers RENAME TO companies;

         Column -
         ALTER TABLE companies
         RENAME COLUMN name TO company_name;


         4 Modifying Columns
         create table test(
            test_id int primary key auto_increment,
            name varchar(100) unique not null default 'Shiv',
            age int unique not null,
            job varchar(100) default 'Software Engineer'
         );

         ALTER TABLE test
         MODIFY job VARCHAR(100);

         ALTER TABLE test
         MODIFY name VARCHAR(95) NOT NULL;

         ALTER TABLE companies
         MODIFY company_name VARCHAR(100) DEFAULT 'unknown';

         ALTER TABLE suppliers
         CHANGE business biz_name VARCHAR(50);


         5 Adding Constraints
         ALTER TABLE houses
         ADD CONSTRAINT positive_price CHECK (purchase_price >= 0);

         ALTER TABLE houses DROP CONSTRAINT positive_price;


         */
    }
}
