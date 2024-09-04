import React, { useState } from 'react';
import axios from 'axios';

const AddExpense = () => {
    const [spentOn, setSpentOn] = useState('');
    const [date, setDate] = useState('');
    const [amount, setAmount] = useState('');
    const [screenshot, setScreenshot] = useState(null);

    const handleSubmit = (e) => {
        e.preventDefault();
        const formData = new FormData();
        formData.append('spentOn', spentOn);
        formData.append('date', date);
        formData.append('amount', amount);
        formData.append('screenshot', screenshot);

        axios.post('/api/expenses', formData, {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        })
        .then(response => {
            console.log(response.data);
            alert('Expense added successfully!');
        })
        .catch(error => console.error("There was an error adding the expense!", error));
    };

    return (
        <div>
            <h1>Add Expense</h1>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text" 
                    placeholder="Spent On" 
                    value={spentOn} 
                    onChange={(e) => setSpentOn(e.target.value)} 
                    required 
                />
                <input 
                    type="date" 
                    value={date} 
                    onChange={(e) => setDate(e.target.value)} 
                    required 
                />
                <input 
                    type="number" 
                    placeholder="Amount" 
                    value={amount} 
                    onChange={(e) => setAmount(e.target.value)} 
                    required 
                />
                <input 
                    type="file" 
                    onChange={(e) => setScreenshot(e.target.files[0])} 
                    required 
                />
                <button type="submit">Add Expense</button>
            </form>
        </div>
    );
};

export default AddExpense;
