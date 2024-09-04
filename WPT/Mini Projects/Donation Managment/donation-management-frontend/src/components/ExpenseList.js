import React, { useEffect, useState } from 'react';
import axios from 'axios';

const ExpenseList = () => {
    const [expenses, setExpenses] = useState([]);

    useEffect(() => {
        axios.get('/api/expenses')
            .then(response => setExpenses(response.data))
            .catch(error => console.error("There was an error fetching the expenses!", error));
    }, []);

    return (
        <div>
            <h1>Expenses List</h1>
            <ul>
                {expenses.map(expense => (
                    <li key={expense.id}>
                        Spent on {expense.spentOn}: {expense.amount} on {expense.date}
                        <a href={expense.screenshotUrl} target="_blank" rel="noopener noreferrer">View Screenshot</a>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default ExpenseList;
