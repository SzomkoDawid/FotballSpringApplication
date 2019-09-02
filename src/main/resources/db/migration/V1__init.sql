CREATE TABLE clubs
(
    id        bigint(20)  NOT NULL AUTO_INCREMENT,
    name      VARCHAR(40) NOT NULL,
    nick_name VARCHAR(40) NOT NULL,
    league    VARCHAR(50) NOT NULL,
    PRIMARY KEY (id)
);
CREATE TABLE players
(
    id         bigint(20)  NOT NULL AUTO_INCREMENT,
    club_id   bigint(20)  NOT NULL,
    first_name VARCHAR(40) NOT NULL,
    last_name  VARCHAR(40) NOT NULL,
    age        int(50)     NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (club_id) REFERENCES clubs (id)
);
