CREATE TABLE Users
(
    id            SERIAL PRIMARY KEY,
    username      VARCHAR(50) UNIQUE  NOT NULL,
    email         VARCHAR(100) UNIQUE NOT NULL,
    password_hash VARCHAR(255)        NOT NULL,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Blog_Posts
(
    id         SERIAL PRIMARY KEY,
    title      VARCHAR(255) NOT NULL,
    content    TEXT         NOT NULL,
    author_id  INT REFERENCES Users (id) ON DELETE CASCADE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE Comments
(
    id          SERIAL PRIMARY KEY,
    post_id     INT REFERENCES Blog_Posts (id) ON DELETE CASCADE,
    user_id     INT REFERENCES Users (id) ON DELETE CASCADE,
    comment     TEXT NOT NULL,
    created_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at  TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    is_editable BOOLEAN   DEFAULT TRUE
);

CREATE TABLE Likes
(
    id         SERIAL PRIMARY KEY,
    user_id    INT REFERENCES Users (id) ON DELETE CASCADE,
    post_id    INT REFERENCES Blog_Posts (id) ON DELETE CASCADE,
    comment_id INT REFERENCES Comments (id) ON DELETE CASCADE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

