import React, { useEffect, useState } from 'react';
import axios from 'axios';

const DonationList = () => {
    const [donations, setDonations] = useState([]);

    useEffect(() => {
        axios.get('/api/donations')
            .then(response => setDonations(response.data))
            .catch(error => console.error("There was an error fetching the donations!", error));
    }, []);

    return (
        <div>
            <h1>Donations List</h1>
            <ul>
                {donations.map(donation => (
                    <li key={donation.id}>
                        {donation.donorName} donated {donation.amount} on {donation.date}
                        <a href={donation.screenshotUrl} target="_blank" rel="noopener noreferrer">View Screenshot</a>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default DonationList;
