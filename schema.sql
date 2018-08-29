create table user (user_id int primary key not null,
					user_name varchar(50) not null,
                    age long not null);
                    
                    
create table vehicle (id int primary key not null,
						name varchar(50) not null);
                    
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
                    
create table address (id int primary key auto_increment not null,
						street varchar(500),
						city varchar(500),
						state varchar(100),
						country varchar(100));
						
create table user_address (person_id int, address_id int,
						foreign key (person_id) references person(id),
						foreign key (address_id) references address(id)
)

create table user_vehicle (user_id int, vehicle_id int,
						foreign key (user_id) references user(user_id),
						foreign key (vehicle_id) references vehicle(id)
)

create table furniture (id int primary key auto_increment,
furniture_type varchar(50),
made_of varchar(50),
manufacturing_company varchar(100),
shape varchar(100));