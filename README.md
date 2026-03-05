# MiniTutorBotAPI

Luis Fernando Rojo Valdés A01640584

José Pablo López Rodríguez A01638911

Bernardo Santiago Marín A01638915

Tomáš Sládek A01832110

Alexia Lopez Garcia A01639419

---

To run this Java Spring Boot API, first navigate to the `/tutorbot-api` subdirectory using `cd tutorbot-api/`.
Then, use `mvn spring-boot:run` to launch the API.

## Available Documentation

The full documentation with examples can be found on [Postman](https://documenter.getpostman.com/view/45107033/2sBXcKDef3) (https://documenter.getpostman.com/view/45107033/2sBXcKDef3).

The base url for all requests is `http://localhost:8080`

### Students
* GET `/api/students`: Returns all students.
* GET `/api/students/:id` Returns the student of the given id, or 404.
* POST `/api/students` Creates a new student and returns the new object. 
Required body:
```json
{
    "name": "Bernardo",
    "email": "a01638915@tec.mx",
    "level": "Expert"
}
```
Example response:
```json
{
    "id": 116,
    "name": "Bernardo",
    "email": "a01638915@tec.mx",
    "level": "Expert"
}
```

### Exercises
* GET `/api/exercises`: Returns all exercises.
* GET `/api/exercises?difficulty=` Query all exercises by difficulty. Accepted values are `Easy`, `Intermediate` and `Advanced`.
* POST `/api/exercises/submit`: Submit an answer to a question, by student id.
Required body:
```json
{
  "studentId": 110,
  "exerciseId": 11,
  "answer": "79"
}
```
Returns a Feedback object, or 404.
```json
{
    "studentId": 110,
    "exerciseId": 11,
    "answer": "79",
    "score": 100.0,
    "message": "Correct answer",
    "correct": true
}
```

---

## Testing Screenshots
<img width="1777" height="1185" alt="Xnapper-2026-03-05-13 07 22" src="https://github.com/user-attachments/assets/0f1bfaa2-fe04-41a3-aa6b-a535de82b903" />

<img width="1777" height="1185" alt="Xnapper-2026-03-05-13 13 02" src="https://github.com/user-attachments/assets/829bdc9c-4c47-41c7-aa10-213f87542d77" />

<img width="1777" height="1185" alt="Xnapper-2026-03-05-13 13 54" src="https://github.com/user-attachments/assets/f5ae0566-35f1-4e23-81bd-1b51d5f5b4c2" />

<img width="1878" height="1235" alt="Xnapper-2026-03-05-13 14 57" src="https://github.com/user-attachments/assets/4e53f780-9849-4eb2-ac25-aaa933d43b48" />

<img width="1878" height="1235" alt="Xnapper-2026-03-05-13 15 30" src="https://github.com/user-attachments/assets/a56a5917-07a2-4125-8062-463fbefcbb53" />

<img width="1878" height="1235" alt="Xnapper-2026-03-05-13 15 54" src="https://github.com/user-attachments/assets/b3d8f08a-ecca-4677-aac5-04bdd358da67" />
