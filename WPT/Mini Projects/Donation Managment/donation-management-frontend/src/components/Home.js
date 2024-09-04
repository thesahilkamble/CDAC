import React, { useEffect, useState } from 'react';
import axios from 'axios';

const Home = () => {
    const [totalDonations, setTotalDonations] = useState(0);
    const [totalExpenses, setTotalExpenses] = useState(0);
    const [fundsLeft, setFundsLeft] = useState(0);

    useEffect(() => {
        axios.get('/api/donations/total')
            .then(response => setTotalDonations(response.data))
            .catch(error => console.error("There was an error fetching the donations!", error));

        axios.get('/api/expenses/total')
            .then(response => setTotalExpenses(response.data))
            .catch(error => console.error("There was an error fetching the expenses!", error));

        setFundsLeft(totalDonations - totalExpenses);
    }, [totalDonations, totalExpenses]);

    return (
        <div>
            <h1>Dashboard</h1>
            <p>Total Donations: {totalDonations}</p>
            <p>Total Expenses: {totalExpenses}</p>
            <p>Funds Left: {fundsLeft}</p>
        </div>
    );
};

export default Home;
