-- Table: public.item33

-- DROP TABLE IF EXISTS public.item33;

CREATE TABLE IF NOT EXISTS public.item33
(
    id bigint NOT NULL,
    order33_id bigint NOT NULL,
    description text COLLATE pg_catalog."default",
    CONSTRAINT item33_pkey PRIMARY KEY (id),
    CONSTRAINT fkey FOREIGN KEY (order33_id)
    REFERENCES public.order33 (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.item33
    OWNER to pg;



-- Table: public.order33

-- DROP TABLE IF EXISTS public.order33;

CREATE TABLE IF NOT EXISTS public.order33
(
    id bigint NOT NULL,
    description text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT order33_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.order33
    OWNER to pg;

---------------------------------------

-- JOIN TABLE EXAMPLE :

-- Table: public.book

-- DROP TABLE IF EXISTS public.book;

CREATE TABLE IF NOT EXISTS public.book
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.book
    OWNER to pg;


-- Table: public.reader

-- DROP TABLE IF EXISTS public.reader;

CREATE TABLE IF NOT EXISTS public.reader
(
    id bigint NOT NULL,
    name text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT reader_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.reader
    OWNER to pg;


-- Table: public.review

-- DROP TABLE IF EXISTS public.review;

CREATE TABLE IF NOT EXISTS public.review
(
    id bigint NOT NULL,
    book_id bigint NOT NULL,
    reader_id bigint NOT NULL,
    description text COLLATE pg_catalog."default",
    CONSTRAINT review_pkey PRIMARY KEY (id),
    CONSTRAINT review_book_id_fkey FOREIGN KEY (book_id)
    REFERENCES public.book (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT review_reader_id_fkey FOREIGN KEY (reader_id)
    REFERENCES public.reader (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.review
    OWNER to pg;