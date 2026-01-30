package com.crud2;

public class CrudChallenge2 {
    public static void main(String[] args) {
        /**
         1 Create a new database shirts_db
         CREATE DATABASE shirt_db;

         use shirt_db;

         2 Create a new table shirts

         create table shirts (
         shirts_id int AUTO_INCREMENT,
         article varchar(255) NOT NULL,
         color varchar(255) NOT NULL,
         shirt_size varchar(255) NOT NULL,
         last_worn int NOT NULL,
         primary key (shirts_id)
         );

         desc shirts;

         3 Get All That Data In There

         insert into shirts ( article , color , shirt_size , last_worn ) value
         ('t-shirt','white','S', 10),
         ('t-shirt','green','S', 200),
         ('polo shirt','black','M', 10),
         ('tank top','blue','S', 50),
         ('t-shirt','pink','S', 0),
         ('polo shirt','red','M', 5),
         ('tank top','white','S', 200),
         ('tank top','blue','M', 15);

         select * from shirts;

         4 Add A New Shirt

         insert into shirts ( article , color , shirt_size , last_worn ) value
         ('polo shirt','purple','M', 50);

         5 SELECT all shirts But Only Print Out Article and Color

         select article , color from shirts;

         6 SELECT all medium shirts Print Out Everything But shirt_id

         select article , color , shirt_size , last_worn from shirts where shirt_size = 'M';

         7 Update all polo shirts Change their size to L

         update shirts set shirt_size = 'L' where article = 'polo shirt';

         8 Update the shirt last worn 15 days ago Change last_worn to 0

         UPDATE shirts
         SET
         last_worn = 0
         WHERE
         last_worn = 15;

         9 Update all white shirts Change size to 'XS' and color to 'off white'

         UPDATE shirts
         SET
         color = 'off white',
         shirt_size = 'XS'
         WHERE
         color = 'white';

         10 Delete all old shirts Last worn 200 days ago

         delete from shirts where last_worn = 200;

         11 Delete all tank tops

         SELECT * FROM shirts WHERE article='tank top';

         DELETE FROM shirts WHERE article='tank top';

         12 Delete all shirts


         */


    }
}
