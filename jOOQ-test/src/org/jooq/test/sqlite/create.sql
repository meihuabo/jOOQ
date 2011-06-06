DROP VIEW IF EXISTS v_library;
/
DROP VIEW IF EXISTS v_author;
/
DROP VIEW IF EXISTS v_book;
/
DROP TABLE IF EXISTS t_book_to_book_store;
/
DROP TABLE IF EXISTS t_book_store;
/
DROP TABLE IF EXISTS t_book;
/
DROP TABLE IF EXISTS t_book_details;
/
DROP TABLE IF EXISTS t_author;
/
DROP TABLE IF EXISTS t_language;
/
DROP TABLE IF EXISTS x_test_case_71;
/
DROP TABLE IF EXISTS x_test_case_64_69;
/
DROP TABLE IF EXISTS x_test_case_85;
/
DROP TABLE IF EXISTS x_unused;
/

CREATE TABLE t_language (
  id INTEGER NOT NULL,
  cd CHAR(2) NOT NULL,
  description VARCHAR(50),
  
  CONSTRAINT pk_t_language PRIMARY KEY (ID)
);
/

CREATE TABLE t_author (
  ID INT NOT NULL,
  FIRST_NAME VARCHAR(50),
  LAST_NAME VARCHAR(50) NOT NULL,
  DATE_OF_BIRTH DATE,
  YEAR_OF_BIRTH INT,
  ADDRESS VARCHAR(50),
  
  CONSTRAINT pk_t_author PRIMARY KEY (ID)
);
/

CREATE TABLE t_book_details (
  ID INT,
    
  CONSTRAINT pk_t_book_details PRIMARY KEY (ID)
);
/

CREATE TABLE t_book (
  ID INT NOT NULL,
  AUTHOR_ID INT NOT NULL,
  co_author_id INTEGER,
  DETAILS_ID INT,
  TITLE VARCHAR(400) NOT NULL,
  PUBLISHED_IN INT NOT NULL,
  LANGUAGE_ID INT NOT NULL,
  CONTENT_TEXT LONGVARCHAR,
  CONTENT_PDF LONGVARBINARY,
  
  CONSTRAINT pk_t_book PRIMARY KEY (ID),
  CONSTRAINT fk_t_book_author_id FOREIGN KEY (AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_co_author_id FOREIGN KEY (CO_AUTHOR_ID) REFERENCES T_AUTHOR(ID),
  CONSTRAINT fk_t_book_details_id FOREIGN KEY (DETAILS_ID) REFERENCES T_BOOK_DETAILS(ID), 
  CONSTRAINT fk_t_book_language_id FOREIGN KEY (LANGUAGE_ID) REFERENCES T_LANGUAGE(ID)
);
/

CREATE TABLE t_book_store (
  id INT identity, 
  name VARCHAR(400) NOT NULL,
  
  CONSTRAINT uk_t_book_store_name PRIMARY KEY(name)
);
/

CREATE TABLE t_book_to_book_store (
  book_store_name VARCHAR(400) NOT NULL,
  book_id INT NOT NULL,
  stock INT,
   
  CONSTRAINT pk_b2bs PRIMARY KEY(book_store_name, book_id),
  CONSTRAINT fk_b2bs_bs_name FOREIGN KEY (book_store_name)
                             REFERENCES t_book_store (name)
                             ON DELETE CASCADE,
  CONSTRAINT fk_b2bs_b_id    FOREIGN KEY (book_id)
                             REFERENCES t_book (id)
                             ON DELETE CASCADE
)
/


CREATE TABLE x_unused (
  ID INT NOT NULL,
  NAME VARCHAR(10) NOT NULL,
  ID_REF INT,
  CLASS INT,
  FIELDS INT,
  CONFIGURATION INT,
  U_D_T INT,
  META_DATA INT,
  TYPE0 INT,
  PRIMARY_KEY INT,
  PRIMARYKEY INT,	
  NAME_REF VARCHAR(10),
   
  CONSTRAINT pk_x_unused PRIMARY KEY(ID, NAME),
  CONSTRAINT uk_x_unused_id UNIQUE(ID),
  CONSTRAINT fk_x_unused_self FOREIGN KEY(ID_REF, NAME_REF) REFERENCES X_UNUSED(ID, NAME)
);
/

CREATE TABLE x_test_case_64_69 (
  ID INT NOT NULL,
  UNUSED_ID INT,
   
  CONSTRAINT pk_x_test_case_64_69 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_64_69 FOREIGN KEY(UNUSED_ID) REFERENCES X_UNUSED(ID)
);
/

CREATE TABLE x_test_case_71 (
  ID INT NOT NULL,
  TEST_CASE_64_69_ID SMALLINT,
 
  CONSTRAINT pk_x_test_case_71 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_71 FOREIGN KEY(TEST_CASE_64_69_ID) REFERENCES X_TEST_CASE_64_69(ID)
);
/

CREATE TABLE x_test_case_85 (
  id int NOT NULL,
  x_unused_id int,
  x_unused_name VARCHAR(10),
	
  CONSTRAINT pk_x_test_case_85 PRIMARY KEY(ID),
  CONSTRAINT fk_x_test_case_85 FOREIGN KEY(x_unused_id, x_unused_name) REFERENCES X_UNUSED(id, name)
);
/

CREATE VIEW V_LIBRARY AS
SELECT T_AUTHOR.FIRST_NAME AUTHOR, T_BOOK.TITLE TITLE
FROM T_AUTHOR JOIN T_BOOK ON T_BOOK.AUTHOR_ID = T_AUTHOR.ID;
/
  
CREATE VIEW v_author AS
SELECT * FROM t_author
/

CREATE VIEW v_book AS
SELECT * FROM t_book
/


