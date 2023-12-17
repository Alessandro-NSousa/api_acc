alter table certificados add titulo varchar(100),
    add observacao varchar(255),
    add ch bigint not null,
    add pontuacao bigint not null;
);