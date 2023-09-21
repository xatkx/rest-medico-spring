/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  kedwin
 * Created: Sep 21, 2023
 */

alter table medico add telefono varchar(22);

alter table medico add activo tinyint;
update medico set activo = 1;