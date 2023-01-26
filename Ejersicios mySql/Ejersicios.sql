CREATE TABLE Usuarios (
   id INT PRIMARY KEY AUTO_INCREMENT,
   usuario VARCHAR(20),
   nombre VARCHAR(20),
   sexo VARCHAR(1),
   nivel TINYINT,
   email VARCHAR(50),
   telefono VARCHAR(20),
   marca VARCHAR(20),
   compania VARCHAR(20),
   saldo FLOAT,clientes
   activo BOOLEAN
);

INSERT INTO Usuarios 
VALUES 
('1','BRE2271','BRENDA','M','2','brenda@live.com','655-330-5736','SAMSUNG','IUSACELL','100','1'),
('2','OSC4677','OSCAR','H','3','oscar@gmail.com','655-143-4181','LG','TELCEL','0','1'),
('3','JOS7086','JOSE','H','3','francisco@gmail.com','655-143-3922','NOKIA','MOVISTAR','150','1'),
('4','LUI6115','LUIS','H','0','enrique@outlook.com','655-137-1279','SAMSUNG','TELCEL','50','1'),
('5','LUI7072','LUIS','H','1','luis@hotmail.com','655-100-8260','NOKIA','IUSACELL','50','0'),
('6','DAN2832','DANIEL','H','0','daniel@outlook.com','655-145-2586','SONY','UNEFON','100','1'),
('7','JAQ5351','JAQUELINE','M','0','jaqueline@outlook.com','655-330-5514','BLACKBERRY','AXEL','0','1'),
('8','ROM6520','ROMAN','H','2','roman@gmail.com','655-330-3263','LG','IUSACELL','50','1'),
('9','BLA9739','BLAS','H','0','blas@hotmail.com','655-330-3871','LG','UNEFON','100','1'),
('10','JES4752','JESSICA','M','1','jessica@hotmail.com','655-143-6861','SAMSUNG','TELCEL','500','1'),
('11','DIA6570','DIANA','M','1','diana@live.com','655-143-3952','SONY','UNEFON','100','0'),
('12','RIC8283','RICARDO','H','2','ricardo@hotmail.com','655-145-6049','MOTOROLA','IUSACELL','150','1'),
('13','VAL6882','VALENTINA','M','0','valentina@live.com','655-137-4253','BLACKBERRY','AT&T','50','0'),
('14','BRE8106','BRENDA','M','3','brenda2@gmail.com','655-100-1351','MOTOROLA','NEXTEL','150','1'),
('15','LUC4982','LUCIA','M','3','lucia@gmail.com','655-145-4992','BLACKBERRY','IUSACELL','0','1'),
('16','JUA2337','JUAN','H','0','juan@outlook.com','655-100-6517','SAMSUNG','AXEL','0','0'),
('17','ELP2984','ELPIDIO','H','1','elpidio@outlook.com','655-145-9938','MOTOROLA','MOVISTAR','500','1'),
('18','JES9640','JESSICA','M','3','jessica2@live.com','655-330-5143','SONY','IUSACELL','200','1'),
('19','LET4015','LETICIA','M','2','leticia@yahoo.com','655-143-4019','BLACKBERRY','UNEFON','100','1'),
('20','LUI1076','LUIS','H','3','luis2@live.com','655-100-5085','SONY','UNEFON','150','1'),
('21','HUG5441','HUGO','H','2','hugo@live.com','655-137-3935','MOTOROLA','AT&T','500','1');
#1
SELECT nombre FROM Usuarios;
#2
select saldo, sexo, nombre from usuarios where sexo = 'M' order by sexo, saldo asc, nombre;
#3
select nombre, telefono, marca from Usuarios where marca in ('SONY','BLACKBERRY','NOKIA');
#4
SELECT nombre, saldo, activo FROM Usuarios WHERE saldo=0 OR activo='0';
#5
SELECT usuario, nivel FROM Usuarios WHERE nivel IN ('1','2','3');
#6
SELECT telefono, saldo FROM Usuarios WHERE saldo <= 300;
#7
SELECT SUM(saldo) , compania FROM Usuarios WHERE compania = 'NEXTEL';
#8
SELECT COUNT(usuario), compania FROM Usuarios group by compania;
#9
SELECT COUNT(usuario), nivel FROM Usuarios group by nivel;
#10
SELECT COUNT(usuario), nivel FROM Usuarios WHERE nivel='2' group by nivel;
#11
SELECT usuario, email FROM Usuarios WHERE email like '%@gmail.com';
#12
select nombre, telefono, marca from Usuarios where marca in ('LG','SAMSUNG','MOTOROLA');
#13
select nombre, telefono, marca from Usuarios where marca NOT in ('LG','SAMSUNG');
#14
SELECT usuario, telefono, compania FROM Usuarios WHERE compania = 'IUSACELL';
#15
SELECT usuario, telefono, compania FROM Usuarios WHERE compania != 'TELCEL';
#16
SELECT AVG(saldo), marca FROM Usuarios where marca = 'NOKIA';
#17
select usuario, telefono, compania from Usuarios where compania in ('IUSACELL','AXEL');
#18 
SELECT usuario, email FROM Usuarios where email NOT like '%@yahoo.com';
#19
select usuario, telefono, compania from Usuarios where compania NOT in ('TELCEL','IUSACELL');
#20 
select usuario, telefono, compania from Usuarios where compania in ('UNEFON');
#21
SELECT DISTINCT marca FROM Usuarios order by marca asc;
#22
SELECT DISTINCT compania FROM Usuarios order by RAND();
#23
SELECT usuario, nivel FROM Usuarios where nivel in ('0','2');
#24
SELECT AVG(saldo), marca FROM Usuarios where marca = 'LG';
#25
SELECT usuario, nivel FROM Usuarios where nivel in ('1','3');
#26
SELECT nombre, usuario, telefono, marca from Usuarios where marca NOT in ('BLACKBERRY');
#27
SELECT usuario , nivel FROM Usuarios WHERE nivel = '3';
#28
SELECT usuario , nivel FROM Usuarios WHERE nivel = '0';
#29
SELECT usuario , nivel FROM Usuarios WHERE nivel = '1';
#30
SELECT COUNT(usuario), sexo FROM Usuarios GROUP BY sexo; 
#31
select usuario, telefono, compania from Usuarios where compania in ('AT&T');
#32
SELECT DISTINCT compania FROM Usuarios ORDER BY compania ASC; 
#33
SELECT usuario, activo FROM Usuarios WHERE activo='0';
#34
SELECT telefono, saldo FROM usuarios WHERE saldo='0';
#35
SELECT MIN(saldo), sexo FROM usuarios WHERE sexo='H';
#36
SELECT telefono, saldo FROM usuarios WHERE saldo > '300';
#37
SELECT COUNT(usuario), marca FROM usuarios GROUP BY marca;
#38
SELECT nombre, telefono, marca FROM usuarios WHERE marca <> 'LG';
#39
SELECT DISTINCT compania FROM Usuarios ORDER BY compania DESC;
#40
SELECT SUM(saldo), compania FROM usuarios WHERE compania ='UNEFON';
#41
SELECT usuario, email FROM usuarios WHERE email LIKE '%hotmail.com';
#42
SELECT nombre, saldo, activo FROM usuarios WHERE activo = '0' || saldo = '0'; 
#43
SELECT usuario, telefono, compania FROM usuarios WHERE compania in ('IUSACELL','TELCEL');
#44
SELECT DISTINCT marca FROM Usuarios ORDER BY marca DESC;
#45
SELECT DISTINCT marca FROM Usuarios ORDER BY RAND();
#46
SELECT usuario, telefono, compania FROM usuarios WHERE compania in ('IUSACELL','UNEFON');
#47
SELECT nombre, telefono, marca FROM usuarios WHERE marca NOT in ('MOTOROLA','NOKIA');
#48
SELECT SUM(saldo), compania FROM usuarios WHERE compania ='TELCEL';




