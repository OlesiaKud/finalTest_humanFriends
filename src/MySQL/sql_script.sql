-- 7.2.1. В ранее подключенном MySQL создать базу данных с названием "Human Friends".
--   Создать таблицы, соответствующие иерархии из вашей диаграммы классов.

DROP DATABASE IF EXISTS human_friends;
CREATE DATABASE human_friends;
USE human_friends;

DROP TABLE IF EXISTS pets;
CREATE TABLE pets (
	id INT AUTO_INCREMENT PRIMARY KEY, 
    `name` VARCHAR(50),
    `type` ENUM ('dog','cat', 'hamster'),
    birthdate DATE,
    command VARCHAR(200)   
);
   

INSERT INTO pets (`name`,`type`, birthdate, command) VALUES
	('Fido', 'dog', '2020-01-01', 'Sit, Stay, Fetch'),
	('Whiskers', 'cat', '2019-05-15', 'Sit, Pounce'),
	('Hammy', 'hamster', '2021-03-10', 'Roll, Hide'),
	('Buddy', 'dog', '2018-12-10', 'Sit, Paw, Bark'),
	('Smudge', 'cat', '2020-02-20', 'Sit, Pounce, Scratch'),
	('Peanut', 'hamster', '2021-08-01', 'Sit, Roll, Spin'),
	('Bella', 'dog', '2019-11-11', 'Sit, Stay, Roll'),
	('Oliver', 'cat', '2020-06-30', 'Meow, Scratch, Jump');
SELECT * FROM pets; -- лист домашние животные


DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals (
	id INT AUTO_INCREMENT PRIMARY KEY, 
    `name` VARCHAR(50),
    `type` ENUM('horse', 'camel', 'donkey'),
    birthdate DATE,
    command VARCHAR(200)   
);
  
INSERT INTO pack_animals (`name`,`type`, birthdate, command) VALUES
	('Thunder', 'horse', '2022-07-21', 'Trot, Canter, Gallop'),
	('Sandy	', 'camel', '2016-11-03', 'Walk, Carry Load'),
	('Eeyore', 'donkey', '2022-09-18', 'Walk, Carry Load, Bray'),
	('Storm', 'horse', '2014-05-05', 'Trot, Canter'),
	('Dune', 'camel', '2018-12-12', 'Walk, Sit'),
	('Burro', 'donkey', '2019-01-23', 'Walk, Bray, Kick'),
	('Blaze', 'horse', '2016-02-29', 'Trot, Jump, Gallop'),
	('Sahara', 'camel', '2015-08-14', 'Walk, Run');
	
SELECT * FROM pack_animals;  -- лист вьючные животные
    
   
 -- 7.2.2.    - Удалить записи о верблюдах и объединить таблицы лошадей и ослов.
-- можно без удаления столбцов вывести всё кроме верблюдов
SELECT * FROM pack_animals
WHERE `type` != 'camel';

DELETE 
FROM pack_animals
WHERE `type`LIKE 'camel';

SELECT * FROM pack_animals;


-- 7.2.3. Создать новую таблицу для животных в возрасте от 1 до 3 лет и вычислить их возраст 
-- с точностью до месяца.
DROP TABLE IF EXISTS young_animal;
CREATE TABLE young_animal (
	id INT AUTO_INCREMENT PRIMARY KEY, 
    `name` VARCHAR(50),
    `type` VARCHAR(200),
    birthdate DATE,
    command VARCHAR(200)        
);
INSERT INTO young_animal (`name`,`type`, birthdate, command)  
SELECT * FROM (
	(SELECT `name`,`type`, birthdate, command 
		FROM pets
		WHERE TIMESTAMPDIFF(YEAR, birthdate, NOW()) BETWEEN 1 AND 2)
	UNION 
	(SELECT `name`,`type`, birthdate, command 
		FROM pack_animals
        WHERE TIMESTAMPDIFF(YEAR, birthdate, NOW()) BETWEEN 1 AND 2)
) AS young_animal_table;

SELECT * , TIMESTAMPDIFF(YEAR, birthdate, NOW()) AS _year, (TIMESTAMPDIFF(MONTH, birthdate, NOW()) % 12) AS _month
FROM young_animal;


-- 7.2.4. Объединить все созданные таблицы в одну, сохраняя информацию о принадлежности к исходным таблицам.

SELECT * ,'Pets' AS table_name  FROM pets
UNION SELECT * , 'pack_animals' AS table_name FROM pack_animals;
