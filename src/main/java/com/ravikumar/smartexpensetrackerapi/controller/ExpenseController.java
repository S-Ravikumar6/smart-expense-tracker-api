package com.ravikumar.smartexpensetrackerapi.controller;
import com.ravikumar.smartexpensetrackerapi.model.Expense;
import com.ravikumar.smartexpensetrackerapi.service.ExpenseService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/expenses")
@Tag(name = "Expense Management", description = "APIs for managing expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @Operation(summary = "Add a new expense")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Expense addExpense(@Valid @RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }

    @Operation(summary = "Get all expenses")
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @Operation(summary = "Get expense by ID")
    @GetMapping("/{id}")
    public Expense getExpenseById(@PathVariable Long id) {
        return expenseService.getExpenseById(id);
    }

    @Operation(summary = "Update an existing expense")
    @PutMapping("/{id}")
    public Expense updateExpense(@PathVariable Long id,
                                 @Valid @RequestBody Expense expense) {
        return expenseService.updateExpense(id, expense);
    }

    @Operation(summary = "Delete an expense")
    @DeleteMapping("/{id}")
    public boolean deleteExpense(@PathVariable Long id) {
        return expenseService.deleteExpense(id);
    }

    @Operation(summary = "Get total amount of all expenses")
    @GetMapping("/summary/total")
    public Double getTotalExpenses() {
        return expenseService.getTotalExpenses();
    }

    @Operation(summary = "Get total expenses grouped by category")
    @GetMapping("/summary/category")
    public Map<String, Double> getCategorySummary() {
        return expenseService.getCategorySummary();
    }
}