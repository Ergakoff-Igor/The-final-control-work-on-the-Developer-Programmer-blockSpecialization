# GB. Ергаков И.Г. Итоговая контрольная работа по блоку Разработчик — Программист. Специализация

__*(Организуйте систему учёта для питомника, в котором живут домашние и вьючные животные)*__

## Задание
### Часть 1. Работа с Linux-Ubuntu
1. Используя команду cat в терминале операционной системы Linux
```sh
igor@igor-linux:~$ mkdir 'Итоговая контрольная работа'
igor@igor-linux:~$ cd 'Итоговая контрольная работа'
```
* создать два файла Домашние животные (заполнив файл собаками, кошками, хомяками) и Вьючные животными (заполнив файл Лошадьми, верблюдами и ослы)
```sh
igor@igor-linux:~/Итоговая контрольная работа$ cat > 'Домашние животные'
Собаки
Кошки
Хомяки
```
```sh
igor@igor-linux:~/Итоговая контрольная работа$ cat > 'Вьючные животные'
Лошади
Верблюды
Ослы
```
* объединить их. 
* Переименовать файл, дав ему новое имя (Друзья человека).
```sh
igor@igor-linux:~/Итоговая контрольная работа$ cat 'Домашние животные' 'Вьючные животные' > 'Друзья человека'
```
* Просмотреть содержимое созданного файла.
```sh
igor@igor-linux:~/Итоговая контрольная работа$ cat 'Друзья человека'
Собаки
Кошки
Хомяки
Лошади
Верблюды
Ослы
```
2. Создать директорию, переместить файл туда.
```sh
igor@igor-linux:~/Итоговая контрольная работа$ mkdir 'Новая директория'
igor@igor-linux:~/Итоговая контрольная работа$ mv 'Друзья человека' 'Новая директория'
```
```sh
igor@igor-linux:~/Итоговая контрольная работа$ ll
итого 20
drwxrwxr-x  3 igor igor 4096 июл 26 21:02  ./
drwxr-x--- 17 igor igor 4096 июл 26 20:20  ../
-rw-rw-r--  1 igor igor   39 июл 26 20:42 'Вьючные животные'
-rw-rw-r--  1 igor igor   37 июл 26 20:34 'Домашние животные'
drwxrwxr-x  2 igor igor 4096 июл 26 21:02 'Новая директория'/
```
```sh
igor@igor-linux:~/Итоговая контрольная работа$ cd 'Новая директория'
igor@igor-linux:~/Итоговая контрольная работа/Новая директория$ cat 'Друзья человека'
Собаки
Кошки
Хомяки
Лошади
Верблюды
Ослы
```
3. Подключить дополнительный репозиторий MySQL. Установить любой пакет из этого репозитория.
* Проверяем обновления
```sh
igor@igor-linux:~$ sudo apt update
Сущ:1 http://ru.archive.ubuntu.com/ubuntu jammy InRelease
Пол:2 http://ru.archive.ubuntu.com/ubuntu jammy-updates InRelease [119 kB]
Пол:3 http://security.ubuntu.com/ubuntu jammy-security InRelease [110 kB]
Пол:4 http://ru.archive.ubuntu.com/ubuntu jammy-backports InRelease [108 kB]
Пол:5 https://download.docker.com/linux/ubuntu jammy InRelease [48,9 kB]
Пол:6 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 Packages [853 kB]
Пол:7 https://download.docker.com/linux/ubuntu jammy/stable amd64 Packages [21,2 kB]
Пол:8 http://security.ubuntu.com/ubuntu jammy-security/main amd64 Packages [631 kB]
Пол:9 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main i386 Packages [454 kB]
Пол:10 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main Translation-en [208 kB]
Пол:11 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 DEP-11 Metadata [99,8 kB]
Пол:12 http://ru.archive.ubuntu.com/ubuntu jammy-updates/main amd64 c-n-f Metadata [15,4 kB]
Пол:13 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted amd64 Packages [668 kB]
Пол:14 http://ru.archive.ubuntu.com/ubuntu jammy-updates/restricted Translation-en [106 kB]
Пол:15 http://security.ubuntu.com/ubuntu jammy-security/main i386 Packages [277 kB]
Пол:16 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe i386 Packages [639 kB]
Пол:17 http://security.ubuntu.com/ubuntu jammy-security/main Translation-en [148 kB]
Пол:18 http://security.ubuntu.com/ubuntu jammy-security/main amd64 DEP-11 Metadata [41,5 kB]
Пол:19 http://security.ubuntu.com/ubuntu jammy-security/main amd64 c-n-f Metadata [11,0 kB]
Пол:20 http://security.ubuntu.com/ubuntu jammy-security/restricted amd64 Packages [651 kB]
Пол:21 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 Packages [954 kB]
Пол:22 http://security.ubuntu.com/ubuntu jammy-security/restricted Translation-en [104 kB]
Пол:23 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 Packages [756 kB]
Пол:24 http://security.ubuntu.com/ubuntu jammy-security/universe i386 Packages [544 kB]
Пол:25 http://security.ubuntu.com/ubuntu jammy-security/universe Translation-en [136 kB]
Пол:26 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe Translation-en [206 kB]
Пол:27 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 DEP-11 Metadata [274 kB]
Пол:28 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 DEP-11 Metadata [21,9 kB]
Пол:29 http://ru.archive.ubuntu.com/ubuntu jammy-updates/universe amd64 c-n-f Metadata [20,8 kB]
Пол:30 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse Translation-en [9 768 B]
Пол:31 http://ru.archive.ubuntu.com/ubuntu jammy-updates/multiverse amd64 DEP-11 Metadata [940 B]
Пол:32 http://ru.archive.ubuntu.com/ubuntu jammy-backports/main amd64 DEP-11 Metadata [7 976 B]
Пол:33 http://ru.archive.ubuntu.com/ubuntu jammy-backports/universe amd64 DEP-11 Metadata [15,3 kB]
Пол:34 http://security.ubuntu.com/ubuntu jammy-security/universe amd64 c-n-f Metadata [15,9 kB]
Получено 8 279 kB за 5с (1 570 kB/s)
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово
Может быть обновлено 19 пакетов. Запустите «apt list --upgradable» для их показа.
```
* Устанавливаем mysql-server
```sh
igor@igor-linux:~$ sudo apt install mysql-server
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово
Будут установлены следующие дополнительные пакеты:
  libaio1 libcgi-fast-perl libcgi-pm-perl libevent-core-2.1-7 libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl
  libfcgi0ldbl libhtml-template-perl libmecab2 libprotobuf-lite23 mecab-ipadic mecab-ipadic-utf8 mecab-utils
  mysql-client-8.0 mysql-client-core-8.0 mysql-common mysql-server-8.0 mysql-server-core-8.0
Предлагаемые пакеты:
  libipc-sharedcache-perl mailx tinyca
Следующие НОВЫЕ пакеты будут установлены:
  libaio1 libcgi-fast-perl libcgi-pm-perl libevent-core-2.1-7 libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl
  libfcgi0ldbl libhtml-template-perl libmecab2 libprotobuf-lite23 mecab-ipadic mecab-ipadic-utf8 mecab-utils
  mysql-client-8.0 mysql-client-core-8.0 mysql-common mysql-server mysql-server-8.0 mysql-server-core-8.0
Обновлено 0 пакетов, установлено 20 новых пакетов, для удаления отмечено 0 пакетов, и 19 пакетов не обновлено.
Необходимо скачать 29,3 MB архивов.
После данной операции объём занятого дискового пространства возрастёт на 242 MB.
reading /usr/share/mecab/dic/ipadic/Postp-col.csv ... 91
reading /usr/share/mecab/dic/ipadic/Noun.org.csv ... 16668
reading /usr/share/mecab/dic/ipadic/Noun.verbal.csv ... 12146
reading /usr/share/mecab/dic/ipadic/Verb.csv ... 130750
reading /usr/share/mecab/dic/ipadic/Adverb.csv ... 3032
reading /usr/share/mecab/dic/ipadic/Noun.place.csv ... 72999
reading /usr/share/mecab/dic/ipadic/Noun.others.csv ... 151
reading /usr/share/mecab/dic/ipadic/Postp.csv ... 146
reading /usr/share/mecab/dic/ipadic/Others.csv ... 2
reading /usr/share/mecab/dic/ipadic/Noun.nai.csv ... 42
emitting double-array: 100% |###########################################|
reading /usr/share/mecab/dic/ipadic/matrix.def ... 1316x1316
emitting matrix      : 100% |###########################################|

done!
update-alternatives: используется /var/lib/mecab/dic/ipadic-utf8 для предоставления /var/lib/mecab/dic/debian (mecab-dictionary) в автоматическом режиме
Настраивается пакет mysql-server-8.0 (8.0.33-0ubuntu0.22.04.4) …
update-alternatives: используется /etc/mysql/mysql.cnf для предоставления /etc/mysql/my.cnf (my.cnf) в автоматическом режиме
Renaming removed key_buffer and myisam-recover options (if present)
mysqld will log errors to /var/log/mysql/error.log
mysqld is running as pid 3968
Created symlink /etc/systemd/system/multi-user.target.wants/mysql.service → /lib/systemd/system/mysql.service.
Настраивается пакет mysql-server (8.0.33-0ubuntu0.22.04.4) …
Обрабатываются триггеры для man-db (2.10.2-1) …
Обрабатываются триггеры для libc-bin (2.35-0ubuntu3.1) …
```
* Удаляем mysql-server, т.к. в дальнейшем будем работать в контейнере
```sh
igor@igor-linux:~$ sudo apt purge mysql-server
Чтение списков пакетов… Готово
Построение дерева зависимостей… Готово
Чтение информации о состоянии… Готово
Следующие пакеты устанавливались автоматически и больше не требуются:
  libaio1 libcgi-fast-perl libcgi-pm-perl libevent-core-2.1-7 libevent-pthreads-2.1-7 libfcgi-bin libfcgi-perl
  libfcgi0ldbl libhtml-template-perl libmecab2 libprotobuf-lite23 mecab-ipadic mecab-ipadic-utf8 mecab-utils
  mysql-client-8.0 mysql-client-core-8.0 mysql-common mysql-server-8.0 mysql-server-core-8.0
Для их удаления используйте «sudo apt autoremove».
Следующие пакеты будут УДАЛЕНЫ:
  mysql-server*
Обновлено 0 пакетов, установлено 0 новых пакетов, для удаления отмечено 1 пакетов, и 19 пакетов не обновлено.
После данной операции объём занятого дискового пространства уменьшится на 35,8 kB.
Хотите продолжить? [Д/н] y
(Чтение базы данных … на данный момент установлено 187996 файлов и каталогов.)
Удаляется mysql-server (8.0.33-0ubuntu0.22.04.4) …
```
4. Установить и удалить deb-пакет с помощью dpkg.
* Скачиваем пакет mysql-apt-config
```sh
igor@igor-linux:~$ wget https://dev.mysql.com/get/mysql-apt-config_0.8.25-1_all.deb
--2023-07-26 22:23:51--  https://dev.mysql.com/get/mysql-apt-config_0.8.25-1_all.deb
Распознаётся dev.mysql.com (dev.mysql.com)… 2.21.250.129, 2a02:26f0:fa00:5b8::2e31, 2a02:26f0:fa00:590::2e31
Подключение к dev.mysql.com (dev.mysql.com)|2.21.250.129|:443... соединение установлено.
HTTP-запрос отправлен. Ожидание ответа… 302 Moved Temporarily
Адрес: https://repo.mysql.com//mysql-apt-config_0.8.25-1_all.deb [переход]
--2023-07-26 22:23:52--  https://repo.mysql.com//mysql-apt-config_0.8.25-1_all.deb
Распознаётся repo.mysql.com (repo.mysql.com)… 104.76.200.230
Подключение к repo.mysql.com (repo.mysql.com)|104.76.200.230|:443... соединение установлено.
HTTP-запрос отправлен. Ожидание ответа… 200 OK
Длина: 18120 (18K) [application/x-debian-package]
Сохранение в: ‘mysql-apt-config_0.8.25-1_all.deb’

mysql-apt-config_0.8.25-1_all 100%[=================================================>]  17,70K  --.-KB/s    за 0s

2023-07-26 22:23:53 (196 MB/s) - ‘mysql-apt-config_0.8.25-1_all.deb’ сохранён [18120/18120]
```
* Устанавливаем пакет mysql-apt-config
```sh
igor@igor-linux:~$ sudo dpkg -i mysql-apt-config_0.8.25-1_all.deb
Выбор ранее не выбранного пакета mysql-apt-config.
(Чтение базы данных … на данный момент установлено 224875 файлов и каталогов.)
Подготовка к распаковке mysql-apt-config_0.8.25-1_all.deb …
Распаковывается mysql-apt-config (0.8.25-1) …
Настраивается пакет mysql-apt-config (0.8.25-1) …
```
* Удаляем пакет mysql-apt-config
```sh
igor@igor-linux:~$ sudo dpkg -r mysql-apt-config
(Чтение базы данных … на данный момент установлено 224880 файлов и каталогов.)
Удаляется mysql-apt-config (0.8.25-1) …
```
5. Выложить историю команд в терминале ubuntu
* Задание 1:
```sh
cat > 'Домашние животные'
cat > 'Вьючные животные'
cat 'Домашние животные' 'Вьючные животные' > 'Друзья человека'
cat 'Друзья человека'
```
* Задание 2:
```sh
mkdir 'Новая директория'
mv 'Друзья человека' 'Новая директория'
```
* Задание 3:
```sh
sudo apt update
sudo apt install mysql-server
sudo apt purge mysql-server
```
* Задание 4:
```sh
wget https://dev.mysql.com/get/mysql-apt-config_0.8.25-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.25-1_all.deb
sudo dpkg -r mysql-apt-config
```
### Часть 2. Работа с Диаграммами
6. Нарисовать диаграмму, в которой есть класс родительский класс, домашниеживотные и вьючные животные, в составы которых в случае домашних животных войдут классы: собаки, кошки, хомяки, а в класс вьючные животные войдут: Лошади, верблюды и ослы.

Для решения задания используем инструмент __*draw io*__

![Diagram Animal Screen](https://github.com/Ergakoff-Igor/The-final-control-work-on-the-Developer-Programmer-blockSpecialization/blob/main/Diagram/DiagramAnimals.png?raw=true)

__*[Файл .dravio](https://github.com/Ergakoff-Igor/The-final-control-work-on-the-Developer-Programmer-blockSpecialization/blob/main/Diagram/DiagramAnimals.drawio)*__

### Часть 3. Работа с MySQL
7. В подключенном MySQL репозитории создать базу данных “Друзья
человека”

Для решения задания будем использовать ранее установленный контейнер MySQL.

* Для этого устанавливаем образ последней версии MySQL с официального сайта https://hub.docker.com/_/mysql при помощи команды: 
```sh
igor@igor-linux:~$ sudo docker run -h $HOSTNAME --name test-mysql -e MYSQL_ROOT_PASSWORD=123 -d mysql:latest
```
* Заходим в контейнер test-mysql
```sh
igor@igor-linux:~$ sudo docker exec -it test-mysql bash
mysql -u root -p
```
* Добавляем базу данных
```sql
CREATE SCHEMA friends_of_man;
```
* Проверяем
```sql
SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| friends_of_man     |
| information_schema |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
```

8. Создать таблицы с иерархией из диаграммы в БД
* Заходим в базу данных __*friends_of_man*__
```sql
USE friends_of_man;
```
* Создаем таблицу __*animals*__
```sql
DROP TABLE IF EXISTS animals;
CREATE TABLE animals (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
	Class_name VARCHAR(20));
```
* Заполняем таблицу __*animals*__
```sql
INSERT INTO animals (Class_name) VALUES ('Pack_animals'),('Pets');  
SELECT * FROM animals;
+----+--------------+
| Id | Class_name   |
+----+--------------+
|  1 | Pack_animals |
|  2 | Pets         |
+----+--------------+
```
* Создаем таблицу __*pets*__
```sql
DROP TABLE IF EXISTS pets;
CREATE TABLE pets(
	Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animals (Id) ON DELETE CASCADE ON UPDATE CASCADE);

```
* Заполняем таблицу __*pets*__
```sql
INSERT INTO pets (Genus_name, Class_id) VALUES 
	('Cats', 2),
	('Dogs', 2),  
	('Hamsters', 2);  
SELECT * FROM pets;
+----+------------+----------+
| Id | Genus_name | Class_id |
+----+------------+----------+
|  1 | Cats       |        2 |
|  2 | Dogs       |        2 |
|  3 | Hamsters   |        2 |
+----+------------+----------+
```
* Создаем таблицу __*pack_animals*__
```sql
DROP TABLE IF EXISTS pack_animals;
CREATE TABLE pack_animals
(
	Id INT AUTO_INCREMENT PRIMARY KEY,
    Genus_name VARCHAR (20),
    Class_id INT,
    FOREIGN KEY (Class_id) REFERENCES animals (Id) ON DELETE CASCADE ON UPDATE CASCADE
);

```
* Заполняем таблицу __*pack_animals*__
```sql
INSERT INTO pack_animals (Genus_name, Class_id) VALUES 
  ('Horses', 1),
  ('Donkeys', 1),  
  ('Camels', 1);  
SELECT * FROM pack_animals;
+----+------------+----------+
| Id | Genus_name | Class_id |
+----+------------+----------+
|  1 | Horses     |        1 |
|  2 | Donkeys    |        1 |
|  3 | Camels     |        1 |
+----+------------+----------+
```
* Создаем таблицу __*pack_animals*__
```sql
CREATE TABLE cats (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```
* Создаем таблицу __*pack_animals*__
```sql
CREATE TABLE cats (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```
* Создаем таблицу __*dogs*__
```sql
CREATE TABLE dogs (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```
* Создаем таблицу __*hamsters*__
```sql
CREATE TABLE hamsters (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```
* Создаем таблицу __*horses*__
```sql
CREATE TABLE horses (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```
* Создаем таблицу __*camels*__
```sql
CREATE TABLE camels (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```
* Создаем таблицу __*donkeys*__
```sql
CREATE TABLE donkeys (
	Id INT AUTO_INCREMENT PRIMARY KEY, 
  Name VARCHAR(20), 
  Birthday DATE,
  Commands VARCHAR(50),
  Genus_id int,
  Foreign KEY (Genus_id) REFERENCES pets (Id) ON DELETE CASCADE ON UPDATE CASCADE);
```

* Проверяем
```sql
SHOW TABLES;
+--------------------------+
| Tables_in_friends_of_man |
+--------------------------+
| animals                  |
| camels                   |
| cats                     |
| dogs                     |
| donkeys                  |
| hamsters                 |
| horses                   |
| pack_animals             |
| pets                     |
+--------------------------+
```
9. Заполнить низкоуровневые таблицы именами(животных), командами
которые они выполняют и датами рождения
* Заполняем таблицу __*cats*__
```sql
INSERT INTO cats (Name, Birthday, Commands, Genus_id) VALUES 
	('Kaktus', '2011-01-01', 'ks-ks-ks', 1),
	('Tapok', '2016-01-01', "foo", 1),  
	('Shnyr', '2017-01-01', "go", 1);   
SELECT * FROM cats;
+----+--------+------------+----------+----------+
| Id | Name   | Birthday   | Commands | Genus_id |
+----+--------+------------+----------+----------+
|  1 | Kaktus | 2011-01-01 | ks-ks-ks |        1 |
|  2 | Tapok  | 2016-01-01 | foo      |        1 |
|  3 | Shnyr  | 2017-01-01 | go       |        1 |
+----+--------+------------+----------+----------+
```
* Заполняем таблицу __*dogs*__
```sql
INSERT INTO dogs (Name, Birthday, Commands, Genus_id) VALUES 
	('Layka', '2020-01-01', 'ko mne, lezhat, lapu, golos', 2),
	('Sucha', '2022-06-12', "sidet, lezhat, lapu", 2),  
	('New', '2019-03-01', "sidet, lezhat, lapu, sled, fas", 2), 
	('Zuza', '2020-05-10', "sidet, lezhat, foo, mesto", 2);
SELECT * FROM dogs;
+----+-------+------------+--------------------------------+----------+
| Id | Name  | Birthday   | Commands                       | Genus_id |
+----+-------+------------+--------------------------------+----------+
|  1 | Layka | 2020-01-01 | ko mne, lezhat, lapu, golos    |        2 |
|  2 | Sucha | 2022-06-12 | sidet, lezhat, lapu            |        2 |
|  3 | New   | 2019-03-01 | sidet, lezhat, lapu, sled, fas |        2 |
|  4 | Zuza  | 2020-05-10 | sidet, lezhat, foo, mesto      |        2 |
+----+-------+------------+--------------------------------+----------+
```
* Заполняем таблицу __*hamsters*__
```sql
INSERT INTO hamsters (Name, Birthday, Commands, Genus_id) VALUES 
	('First', '2020-10-12', '', 3),
	('Second', '2021-03-12', "fight", 3),  
	('Thirt', '2022-07-11', NULL, 3), 
	('Null', '2022-05-10', NULL, 3);
SELECT * FROM hamsters;
+----+--------+------------+----------+----------+
| Id | Name   | Birthday   | Commands | Genus_id |
+----+--------+------------+----------+----------+
|  1 | First  | 2020-10-12 |          |        3 |
|  2 | Second | 2021-03-12 | fight    |        3 |
|  3 | Thirt  | 2022-07-11 | NULL     |        3 |
|  4 | Null   | 2022-05-10 | NULL     |        3 |
+----+--------+------------+----------+----------+
```
* Заполняем таблицу __*horses*__
```sql
INSERT INTO horses (Name, Birthday, Commands, Genus_id) VALUES 
	('Kapusta', '2020-01-12', 'go', 1),
	('Mouse', '2017-03-12', "go, stop, jump", 1),  
	('Aurus', '2016-07-12', "go, stop, jump, none", 1), 
	('Marka', '2020-11-10', "go, stop, jump", 1);
SELECT * FROM horses;
+----+---------+------------+----------------------+----------+
| Id | Name    | Birthday   | Commands             | Genus_id |
+----+---------+------------+----------------------+----------+
|  1 | Kapusta | 2020-01-12 | go                   |        1 |
|  2 | Mouse   | 2017-03-12 | go, stop, jump       |        1 |
|  3 | Aurus   | 2016-07-12 | go, stop, jump, none |        1 |
|  4 | Marka   | 2020-11-10 | go, stop, jump       |        1 |
+----+---------+------------+----------------------+----------+
```
* Заполняем таблицу __*donkeys*__
```sql
INSERT INTO donkeys (Name, Birthday, Commands, Genus_id) VALUES 
	('Silny', '2019-04-10', "GO", 2),
	('Smely', '2020-03-12', "GO", 2),  
	('Gordy', '2021-07-12', "GO", 2), 
	('Spely', '2022-12-10', "GO", 2);
SELECT * FROM donkeys;
+----+-------+------------+----------+----------+
| Id | Name  | Birthday   | Commands | Genus_id |
+----+-------+------------+----------+----------+
|  1 | Silny | 2019-04-10 | GO       |        2 |
|  2 | Smely | 2020-03-12 | GO       |        2 |
|  3 | Gordy | 2021-07-12 | GO       |        2 |
|  4 | Spely | 2022-12-10 | GO       |        2 |
+----+-------+------------+----------+----------+
```
* Заполняем таблицу __*camels*__
```sql
INSERT INTO camels (Name, Birthday, Commands, Genus_id) VALUES 
	('Malysh', '2022-04-10', 'jump', 3),
	('Gorbach', '2019-03-12', "GO", 3),  
	('Silach', '2015-07-12', "stop", 3), 
	('Bol', '2022-12-10', "top", 3);
SELECT * FROM camels;
+----+---------+------------+----------+----------+
| Id | Name    | Birthday   | Commands | Genus_id |
+----+---------+------------+----------+----------+
|  1 | Malysh  | 2022-04-10 | jump     |        3 |
|  2 | Gorbach | 2019-03-12 | GO       |        3 |
|  3 | Silach  | 2015-07-12 | stop     |        3 |
|  4 | Bol     | 2022-12-10 | top      |        3 |
+----+---------+------------+----------+----------+
```
10. Удалив из таблицы верблюдов, т.к. верблюдов решили перевезти в другой питомник на зимовку. Объединить таблицы лошади, и ослы в одну таблицу.
* Очищаем таблицу с верблюдами
```sql
SET SQL_SAFE_UPDATES = 0;
DELETE FROM camels;
SELECT * FROM camels;
Empty set (0.00 sec)
```
* Объединяем таблицы лошади, и ослы в одну таблицу
```sql
SELECT * FROM horses
UNION
SELECT * FROM donkeys;
+----+---------+------------+----------------------+----------+
| Id | Name    | Birthday   | Commands             | Genus_id |
+----+---------+------------+----------------------+----------+
|  1 | Kapusta | 2020-01-12 | go                   |        1 |
|  2 | Mouse   | 2017-03-12 | go, stop, jump       |        1 |
|  3 | Aurus   | 2016-07-12 | go, stop, jump, none |        1 |
|  4 | Marka   | 2020-11-10 | go, stop, jump       |        1 |
|  1 | Silny   | 2019-04-10 | GO                   |        2 |
|  2 | Smely   | 2020-03-12 | GO                   |        2 |
|  3 | Gordy   | 2021-07-12 | GO                   |        2 |
|  4 | Spely   | 2022-12-10 | GO                   |        2 |
+----+---------+------------+----------------------+----------+
```
11. Создать новую таблицу “молодые животные” в которую попадут все животные старше 1 года, но младше 3 лет и в отдельном столбце с точностью до месяца подсчитать возраст животных в новой таблице
```sql
CREATE VIEW all_animals AS
SELECT * FROM horses
UNION
SELECT * FROM donkeys
UNION
SELECT * FROM dogs
UNION
SELECT * FROM cats
UNION
SELECT * FROM hamsters;

DROP TABLE IF EXISTS young_animals;
CREATE TABLE young_animals
SELECT Id, Name, Birthday, Commands, Genus_id, TIMESTAMPDIFF(MONTH, Birthday, CURDATE()) AS Age_in_monthss
FROM all_animals
WHERE Birthday BETWEEN ADDDATE(curdate(), INTERVAL -3 YEAR) AND ADDDATE(CURDATE(), INTERVAL -1 YEAR);
SELECT * FROM young_animals;
+----+--------+------------+---------------------+----------+----------------+
| Id | Name   | Birthday   | Commands            | Genus_id | Age_in_monthss |
+----+--------+------------+---------------------+----------+----------------+
|  4 | Marka  | 2020-11-10 | go, stop, jump      |        1 |             32 |
|  3 | Gordy  | 2021-07-12 | GO                  |        2 |             24 |
|  2 | Sucha  | 2022-06-12 | sidet, lezhat, lapu |        2 |             13 |
|  1 | First  | 2020-10-12 |                     |        3 |             33 |
|  2 | Second | 2021-03-12 | fight               |        3 |             28 |
|  3 | Thirt  | 2022-07-11 | NULL                |        3 |             12 |
|  4 | Null   | 2022-05-10 | NULL                |        3 |             14 |
+----+--------+------------+---------------------+----------+----------------+
```
12. Объединить все таблицы в одну, при этом сохраняя поля, указывающие на прошлую принадлежность к старым таблицам.
```sql
SELECT h.Name, h.Birthday, h.Commands, pa.Genus_name
FROM horses h
LEFT JOIN young_animals ya ON ya.Name = h.Name
LEFT JOIN pack_animals pa ON pa.Id = h.Genus_id
UNION 
SELECT d.Name, d.Birthday, d.Commands, pa.Genus_name
FROM donkeys d 
LEFT JOIN young_animals ya ON ya.Name = d.Name
LEFT JOIN pack_animals pa ON pa.Id = d.Genus_id
UNION
SELECT c.Name, c.Birthday, c.Commands, ha.Genus_name
FROM cats c
LEFT JOIN young_animals ya ON ya.Name = c.Name
LEFT JOIN pets ha ON ha.Id = c.Genus_id
UNION
SELECT d.Name, d.Birthday, d.Commands, ha.Genus_name
FROM dogs d
LEFT JOIN young_animals ya ON ya.Name = d.Name
LEFT JOIN pets ha ON ha.Id = d.Genus_id
UNION
SELECT hm.Name, hm.Birthday, hm.Commands, ha.Genus_name
FROM hamsters hm
LEFT JOIN young_animals ya ON ya.Name = hm.Name
LEFT JOIN pets ha ON ha.Id = hm.Genus_id;
+---------+------------+--------------------------------+------------+
| Name    | Birthday   | Commands                       | Genus_name |
+---------+------------+--------------------------------+------------+
| Kapusta | 2020-01-12 | go                             | Horses     |
| Mouse   | 2017-03-12 | go, stop, jump                 | Horses     |
| Aurus   | 2016-07-12 | go, stop, jump, none           | Horses     |
| Marka   | 2020-11-10 | go, stop, jump                 | Horses     |
| Silny   | 2019-04-10 | GO                             | Donkeys    |
| Smely   | 2020-03-12 | GO                             | Donkeys    |
| Gordy   | 2021-07-12 | GO                             | Donkeys    |
| Spely   | 2022-12-10 | GO                             | Donkeys    |
| Kaktus  | 2011-01-01 | ks-ks-ks                       | Cats       |
| Tapok   | 2016-01-01 | foo                            | Cats       |
| Shnyr   | 2017-01-01 | go                             | Cats       |
| Layka   | 2020-01-01 | ko mne, lezhat, lapu, golos    | Dogs       |
| Sucha   | 2022-06-12 | sidet, lezhat, lapu            | Dogs       |
| New     | 2019-03-01 | sidet, lezhat, lapu, sled, fas | Dogs       |
| Zuza    | 2020-05-10 | sidet, lezhat, foo, mesto      | Dogs       |
| First   | 2020-10-12 |                                | Hamsters   |
| Second  | 2021-03-12 | fight                          | Hamsters   |
| Thirt   | 2022-07-11 | NULL                           | Hamsters   |
| Null    | 2022-05-10 | NULL                           | Hamsters   |
+---------+------------+--------------------------------+------------+
```

### Часть 4. Написание программы на языке Java
13. Создать класс с Инкапсуляцией методов и наследованием по диаграмме.
* Создаем родительский класс __*Animal*__
```java
import java.util.ArrayList;

public abstract class Animal {
    private String name;
    private String birthday;
    private ArrayList<String> commands;

    public Animal(String name, String birthday, 
    ArrayList<String> commands) {
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public ArrayList<String> getCommands() {
        return commands;
    }

    public void setCommands(ArrayList<String> commands) {
        this.commands = commands;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else return this.getName().equals(((Animal) obj).getName());
    }
}
```
* От класса __*Animal*__ наследуем класс __*Pet*__
```java
import java.util.ArrayList;

public class Pet extends Animal {

    public Pet(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*Animal*__ наследуем класс __*PackAnimal*__
```java
import java.util.ArrayList;

public class PackAnimal extends Animal {

    public PackAnimal(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*Pet*__ наследуем класс __*Cat*__
```java
import java.util.ArrayList;

public class Cat extends Pet {

    public Cat(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*Pet*__ наследуем класс __*Dog*__
```java
import java.util.ArrayList;

public class Dog extends Pet {

    public Dog(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*Pet*__ наследуем класс __*Dog*__
```java
import java.util.ArrayList;

public class Hamster extends Pet{

    public Hamster(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*PackAnimal*__ наследуем класс __*Horse*__
```java
import java.util.ArrayList;

public class Horse extends PackAnimal{

    public Horse(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*PackAnimal*__ наследуем класс __*Camel*__
```java
import java.util.ArrayList;

public class Camel extends PackAnimal {

    public Camel(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
* От класса __*PackAnimal*__ наследуем класс __*Donkey*__
```java
import java.util.ArrayList;

public class Donkey extends PackAnimal{

    public Donkey(String name, String birthday, ArrayList<String> commands) {
        super(name, birthday, commands);
    }
    
}
```
14. Написать программу, имитирующую работу реестра домашних животных.
В программе должен быть реализован следующий функционал:\
14.1. Завести новое животное\
14.2. определять животное в правильный класс\
14.3. увидеть список команд, которое выполняет животное\
14.4. обучить животное новым командам\
14.5. Реализовать навигацию по меню\

15. Создайте класс Счетчик, у которого есть метод add(), увеличивающий̆ значение внутренней̆ int переменной̆ на 1 при нажатие “Завести новое животное” Сделайте так, чтобы с объектом такого типа можно было работать в блоке try-with-resources. Нужно бросить исключение, если работа с объектом типа счетчик была не в ресурсном try и/или ресурс остался открыт. Значение
считать в ресурсе try, если при заведения животного заполнены все поля.

__*[Решение заданий часть 14 и 15 по ссылке](https://github.com/Ergakoff-Igor/The-final-control-work-on-the-Developer-Programmer-blockSpecialization/tree/main/AnimalLog/src)*__








