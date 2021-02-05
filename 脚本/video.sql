
create database if not exists video charset=utf8;

use video;

create table if not exists video(
	id bigint auto_increment primary key,
	display_name varchar(128),
	save_path varchar(512),
	quality_name varchar(16),
	sequence int(3),
	danmaku_id varchar(24)
)charset=utf8mb4;

create table if not exists contribution(
	id bigint auto_increment primary key,
	title varchar(128),
	cover_path varchar(512),
	view_counts bigint,
	upload_time datetime,
	description varchar(512),
	barrage_counts int,
	comment_list_id varchar(24),
	upload_user_id bigint unique key
)charset=utf8mb4;

create table if not exists web_user(
	id bigint auto_increment primary key,
	username varchar(25),
	password varchar(25),
	subscribe_list_id varchar(24),
	collect_list_id varchar(24),
	fans_list_id varchar(24),
	role varchar(10)
)charset=utf8mb4;


insert into contribution(upload_time) values(now());