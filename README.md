# totolist_ssp

--  CREATE TABLE task (
--     id serial PRIMARY KEY not null ,
--     task_title text not null ,
--     task_done bool,
--     task_date_create date,
--     task_date_change date,
--     case_urgency int
--     );

--  CREATE TABLE todo (
--        id serial PRIMARY KEY not null ,
--        todo_title text not null,
--        todo_date_create date,
--        todo_date_change date
--     );

spring.datasource.url=jdbc:postgresql://localhost:5432/todosDataBase
spring.datasource.username=postgres
spring.datasource.password=1

{
    "id":"",
    "todo_title":"create first todo in todoList",
    "todo_date_create":"2020-10-21",
    "todo_date_change":"2020-10-21"
}

{	      "id": "",
        "task_title": "First case",
        "task_date_create": "2020-10-14",
        "task_date_change": "2020-10-15",
        "case_urgency": "1",
        "task_done": "false"
        }
