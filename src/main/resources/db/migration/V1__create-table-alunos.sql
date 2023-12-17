create table alunos(

                        id bigint not null auto_increment,
                        ativo tinyint,
                        nome varchar(100) not null,
                        numero_matricula varchar(100) not null unique,
                        login varchar(100) not null unique,
                        senha varchar(255) not null,

                        primary key(id)

);