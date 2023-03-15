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

-- ----------

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


