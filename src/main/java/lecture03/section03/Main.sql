
CREATE TABLE IF NOT EXISTS user_profile
(
    id         BIGSERIAL PRIMARY KEY,
    first_name TEXT                                      NOT NULL,
    last_Name  TEXT                                      NOT NULL,
    email      TEXT UNIQUE                               NOT NULL,
    gender     TEXT CHECK (gender IN ('MALE', 'FEMALE')) NOT NULL,
    create_at  TIMESTAMP WITHOUT TIME ZONE               NOT NULL
    );

CREATE TABLE IF NOT EXISTS bank_account
(
    id        BIGINT PRIMARY KEY REFERENCES user_profile (id),
    create_at TIMESTAMP WITHOUT TIME ZONE NOT NULL
    );

CREATE TABLE IF NOT EXISTS cards
(
    id              BIGSERIAL PRIMARY KEY,
    bank_account_id BIGINT                      NOT NULL REFERENCES bank_account(id),
    cards           TEXT                        NOT NULL UNIQUE,
    create_at       TIMESTAMP WITHOUT TIME ZONE NOT NULL
    );

CREATE Table IF NOT EXISTS service
(
    bank_account_id BIGINT REFERENCES bank_account (id),
    cards_id        BIGINT REFERENCES cards(id),
    create_at       TIMESTAMP WITHOUT TIME ZONE NOT NULL,
    PRIMARY KEY (bank_account_id, cards_id)
    );

-- this is our data base query if we want to add data we should nwe query consul and put our data in their
-- insert into user_profile(id, first_name,last_Name,email,gender,create_at)
-- values (1,'Alex', 'mendez', '@gmail.com', 'Male', '2022-02-02 23:59:59.000000');
-- SELECT *FROM user_profile
-- join bank_account ba on user_profile.id = ba.id
-- join service s on ba.id = s.bank_account_id
-- join cards c on ba.id = c.bank_account_id
-- and if we want to crate some logic we should open another one. -> select * from cards

-- 1NF,2NF,3NF