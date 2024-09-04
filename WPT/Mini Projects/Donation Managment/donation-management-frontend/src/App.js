import React from 'react';
import { Route, Routes, Link } from 'react-router-dom';
import Home from './components/Home';
import AddDonation from './components/AddDonation';
import AddExpense from './components/AddExpense';
import DonationList from './components/DonationList';
import ExpenseList from './components/ExpenseList';

const App = () => {
    return (
        <div>
            <nav>
                <ul>
                    <li><Link to="/">Dashboard</Link></li>
                    <li><Link to="/add-donation">Add Donation</Link></li>
                    <li><Link to="/add-expense">Add Expense</Link></li>
                    <li><Link to="/donations">Donations List</Link></li>
                    <li><Link to="/expenses">Expenses List</Link></li>
                </ul>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/add-donation" element={<AddDonation />} />
                <Route path="/add-expense" element={<AddExpense />} />
                <Route path="/donations" element={<DonationList />} />
                <Route path="/expenses" element={<ExpenseList />} />
            </Routes>
        </div>
    );
};

export default App;
