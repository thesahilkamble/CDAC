import React, { useState } from 'react';
import axios from 'axios';

const AddDonation = () => {
    const [donorName, setDonorName] = useState('');
    const [date, setDate] = useState('');
    const [amount, setAmount] = useState('');
    const [screenshot, setScreenshot] = useState(null);

    const handleSubmit = (e) => {
        e.preventDefault();
        const formData = new FormData();
        formData.append('donorName', donorName);
        formData.append('date', date);
        formData.append('amount', amount);
        formData.append('screenshot', screenshot);

        axios.post('/api/donations', formData, {
            headers: {
                'Content-Type': 'multipart/form-data'
            }
        })
        .then(response => {
            console.log(response.data);
            alert('Donation added successfully!');
        })
        .catch(error => console.error("There was an error adding the donation!", error));
    };

    return (
        <div>
            <h1>Add Donation</h1>
            <form onSubmit={handleSubmit}>
                <input 
                    type="text" 
                    placeholder="Donor Name" 
                    value={donorName} 
                    onChange={(e) => setDonorName(e.target.value)} 
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
                <button type="submit">Add Donation</button>
            </form>
        </div>
    );
};

export default AddDonation;
