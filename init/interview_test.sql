-- init/interview_test.sql

-- Buat sequence status
CREATE SEQUENCE IF NOT EXISTS public.status_id_seq START 1;
-- Buat table status
CREATE TABLE IF NOT EXISTS public.status (
    id INTEGER PRIMARY KEY DEFAULT nextval('status_id_seq'),
    name VARCHAR(50)
);

-- Buat sequence transactions
CREATE SEQUENCE IF NOT EXISTS public.transactions_id_seq START 1;
-- Buat table transactions
CREATE TABLE IF NOT EXISTS public.transactions (
    id INTEGER PRIMARY KEY DEFAULT nextval('transactions_id_seq'),
    product_id VARCHAR(50),
    product_name VARCHAR(100),
    amount VARCHAR(50),
    customer_name VARCHAR(100),
    status INTEGER REFERENCES public.status(id),
    transaction_date TIMESTAMP,
    create_by VARCHAR(100),
    create_on TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Insert status
INSERT INTO public.status (id, name) VALUES (0, 'SUCCESS') ON CONFLICT DO NOTHING;
INSERT INTO public.status (id, name) VALUES (1, 'FAILED') ON CONFLICT DO NOTHING;

-- Insert transactions (sesuaikan jika perlu)
INSERT INTO public.transactions (id, product_id, product_name, amount, customer_name, status, transaction_date, create_by, create_on) VALUES
(1372, '10001', 'Test 1', '1000', 'abc', 0, '2022-07-10 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1373, '10002', 'Test 2', '2000', 'abc', 0, '2022-07-11 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1374, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-10 12:14:52', 'abc', '2022-07-10 12:14:52'),
(1375, '10002', 'Test 2', '1000', 'abc', 1, '2022-08-10 13:10:52', 'abc', '2022-07-10 13:10:52'),
(1376, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-10 13:11:52', 'abc', '2022-07-10 13:11:52'),
(1377, '10002', 'Test 2', '2000', 'abc', 0, '2022-08-12 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1378, '10001', 'Test 1', '1000', 'abc', 0, '2022-08-12 14:11:52', 'abc', '2022-07-10 14:11:52'),
(1379, '10002', 'Test 2', '1000', 'abc', 1, '2022-09-13 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1380, '10001', 'Test 1', '1000', 'abc', 0, '2022-09-13 13:14:52', 'abc', '2022-07-10 13:14:52'),
(1381, '10002', 'Test 2', '2000', 'abc', 0, '2022-09-14 09:11:52', 'abc', '2022-07-10 09:11:52'),
(1382, '10001', 'Test 1', '1000', 'abc', 0, '2022-09-14 10:14:52', 'abc', '2022-07-10 10:14:52'),
(1383, '10002', 'Test 2', '1000', 'abc', 1, '2022-08-15 13:14:52', 'abc', '2022-07-10 13:14:52');
