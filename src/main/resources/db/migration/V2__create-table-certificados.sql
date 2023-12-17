CREATE TABLE certificados (
                              id BIGINT NOT NULL AUTO_INCREMENT,
                              descricao VARCHAR(255) NOT NULL,
                              aluno_id BIGINT,
                              PRIMARY KEY (id),
                              FOREIGN KEY (aluno_id) REFERENCES alunos(id)
);