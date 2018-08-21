create table user (user_id int primary key not null,
					user_name varchar(50) not null,
                    age long not null);
                    
alter table user modify column user_id int auto_increment;

alter table user add column street_name varchar(500);
alter table user add column city_name varchar(70);
alter table user add column state_name varchar(70);
alter table user add column country_name varchar(70);