/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kedwin
 * Created: Sep 21, 2023
 */


create table medico(

id bigint not null auto_increment,
nombre varchar(100) not null,
email varchar(150) not null unique,
documento varchar(150) not null unique,
especialidad varchar(100) not null,

calle varchar(100) not null,
distrito varchar(100) not null,
complemento varchar(100),
numero varchar(100),
ciudad varchar(100) not null,
primary key(id)
);

