# Smart Expense Tracker API

A RESTful API built using Spring Boot for managing personal expenses. This project demonstrates CRUD operations, validation, exception handling, summary reports, and API documentation using Swagger/OpenAPI.

---

## Features

- Add a new expense
- View all expenses
- View an expense by ID
- Update an expense
- Delete an expense
- Total expense summary
- Category-wise expense summary
- Bean Validation
- Global Exception Handling
- Swagger/OpenAPI Documentation

---
## Key Highlights

- Implemented complete CRUD operations for expense management.
- Created REST endpoints to add, retrieve, update, and delete expenses.
- Added endpoints to calculate the total expenses and category-wise expense summary.
- Used Bean Validation to validate user input (required fields, positive amount, valid date).
- Implemented Global Exception Handling to return meaningful error responses with appropriate HTTP status codes (e.g., 400 Bad Request, 404 Not Found).
- Added custom exception handling for resources that do not exist.
- Configured Swagger/OpenAPI for interactive API documentation and testing.
- Tested all endpoints using Postman to verify successful and error scenarios.

---
## Technologies Used

- Java 21
- Spring Boot
- Maven
- Swagger/OpenAPI
- Jakarta Validation
- Postman

---

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Swagger](https://img.shields.io/badge/API-Swagger-green)
![Postman](https://img.shields.io/badge/Tested-Postman-orange)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black)

---

## Project Structure

src
├── controller
├── service
├── model
├── exception
├── config
└── SmartExpenseTrackerApiApplication.java

---

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /expenses | Add a new expense |
| GET | /expenses | Get all expenses |
| GET | /expenses/{id} | Get expense by ID |
| PUT | /expenses/{id} | Update expense |
| DELETE | /expenses/{id} | Delete expense |
| GET | /expenses/summary/total | Get total expenses |
| GET | /expenses/summary/category | Get category-wise summary |

---

## Running the Project

1. Clone the repository

```bash
git clone https://github.com/S-Ravikumar6/smart-expense-tracker-api.git
```

2. Open the project in IntelliJ IDEA.

3. Run:

```
SmartExpenseTrackerApiApplication.java
```

4. Open Swagger:

```
http://localhost:8080/swagger-ui/index.html
```

---

## Sample Request

```json
{
  "title": "Lunch",
  "amount": 250,
  "category": "Food",
  "date": "2026-08-02"
}
```

---

## Swagger

```
http://localhost:8080/swagger-ui/index.html
```

---

## Author

**S Ravikumar**

GitHub:
https://github.com/S-Ravikumar6

LinkedIn:
https://www.linkedin.com/in/s-ravi-kumar-17h06b2005d/
