DROP TABLE IF EXISTS public.p_order;

CREATE TABLE IF NOT EXISTS public p_order
(
    id bigint NOT NULL,
    customer_id bigint NOT NULL,
    item_id bigint NOT NULL,
    comment text COLLATE pg_catalog."default",
    CONSTRAINT order_pkey PRIMARY KEY (id),
    FOREIGN KEY (customer_id) REFERENCES customer(id),
    FOREIGN KEY (item_id) REFERENCES item(id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public."order"
    OWNER to pg;






DROP TABLE IF EXISTS public.customer;

CREATE TABLE IF NOT EXISTS public.customer
(
    id bigint NOT NULL,
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    address character varying(100) COLLATE pg_catalog."default",
    CONSTRAINT customer_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.customer
    OWNER to pg;










DROP TABLE IF EXISTS public.item;

CREATE TABLE IF NOT EXISTS public.item
(
    id bigint NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    note text COLLATE pg_catalog."default",
    CONSTRAINT item_pkey PRIMARY KEY (id)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.item
    OWNER to pg;