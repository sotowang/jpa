```sql
create database db_example;
use db_example;
create TABLE `user`(
`id` int(11) not null auto_increment,
`name` VARCHAR(50) DEFAULT NULL,
`email` VARCHAR(200) DEFAULT NULL,
PRIMARY KEY(`id`)
)
```
