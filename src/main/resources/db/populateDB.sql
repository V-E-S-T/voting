DELETE FROM usersRole;
DELETE FROM restaurantmenu;
DELETE FROM users;
DELETE FROM dishes;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password, voted) VALUES
  ('Pedro', 'user@yandex.ru', 'password', false),
  ('SuperMan', 'admin@gmail.com', 'admin', false);

INSERT INTO usersRole (role, user_ID) VALUES
  ('USER', 100000),
  ('ADMIN', 100001);

INSERT INTO restaurantmenu (restaurantName) VALUES
  ('CUPER'),                 --100002
  ('ADRIANA'),               --100003
  ('MOON LIGHT'),            --100004
  ('BLINCHIKOVAYA'),         --100005
  ('U GALI');                --100006

INSERT INTO dishes (dish, price, restourant_ID) VALUES
  ('Котлета по киевски', 15, 100002),
  ('Зама с лапшой', 1000, 100002),
  ('Борщ', 5, 100002),
  ('Капуста тушёная', 5, 100002),
  ('Картошка', 5, 100002),
  ('Каша шеничная', 3, 100002),
  ('Тефтели', 10, 100002),

  ('Окрошка', 10, 100003),
  ('Суп постный', 5, 100003),
  ('Солянка', 8, 100003),
  ('Каша гречневая', 3, 100003),
  ('Каша перловая', 3, 100003),
  ('Котлета куриная', 10, 100003),

  ('Суп овощной', 3, 100004),
  ('Суп с морепродуктами', 15, 100004),
  ('Макароны', 4, 100004),
  ('Капустняк', 5, 100004),
  ('Тефтели барселонские', 12, 100004),
  ('Рыба печёная', 7, 100004),

  ('Борщ украинский', 4, 100005),
  ('Зелёный борщ', 6, 100005),
  ('Плов', 8, 100005),
  ('Капуста тушёная', 4, 100005),
  ('Биток', 11, 100005),

  ('Свекольник', 4, 100006),
  ('Рис отварной', 6, 100006),
  ('Рыба жаренная', 8, 100006),
  ('Котлета рыбная', 4, 100006),
  ('Плов с овощами', 6, 100006);





