insert into book (title, author, isbn, description, release_date) values ('Python dla każdego. Podstawy programowania', 'Jan Kowalski', '1234567891012', 'Chcesz się nauczyć programować? Świetna decyzja! Wybierz język obiektowy, łatwy w użyciu, z przejrzystą składnią. Python będzie wprost doskonały! Rozwijany od ponad 20 lat, jest dojrzałym językiem, pozwalającym tworzyć zaawansowane aplikacje dla różnych systemów operacyjnych. Ponadto posiada system automatycznego zarządzania pamięcią, który zdejmuje z programisty obowiązek panowania nad tym skomplikowanym obszarem.', '2014-11-11');
insert into book (title, author, isbn, description, release_date) values ('Czysty kod. Podręcznik dobrego programisty', 'Michał Nowak', '1234567891013', 'Poznaj najlepsze metody tworzenia doskonałego kodu', '2014-10-12');
insert into book (title, author, isbn, description, release_date) values ('Programista samouk. Profesjonalny przewodnik do samodzielnej nauki kodowania', 'Anna Nowak', '1234567891014', 'Nie wystarczy znajomość jednego języka programowania, aby zostać programistą. W rzeczywistości trzeba opanować dość szeroki zakres pojęć i paradygmatów, a także zrozumieć zagadnienia związane z algorytmami. Trzeba być na bieżąco z nowymi technologiami i narzędziami. Należy również poznać i zacząć stosować dobre praktyki programistyczne i przyswoić sobie zasady pracy w zespole. Przede wszystkim jednak priorytetem jest sama praktyka, ponieważ wielu programistów wciąż ma problem z pisaniem poprawnego kodu.', '2017-12-12');

insert into role (id, name) values(1, 'ADMIN');
insert into role (id, name) values(2, 'USER');

insert into user (id, username, password) values(1, 'admin', '$2a$10$csIVj5k8CB74npTTstUQuO3ObjmaM6y8cRMxvsKqpHmT3zNQxY/IK');
insert into user (id, username, password) values(2, 'user', '$2a$10$m7BBzoGFKzb8e3/q5AK/SuC.qNKnyh.GcHkKnJYXsvJGQREhZe0Zu');

insert into user_role (user_id, role_id) values(1,1);
insert into user_role (user_id, role_id) values(2,2);
