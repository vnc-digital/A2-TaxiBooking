DROP TABLE IF EXISTS driver;
 
CREATE TABLE driver (
driver_id INT PRIMARY KEY,
driver_name VARCHAR(250) NOT NULL,
mobile_no BIGINT NOT NULL,
);

INSERT INTO driver(driver_name,mobile_no) values('jon','9876543764');
INSERT INTO driver(driver_name,mobile_no) values('balu','9876543464');
INSERT INTO driver (driver_name,mobile_no)values('praveen','9823543764');
INSERT INTO driver (driver_name,mobile_no)values('pavan','9878943764');


DROP TABLE IF EXISTS car;

create table car(
car_id INT primary key,
car_name VARCHAR(250),
car_no_plate VARCHAR(250),
car_location VARCHAR(250),
no_of_seats INT,
engine_type VARCHAR(250),
customer_rating INT,
manufacturer VARCHAR(250),
created_at DATE,
created_by VARCHAR(250),
updated_at DATE,
updated_by VARCHAR(250)
);

insert into car(car_name,car_no_plate,car_location,no_of_seats,engine_type,
customer_rating,manufacturer)values("SKODA","AP03QR4567","BANAGALORE",6,"ABCD",4,"XYZ");

insert into car(car_name,car_no_plate,car_location,no_of_seats,engine_type,
customer_rating,manufacturer)values("BENZ","AP03QR4569","BANAGALORE",6,"BGCD",4,"IUZ");


insert into car(car_name,car_no_plate,car_location,no_of_seats,engine_type,
customer_rating,manufacturer)values("ABC","AP03QR4569","BANAGALORE",6,"BGCD",4,"IUPZ");


insert into car(car_name,car_no_plate,car_location,no_of_seats,engine_type,
customer_rating,manufacturer)values("XYZ","AP03QR4569","BANAGALORE",6,"BPCD",4,"IUKZ");


create table driver_shedule(
shedule_id INT AUTO INCREMENT PRIMARY KEY,
from_time VARCHAR(250),
to_time VARCHAR(250)
);

INSERT INTO driver_shedule(from_time,to_time)VALUES("6AM","9AM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("9AM","12PM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("12PM","3PM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("3PM","6PM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("6PM","9PM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("9PM","12AM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("12AM","3AM");
INSERT INTO driver_shedule(from_time,to_time)VALUES("3AM","6AM");





CREATE TABLE customer(

customer_id INT PRIMARY KEY,
customerName VARCHAR(250) NOT NULL,
mobile_no BIGINT NOT NULL,
email  VARCHAR(250) NOT NULL,

)

CREATE TABLE bookings(
booking_id INT AUTO INCREMENT PRIMARY KEY,
booking_status VARCHAR(250),
FOREIGN KEY (driver_id) REFERENCES driver(driver_id),
FOREIGN KEY (schedule_id) REFERENCES driver_shedule(schedule_id),
FOREIGN KEY (car_id) REFERENCES car(car_id),
FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
)














 