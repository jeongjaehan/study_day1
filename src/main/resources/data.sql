create table Account (id identity,
						username varchar unique,
						password varchar not null,
						firstName varchar not null, 
						lastName varchar not null,
						primary key (id));

						
insert into Account (username, password, firstName, lastName) values ('habuma', 'freebirds', 'Craig', 'Walls');
insert into Account (username, password, firstName, lastName) values ('kdonald', 'melbourne', 'Keith', 'Donald');
insert into Account (username, password, firstName, lastName) values ('rclarkson', 'atlanta', 'Roy', 'Clarkson');
