package com.ravikumar.smartexpensetrackerapi.service;
import com.ravikumar.smartexpensetrackerapi.exception.ExpenseNotFoundException;
import com.ravikumar.smartexpensetrackerapi.model.Expense;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ExpenseService
{
    private final List<Expense> expenses = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1);

    public Expense addExpense(Expense expense)
    {

        expense.setId(idGenerator.getAndIncrement());
        expenses.add(expense);
        return expense;
    }

    public List<Expense> getAllExpenses()
    {
        return expenses;
    }
    public Expense getExpenseById(Long id)
    {
        for (Expense expense : expenses)
        {
            if (expense.getId().equals(id))
            {
                return expense;
            }
        }
        throw new ExpenseNotFoundException("Expense with ID " + id + " not found");
    }
    public Expense updateExpense(Long id, Expense updatedExpense)
    {
        for (Expense expense : expenses)
        {
            if (expense.getId().equals(id))
            {
                expense.setTitle(updatedExpense.getTitle());
                expense.setAmount(updatedExpense.getAmount());
                expense.setCategory(updatedExpense.getCategory());
                expense.setDate(updatedExpense.getDate());
                return expense;
            }
        }

        throw new ExpenseNotFoundException("Expense with ID " + id + " not found");
    }
    public boolean deleteExpense(Long id)
    {
        for (Expense expense : expenses)
        {
            if (expense.getId().equals(id))
            {
                expenses.remove(expense);
                return true;
            }
        }

        throw new ExpenseNotFoundException("Expense with ID " + id + " not found");
    }
    public Double getTotalExpenses()
    {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }
    public Map<String, Double> getCategorySummary()
    {
        Map<String, Double> categorySummary = new HashMap<>();
        for (Expense expense : expenses)
        {
            categorySummary.put(
                    expense.getCategory(),
                    categorySummary.getOrDefault(expense.getCategory(), 0.0)
                            + expense.getAmount()
            );
        }
        return categorySummary;
    }
}