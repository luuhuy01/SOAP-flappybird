use flappybird;
create table user(
	id int primary key auto_increment,
    username varchar(50) unique,
    password varchar(50),
    name nvarchar(50),
    phone nvarchar(50),
    position nvarchar(50),
    status int
);

create table score(
	id int primary key auto_increment,
    score int,
    create_at date,
    user_id int
);

alter table score
add constraint fk_user
foreign key(user_id) references user(id);
