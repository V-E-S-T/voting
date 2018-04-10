DROP TABLE IF EXISTS usersRole;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS dishes;
DROP TABLE IF EXISTS restaurantmenu;
DROP SEQUENCE IF EXISTS global_seq;

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
  restaurantName   VARCHAR                 NOT NULL,
  vote             INTEGER DEFAULT 0
);

CREATE TABLE dishes
(
  id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  restaurant_ID    INTEGER                 NOT NULL,
  price            DECIMAL                 NOT NULL,
  dish             VARCHAR                 NOT NULL,
  FOREIGN KEY (restaurant_ID) REFERENCES restaurantmenu (id) ON DELETE CASCADE
);
