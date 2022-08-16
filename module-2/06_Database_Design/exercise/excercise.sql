

create table member
(
    member_id       serial
        constraint member_pk
            primary key,
    last_name       varchar(20)        not null,
    first_name      varchar(20)        not null,
    email           varchar(50)        not null,
    phone_number    varchar(11)        not null,
    date_of_birth   date               not null,
    wants_reminders bool default false not null
);

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Lopez', 'Isaac', 'isaacmlopez@hotmaail.com', '18658390349', '1996-08-03');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Lopez', 'Brook', 'brook@me.com', '18658390394', '1998-11-11');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Lopez', 'Pedro', 'pedro@me.com', '18658742345', '1966-10-27');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Birss', 'Andy', 'abriss@me.com', '16578132135', '1996-03-10');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Code', 'Daddy', 'cdizzle@nizzle.com', '14519687633', '1900-01-01');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Ritter', 'Brittney', 'britter@critter.com', '13568745618', '1992-02-02');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES('Belmana', 'Jason', 'jason@bacon.com', '14579255463', '1993-03-03');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Darby', 'Mark', 'mdarby@dooby.com', '15858954354', '1994-04-04');

INSERT INTO member(last_name, first_name, email, phone_number, date_of_birth)
VALUES ('Sean', 'Orecle', 'sorecle@oracle.com', '15854534354', '1880-04-04');






create table "group"
(
    group_id   serial
        constraint group_pk
            primary key,
    group_name varchar(50) not null
);

INSERT INTO "group" (group_name) VALUES ('Big group');
INSERT INTO "group" (group_name) VALUES ('Medium group');
INSERT INTO "group" (group_name) VALUES ('Small Group');


create table member_group
(
    member_id int not null
        constraint member_group_member_member_id_fk
            references member(member_id),
    group_id  int not null
        constraint member_group_group_group_id_fk
            references "group"(group_id)
);

INSERT INTO member_group VALUES (1, 1);
INSERT INTO member_group VALUES (2, 1);
INSERT INTO member_group VALUES (3, 2);
INSERT INTO member_group VALUES (4, 2);
INSERT INTO member_group VALUES (5, 3);
INSERT INTO member_group VALUES (6, 3);
INSERT INTO member_group VALUES (7, 3);
INSERT INTO member_group VALUES (8, 2);
INSERT INTO member_group VALUES (9, 1);



create table event
(
    event_id      serial         not null
        constraint event_pk
            primary key,
    event_name    varchar(50)    not null,
    description   varchar(200),
    date_and_time timestamp      not null,
    duration      int default 30 not null
);

INSERT INTO event(event_name, description, date_and_time) VALUES ('Lame-con', 'For lame people.', current_timestamp);
INSERT INTO event(event_name, description, date_and_time) VALUES ('Lame-con2', 'For lame people.', current_timestamp);
INSERT INTO event(event_name, description, date_and_time) VALUES ('Lame-con3', 'For lame people.', current_timestamp);

create table event_group
(
    employee_id int not null
        constraint event_group_group_group_id_fk
            references member(member_id),
    event_id int not null
        constraint event_group_event_event_id_fk
            references event(event_id)
);

INSERT INTO event_group Values (1,1);
INSERT INTO event_group Values (2,1);
INSERT INTO event_group Values (3,1);
INSERT INTO event_group Values (4,2);
INSERT INTO event_group Values (5,2);
INSERT INTO event_group Values (6,3);
INSERT INTO event_group Values (7,4);
INSERT INTO event_group Values (8,3);
INSERT INTO event_group Values (9,3);




