CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    role VARCHAR(50) NOT NULL
);

CREATE TABLE organizations (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE teams (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    organization_id INT REFERENCES organizations(id)
);

CREATE TABLE projects (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50),
    priority VARCHAR(50),
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    responsible_user_id INT REFERENCES users(id),
    organization_id INT REFERENCES organizations(id)
);

CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50),
    priority VARCHAR(50),
    due_date TIMESTAMP,
    estimated_hours INT,
    hours_worked INT,
    project_id INT REFERENCES projects(id),
    assigned_user_id INT REFERENCES users(id)
);

CREATE TABLE task_history (
    id SERIAL PRIMARY KEY,
    task_id INT REFERENCES tasks(id),
    status VARCHAR(50),
    change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE comments (
    id SERIAL PRIMARY KEY,
    task_id INT REFERENCES tasks(id),
    user_id INT REFERENCES users(id),
    comment TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE checklists (
    id SERIAL PRIMARY KEY,
    task_id INT REFERENCES tasks(id),
    item VARCHAR(255),
    completed BOOLEAN DEFAULT FALSE
);