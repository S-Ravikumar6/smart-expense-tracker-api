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

## Technologies Used

- Java 21
- Spring Boot
- Maven
- Swagger/OpenAPI
- Jakarta Validation
- Postman

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