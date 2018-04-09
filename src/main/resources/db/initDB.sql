DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS usersRole;
DROP TABLE IF EXISTS restaurantmenu;
DROP TABLE IF EXISTS dishes;
DROP SEQUENCE IF EXISTS global_sequence;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE users
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  name             VARCHAR                 NOT NULL,
  email            VARCHAR                 NOT NULL,
  password         VARCHAR                 NOT NULL,
  voted            BOOL DEFAULT FALSE      NOT NULL
);

CREATE TABLE usersRole
(
  user_ID          INTEGER                 NOT NULL,
  role             VARCHAR                 NOT NULL,
  CONSTRAINT user_role_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_ID) REFERENCES users(id) ON DELETE CASCADE
);

CREATE TABLE restaurantmenu
(
  id               INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  restaurantName   VARCHAR                 NOT NULL
);

CREATE TABLE dishes
(
  id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  restourant_ID    INTEGER                 NOT NULL,
  price            DECIMAL                 NOT NULL,
  dish             VARCHAR                 NOT NULL,
  FOREIGN KEY (restourant_ID) REFERENCES restaurantmenu (id) ON DELETE CASCADE
);