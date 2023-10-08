-- FileInfo 엔티티에 대한 더미 데이터 생성
INSERT INTO FILE_INFO (FILE_TYPE, CREATED_DATE, MODIFIED_DATE) VALUES
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('CONTENT', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now()),
('LOCATION', now(), now());

-- File 엔티티에 대한 더미 데이터 생성
INSERT INTO FILE (FILE_TITLE, FILE_URL, FILE_INFO_ID, CREATED_DATE, MODIFIED_DATE) VALUES
('Movie Poster 1', 'movie_poster1.jpg', 1, now(), now()),
('Movie Poster 2', 'movie_poster2.jpg', 2, now(), now()),
('Movie Poster 3', 'movie_poster3.jpg', 3, now(), now()),
('Movie Poster 4', 'movie_poster4.jpg', 4, now(), now()),
('Movie Poster 5', 'movie_poster5.jpg', 5, now(), now()),
('Movie Poster 5', 'movie_poster5.jpg', 6, now(), now()),
('Movie Poster 5', 'movie_poster5.jpg', 7, now(), now()),
('Movie Poster 5', 'movie_poster5.jpg', 8, now(), now()),
('Movie Poster 5', 'movie_poster5.jpg', 9, now(), now()),
('Movie Poster 5', 'movie_poster5.jpg', 10, now(), now()),
('Location Image 1', 'location_image1.jpg', 11, now(), now()),
('Location Image 2', 'location_image2.jpg', 12, now(), now()),
('Location Image 3', 'location_image3.jpg', 13, now(), now()),
('Location Image 4', 'location_image4.jpg', 14, now(), now()),
('Location Image 5', 'location_image5.jpg', 15, now(), now()),
('Location Image 5', 'location_image5.jpg', 16, now(), now()),
('Location Image 5', 'location_image5.jpg', 17, now(), now()),
('Location Image 5', 'location_image5.jpg', 18, now(), now()),
('Location Image 5', 'location_image5.jpg', 19, now(), now()),
('Location Image 5', 'location_image5.jpg', 20, now(), now());

-- Content 엔티티에 대한 더미 데이터 생성
INSERT INTO CONTENT (CONTENT_TITLE, IMAGE_ID, CONTENT_TYPE, CREATED_DATE, MODIFIED_DATE) VALUES
('Inception', 1, 'MOVIE', now(), now()),
('Breaking Bad', 2,  'DRAMA', now(), now()),
('The Shawshank Redemption', 3, 'MOVIE', now(), now()),
('Game of Thrones', 4, 'DRAMA', now(), now()),
('The Dark Knight', 5, 'MOVIE', now(), now()),
('Stranger Things', 6, 'DRAMA', now(), now()),
('Forrest Gump', 7, 'MOVIE', now(), now()),
('The Crown', 8, 'DRAMA', now(), now()),
('Pulp Fiction', 9, 'MOVIE', now(), now()),
('Friends', 10, 'DRAMA', now(), now());

-- ContentLocation 엔티티에 대한 더미 데이터 생성
INSERT INTO CONTENTS_LOCATION (LOCATION_NAME, LOCATION_DETAIL, LAT, LNG, CONTENT_ID, IMAGE_ID, CREATED_DATE, MODIFIED_DATE) VALUES
('Forest Location', 'A scenic forest location', '37.12345', '-122.45678', 1, 11, now(), now()),
('Beach Location', 'A beautiful beachfront setting', '34.56789', '-118.90123', 2, 12, now(), now()),
('City Park', 'A city park with greenery', '40.98765', '-74.12345', 3, 13, now(), now()),
('Mountain Retreat', 'A serene mountain retreat', '41.23456', '-122.78901', 4, 14, now(), now()),
('Historic Castle', 'A historic castle location', '51.67890', '0.12345', 5, 15, now(), now()),
('Desert Oasis', 'An oasis in the desert', '25.67890', '45.90123', 6, 16, now(), now()),
('Rooftop View', 'A rooftop with a city view', '38.90123', '-77.23456', 7, 17, now(), now()),
('Lake Shore', 'A picturesque lakeside spot', '45.12345', '-71.56789', 8, 18, now(), now()),
('Countryside Farm', 'A charming countryside farm', '39.45678', '-75.90123', 9, 19, now(), now()),
('Mystic Cave', 'A mysterious cave location', '42.78901', '123.45678', 10, 20, now(), now());