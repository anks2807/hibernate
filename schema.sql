create table user (user_id int primary key not null,
					user_name varchar(50) not null,
                    age long not null);
                    
alter table user modify column user_id int auto_increment;

alter table user add column street_name varchar(500);
alter table user add column city_name varchar(70);
alter table user add column state_name varchar(70);
alter table user add column country_name varchar(70);

create table user_address (user_id int,
							street varchar(100),
							city varchar(100),
                            state varchar(100),
                            country varchar(100),
                            foreign key (user_id) references user(user_id)); 
                            

create table address (id int primary key auto_increment not null);
                            
                            
create table person (id int primary key auto_increment not null,
					name varchar(50) not null,
                    age long not null,
                    address_id int,
                    foreign key (address_id) references address(id));                             