insert into user( name, last_name, phone, city, email, github, linkedin, skype,  about) values('Lukasz', 'Kusa', '539 413 521', 'Wroclaw', 'lukaszkusa@outlook.com', 'https://github.com/lukaszkusa', 'https://linkedin.com/in/lukasz-kusa', 'https://join.skype.com/invite/o1hLnvR9yrRO', 'Hi,  I''m Lukasz I come from Poland currently I have almost 4 years of commercial experience as developer in technologies like: Spring, Hibernate,Java 8/11, SQL, Linux, GitHub, Jira, In current work I made many improvements in the software of banking systems which contributed to improve financial transaction and they reported. At ABB I was working with PLC controllers in LAD programing language. My participation in the 4D Marine Learning startup, taught me independence in making decisions and allowed me to learn about UNITY technology. Creating and developing software is area where I want to develop.');
insert into school(name,speciality, direction, diploma_work, degree, start_date, end_date, user_id) values('WROCLAW SCHOOL OF INFORMATION TECHNOLOGY "HORYZONT" ', 'Computer Networks', 'IT', '"Analysis of selected aspects of TLS protocol security"','Master', '10.2017', '09.2020', 1);
insert into school(name,speciality, direction, diploma_work, degree, start_date, end_date, user_id) values('WROCLAW SCHOOL OF INFORMATION TECHNOLOGY "HORYZONT" ', 'Cryptography', 'IT', '"Hardware encryption using Raspberry-Pi"','Engineer', '10.2013', '02.2018', 1);
insert into work(position, company, city, start_date, start_end, user_id)values('Java Software Engineer','Capgemini, Wroclaw', 'HYBRID WORK MODEL', '05.2020', 'UNTIL-NOW', 1);
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Developing applications for banking industry');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Analyzing data system for integration testing');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Preparing release package for production');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(1, 'Code reviews, QA assistance');
insert into work(position, company, city, start_date, start_end, user_id)values('Software Developer','4D MARINE LEARNING - STARTUP', 'REMOTE', '07.2019', '05-2021', 1);
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Creation applications for marine industry');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Analyzing requirements of applications ');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Building application based on the UNITY engine');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(2, 'Developing and maintain software solutions');
insert into work(position, company, city, start_date, start_end, user_id )values('PLC Developer','ABB INDUSTRIAL SOLUTIONS', 'KLODZKO', '10.2018', '07.2019', 1);
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(3, 'Programming of plc controllers: Siemens, Omron');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(3, 'Creation electrical and pneumatic diagrams,');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(3, 'Creation databases for printing and marking systems,');
insert into WORK_RESPONSIBILITIES(work_id, RESPONSIBILITIES)values(3, 'Optimization of device by changing the software');