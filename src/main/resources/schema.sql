CREATE TABLE IF NOT EXISTS course (
    id BIGINT NOT NULL,
    course VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS student (
    id INT NOT NULL,
    name VARCHAR(255) NOT NULL,
    age DOUBLE NOT NULL,
    PRIMARY KEY (id)
);