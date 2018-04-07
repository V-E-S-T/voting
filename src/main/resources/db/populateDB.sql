DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS usersRole;
DROP TABLE IF EXISTS restourants;
DROP TABLE IF EXISTS dishes;
DROP SEQUENCE IF EXISTS global_sequence;

CREATE SEQUENCE global_sequence START 100000;

CREATE TABLE users
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name             VARCHAR                 NOT NULL,
  email            VARCHAR                 NOT NULL,
  password         VARCHAR                 NOT NULL,
  voted          BOOL DEFAULT FALSE       NOT NULL
);

CREATE TABLE usersRole
(
  user_ID          INTEGER,
  role             VARCHAR,
  CONSTRAINT user_role_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_ID) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE restourants
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  restourantName   VARCHAR                 NOT NULL
);

CREATE TABLE dishes
(
  restourant_ID    INTEGER,
  price            INTEGER,
  dish             VARCHAR,
  CONSTRAINT user_role_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_ID) REFERENCES users(id) ON DELETE CASCADE
);




