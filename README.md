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