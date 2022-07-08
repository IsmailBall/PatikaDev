CREATE TABLE employee (
    
    Id serial PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE, 
    email VARCHAR(100)
);

insert into employee (name, birthday, email) values ('Abbye', '1954/02/25', 'asieur0@woothemes.com');
insert into employee (name, birthday, email) values ('Elyssa', '2008/02/06', 'ehammerson1@posterous.com');
insert into employee (name, birthday, email) values ('Pooh', '1973/10/25', 'pclipson2@ebay.co.uk');
insert into employee (name, birthday, email) values ('Olympia', '2018/06/11', 'ogarioch3@imgur.com');
insert into employee (name, birthday, email) values ('Rolfe', '2005/12/20', 'rstreeting4@nature.com');
insert into employee (name, birthday, email) values ('Denys', '1960/06/22', 'dbenezeit5@youtube.com');
insert into employee (name, birthday, email) values ('Tamas', '1969/12/12', 'twoonton6@discuz.net');
insert into employee (name, birthday, email) values ('Chaunce', '2019/11/10', 'caddis7@cmu.edu');
insert into employee (name, birthday, email) values ('Cindie', '1965/07/25', 'crelfe8@umn.edu');
insert into employee (name, birthday, email) values ('Joceline', null, 'jmcilrath9@oracle.com');
insert into employee (name, birthday, email) values ('Lorette', '2022/05/09', 'lmarplesa@canalblog.com');
insert into employee (name, birthday, email) values ('Kort', '1971/06/18', 'kbullochb@phoca.cz');
insert into employee (name, birthday, email) values ('Marmaduke', null, 'mhandsc@fema.gov');
insert into employee (name, birthday, email) values ('Karina', '1975/09/06', 'kilyinykhd@weather.com');
insert into employee (name, birthday, email) values ('Krystle', '2009/03/05', 'kjickellse@shinystat.com');
insert into employee (name, birthday, email) values ('Roberta', '2007/12/02', 'rjerzykf@slashdot.org');
insert into employee (name, birthday, email) values ('Brandais', '1988/10/07', 'bbishg@smugmug.com');
insert into employee (name, birthday, email) values ('Cornelia', '2018/09/18', 'cfoldsh@networkadvertising.org');
insert into employee (name, birthday, email) values ('Dal', '1968/03/23', 'dsulteri@cdc.gov');
insert into employee (name, birthday, email) values ('Roland', '1996/04/19', 'rlentschj@dell.com');
insert into employee (name, birthday, email) values ('Karlotte', '1951/08/10', 'kkeirk@netlog.com');
insert into employee (name, birthday, email) values ('Dani', '2006/03/17', 'drachuigl@paypal.com');
insert into employee (name, birthday, email) values ('Issiah', '2016/03/05', 'ibickerdikem@microsoft.com');
insert into employee (name, birthday, email) values ('Eleonore', '2019/02/09', 'ethickpennyn@about.me');
insert into employee (name, birthday, email) values ('Dick', null, 'dgeeritso@prweb.com');
insert into employee (name, birthday, email) values ('Lorene', '1985/02/14', 'lmairsp@cbslocal.com');
insert into employee (name, birthday, email) values ('Zollie', '1981/09/17', 'zpargetterq@friendfeed.com');
insert into employee (name, birthday, email) values ('Ken', '1979/05/24', 'khalliganr@latimes.com');
insert into employee (name, birthday, email) values ('Melisa', '2003/02/09', 'mpiborns@istockphoto.com');
insert into employee (name, birthday, email) values ('Alicea', '2016/11/03', 'abroselt@who.int');
insert into employee (name, birthday, email) values ('Hagen', '2007/05/19', 'hjaanu@weather.com');
insert into employee (name, birthday, email) values ('Berri', '1997/09/21', 'bdecopemanv@slate.com');
insert into employee (name, birthday, email) values ('Allissa', '1977/01/30', 'arylattw@dell.com');
insert into employee (name, birthday, email) values ('Kellie', '1978/03/04', 'kheeleyx@wix.com');
insert into employee (name, birthday, email) values ('Danica', '2019/04/08', 'dqusklayy@typepad.com');
insert into employee (name, birthday, email) values ('Maryjane', '1959/07/02', 'mliepmannz@reuters.com');
insert into employee (name, birthday, email) values ('Garey', '2009/10/30', 'ghedaux10@sogou.com');
insert into employee (name, birthday, email) values ('Germana', '1972/09/27', 'gbousler11@nasa.gov');
insert into employee (name, birthday, email) values ('Cornie', '1958/11/18', 'cbillingham12@discovery.com');
insert into employee (name, birthday, email) values ('Sarina', '2011/07/31', 'sshankle13@netscape.com');
insert into employee (name, birthday, email) values ('Ermin', '1985/03/01', 'emelan14@businessweek.com');
insert into employee (name, birthday, email) values ('Lizbeth', '2012/01/27', 'llawille15@printfriendly.com');
insert into employee (name, birthday, email) values ('Simone', '1982/01/30', 'ssantore16@examiner.com');
insert into employee (name, birthday, email) values ('Gilles', '1986/01/05', 'glacer17@usgs.gov');
insert into employee (name, birthday, email) values ('Marsiella', '1966/12/25', 'mwadham18@unblog.fr');
insert into employee (name, birthday, email) values ('Carl', '1994/09/13', 'cjakoviljevic19@wp.com');
insert into employee (name, birthday, email) values ('Maxie', '1996/02/19', 'mlidgate1a@nytimes.com');
insert into employee (name, birthday, email) values ('Anabella', '1963/04/02', 'agraddon1b@altervista.org');
insert into employee (name, birthday, email) values ('Lorrie', '1979/09/17', 'lpurchon1c@ycombinator.com');
insert into employee (name, birthday, email) values ('Nonna', '1951/10/16', 'nstevens1d@pagesperso-orange.fr');

update employee
set 
name = 'Sabir',
birthday = '1987-02-23',
email = 'pclipson2@ebay.co.uk'
WHERE Id = 1

DELETE FROM employee
where id = 2