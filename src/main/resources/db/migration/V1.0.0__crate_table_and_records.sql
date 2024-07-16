CREATE TABLE books (
                       id INT AUTO_INCREMENT PRIMARY KEY,
                       name VARCHAR(255) NOT NULL,
                       genre VARCHAR(100),
                       publisher VARCHAR(100),
                       isbn VARCHAR(20) UNIQUE NOT NULL,
                       pages INT,
                       language VARCHAR(50)
);


INSERT INTO books (id, name, genre, publisher, isbn, pages, language)
VALUES (1, 'Book One', 'Fiction', 'Publisher A', '978-3-16-148410-0', 320, 'English'),
       (2, 'Book Two', 'Non-Fiction', 'Publisher B', '978-1-23-456789-7', 220, 'English'),
       (3, 'Book Three', 'Science Fiction', 'Publisher C', '978-0-12-345678-9', 410, 'English'),
       (4, 'Book Four', 'Fantasy', 'Publisher D', '978-9-87-654321-0', 540, 'English'),
       (5, 'Book Five', 'Biography', 'Publisher E', '978-8-76-543210-1', 300, 'English'),
       (6, 'Book Six', 'History', 'Publisher F', '978-7-65-432109-2', 250, 'English'),
       (7, 'Book Seven', 'Children', 'Publisher G', '978-6-54-321098-3', 120, 'English'),
       (8, 'Book Eight', 'Mystery', 'Publisher H', '978-5-43-210987-4', 360, 'English'),
       (9, 'Book Nine', 'Romance', 'Publisher I', '978-4-32-109876-5', 280, 'English'),
       (10, 'Book Ten', 'Thriller', 'Publisher J', '978-3-21-098765-6', 450, 'English');
