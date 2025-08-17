-- Set the auto increment increment (optional, affects all tables in session)
SET @@auto_increment_increment=50;

CREATE TABLE order_events (
    id BIGINT NOT NULL AUTO_INCREMENT,
    event_id VARCHAR(255) NOT NULL UNIQUE,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP,
    PRIMARY KEY (id)
) AUTO_INCREMENT = 1;
