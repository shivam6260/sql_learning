package com.dataTypes5;

public class DataTypes {
    public static void main(String[] args) {
        /**
         1 Date and Time

         CREATE TABLE people (
         name VARCHAR(100),
         birthdate DATE,
         birthtime TIME,
         birthdt DATETIME
         );

         INSERT INTO people (name, birthdate, birthtime, birthdt)
         VALUES ('Elton', '2000-12-25', '11:00:00', '2000-12-25 11:00:00');

         INSERT INTO people (name, birthdate, birthtime, birthdt)
         VALUES ('Lulu', '1985-04-11', '9:45:10', '1985-04-11 9:45:10');

         INSERT INTO people (name, birthdate, birthtime, birthdt)
         VALUES ('Juan', '2020-08-15', '23:59:00', '2020-08-15 23:59:00');




         2 Date , Time Functions
         select curtime(); - HH:MM:SS
         select curdate(); - YYYY-MM-DD
         select now(); YYYY-MM-DD HH:MM:SS

         INSERT INTO people (name, birthdate, birthtime, birthdt)
         VALUES ('Hazel', CURDATE(), CURTIME(), NOW());

         SELECT
         birthtime,
         HOUR(birthtime),
         MINUTE(birthtime)
         FROM people;

         SELECT
         birthdt,
         MONTH(birthdt),
         DAY(birthdt),
         HOUR(birthdt),
         MINUTE(birthdt)
         FROM people;



         3 Date and Time Format
         SELECT birthdate, DATE_FORMAT(birthdate, '%a %b %D') FROM people;

         SELECT birthdt, DATE_FORMAT(birthdt, '%H:%i') FROM people;

         SELECT birthdt, DATE_FORMAT(birthdt, 'BORN ON: %r') FROM people;


         */
    }
}
