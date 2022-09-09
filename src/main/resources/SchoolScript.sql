
 INSERT INTO director(first_name, last_name, Date_Of_Birth, phone_number, city, email) values ("ia", "intskirveli", '2003/07/04', 32472874, "Batumi", "iaintsk@gmail.com");
 INSERT INTO director(first_name, last_name, Date_Of_Birth, phone_number, city, email) values ("lizi", "sharadze", '2003/06/05', 75122093, "Batumi", "lizsha@gmail.com");
 INSERT INTO school(name, city, street, web_address, email, Director_id) values ("8 public", "Batumi", "8school.edu.ge", "8school@gmail.com", 1,1);
 INSERT INTO subject(name, School_id, maxcapacity) values ("Algebra", 1, 5);
--  INSERT INTO subject(name, School_id) values ("Biology", 1, 6);
--  INSERT INTO subject(name, School_id) values ("Chemistry", 1);
--  INSERT INTO subject(name, School_id) values ("Geometry", 1);
--  INSERT INTO subject(name, School_id) values ("Art", 1);
--  INSERT INTO subject(name, School_id) values ("Physics", 1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("aleko", "tsintsadze", '2001/11/16', 83947282, 3, "alek@gmail.com", 1, 1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("irakli", "vadachkoria", '2002/12/13', 83739482, 3, "ika@gmail.com", 1, 1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("tornike", "urushadze", '2003/02/22', 98363847, 2, "toko@gmail.com", 1,1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("nini", "kirvalidze", '2002/08/11', 91827443, 3, "nkir@gmail.com", 1,1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("ana", "khimshiashvili", '2003/04/20', 18463967, 3,"khimsho@gmail.com", 1,1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("luka", "cinaridze", '2003/06/15', 38675287, 2, "lukci@gmail.com", 1,1);
 INSERT INTO student(first_name, last_name, Date_Of_Birth, phone_number, address, email, School_id, Subject_id) values ("giorgi", "mamaladze", '2001/01/14', 98714572, 4, "giomam@gmail.com", 1,1);
 
UPDATE student SET name = "Ale" WHERE id = 3;
UPDATE student SET name = "Gio" WHERE subject_id = 1;
UPDATE director SET email = "iaintsk@gmail.com" WHERE id = 1;
UPDATE director SET last_name = "cinaridze" WHERE id > 2 AND id < 4;
UPDATE teacher SET name = "dato" WHERE last_name = "iremadze";
UPDATE student SET subject_id = 3 WHERE name like "rel%";
UPDATE teacher SET phone_number = 1826352 WHERE Date_Of_Birth LIKE '2001%';
UPDATE student SET name ="davit" WHERE Date_Of_Birth LIKE '2003%';
UPDATE student SET name = "dato" WHERE Date_Of_Birth LIKE '2004%';
UPDATE subject SET name = "Sport" WHERE id = 1;
UPDATE student SET subject_id = 2 WHERE name LIKE 'ol%';

DELETE FROM subject WHERE id > 1;
DELETE FROM subject WHERE id > 2;
DELETE FROM student WHERE class = 5;
DELETE FROM student WHERE phone_number LIKE '732%';
DELETE from student WHERE phone_number LIKE '1%';
DELETE from student WHERE Date_Of_Birth LIKE '2002%';
DELETE FROM student WHERE id > 1 AND id < 3;
DELETE FROM student WHERE id > 0 AND id <= 5;
DELETE FROM student WHERE subject.name > 0 and subject.name < 3;

-- SELECT student.name, subject.name FROM student LEFT join subject ON student.subject_id=subject.id
-- SELECT subject.name, student.name FROM student RIGHT join subject ON student.subject_id=subject.id
-- SELECT subject.name, student.name FROM student INNER join subject ON student.subject_id=subject.id
-- RIGHT JOIN subject ON student.subject_id=subject.id
-- LEFT JOIN faculties ON student.subject_id=subject.id
-- SELECT student.name, subject.name FROM student