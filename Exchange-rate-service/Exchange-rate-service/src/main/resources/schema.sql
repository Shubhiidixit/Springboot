CREATE TABLE IF NOT EXISTS currency_exchange_rate (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    exchange_from VARCHAR(255) NOT NULL,
    exchange_to VARCHAR(255) NOT NULL,
    exchange_Rate DECIMAL(10, 2) NOT NULL
);
