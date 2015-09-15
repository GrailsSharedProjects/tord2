drop database tord;
create database tord character set utf8;
create user wicky@'%' identified by 'William100';
grant all privileges on tord.* to wicky;
-- use tord;

drop database tord_dev;
create database tord_dev character set utf8;
create user mclamee@'%' identified by 'William100';
grant all privileges on tord_dev.* to mclamee;
-- use tord_dev;