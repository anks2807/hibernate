create table user (user_id int primary key not null,
					user_name varchar(50) not null,
                    age long not null);
                    
alter table user modify column user_id int auto_increment;