create table roles
(
    id        bigint auto_increment
        primary key,
    role_name enum ('ADMIN', 'USER') null
);

create table users
(
    id            bigint auto_increment
        primary key,
    created_at    datetime(6)  not null,
    email         varchar(255) not null,
    password_hash varchar(255) not null,
    username      varchar(255) not null
);

create table blog_posts
(
    id         bigint auto_increment
        primary key,
    content    text not null,
    created_at datetime(6)  not null,
    title      varchar(255) not null,
    updated_at datetime(6)  not null,
    author_id  bigint       not null,
    foreign key (author_id) references users (id)
);

create table comments
(
    id          bigint auto_increment
        primary key,
    comment     text not null,
    created_at  datetime(6)  not null,
    is_editable bit          not null,
    updated_at  datetime(6)  not null,
    post_id     bigint       not null,
    user_id     bigint       not null,
    foreign key (post_id) references blog_posts (id),
    foreign key (user_id) references users (id)
);

create table likes
(
    id         bigint auto_increment
        primary key,
    created_at datetime(6) not null,
    comment_id bigint      null,
    post_id    bigint      not null,
    user_id    bigint      not null,
    foreign key (comment_id) references comments (id),
    foreign key (post_id) references blog_posts (id),
    foreign key (user_id) references users (id)
);

create table users_roles
(
    user_id  bigint not null,
    roles_id bigint not null,
    foreign key (user_id) references users (id),
    foreign key (roles_id) references roles (id)
);