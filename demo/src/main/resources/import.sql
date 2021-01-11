insert into user( name, last_name, phone, city, email, github, linkedin, skype,  about) values('Lukasz', 'Kusa', '539 413 521', 'Wrocław', 'lukaszkusa@outlook.com', 'https://github.com/lukaszkusa/portfolio',
'https://linkedin.com/in/lukasz-kusa', 'https://join.skype.com/invite/o1hLnvR9yrRO', 'Programmingis my passion that has been going on for 5 years. I made many improvements in the software of production machines, which contributed to the increase in production at ABB. My participation in the 4D Marine Learning startup, taught me independence in making decisions and allowed me to learn about UNITY technology and C# languages. Creating and developing software is an area where I want to develop.');
insert into school( name,speciality, direction, diploma_work, degree, start_date, end_date, user_id) values( 'WROCLAW SCHOOL OF INFORMATION TECHNOLOGY "HORYZONT" ', 'Computer Networks', 'IT', '"Analysis of selected aspects of TLS protocol security"','Master', '10.2017', '09.2020', 1);
insert into school(name,speciality, direction, diploma_work, degree, start_date, end_date, user_id) values( 'WROCLAW SCHOOL OF INFORMATION TECHNOLOGY "HORYZONT" ', 'Cryptography', 'IT', '"Hardware encryption using Raspberry-Pi"','Engineer', '10.2013', '02.2018', 1);
insert into school( name, direction, degree, start_date, end_date, user_id) values('IT TECHNICAL SCHOOL, KLODZKO ', 'IT' ,'TECHNICIAN', '09.2009', '06.2013', 1);
--insert into work(id, position, company, city, start_date, start_end, user_id)values(1, 'Software Developer','4D MARINE LEARNING - STARTUP', 'REMOTE', '07.2019', 'UNTIL-NOW', 1);
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Creation applications in C#');
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Analyse requirements or created applications ');
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Building application based on the UNITY engine');
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Develop and maintain software solutions');
--insert into work(id, position, company, city, start_date, start_end, user_id )values(2, 'PRODUCTION WORKER','ABB INDUSTRIAL SOLUTIONS', 'KLODZKO', '10.2018', 'UNTIL-NOW', 1);
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Programming of plc controllers: Siemens, Omron');
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Creating electrical and pneumatic diagrams,');
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Creating databases for printing and marking systems,');
----insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Optimization of device by changing the software');