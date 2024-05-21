const express = require('express');
const app = express();
const port = 3000;

// Middleware to parse JSON bodies
app.use(express.json());

// In-memory array to store book details
let books = [];
let currentId = 1;

// POST endpoint to add a new book
app.post('/books', (req, res) => {
    const { name, author, price } = req.body;

    // Validate request body
    if (!name || !author || price === undefined) {
        return res.status(400).json({ error: 'Name, author, and price are required' });
    }

    // Create new book object
    const newBook = {
        id: currentId,
        name,
        author,
        price
    };

    // Increment the ID for the next book
    currentId++;

    // Save the book to the in-memory array
    books.push(newBook);

    // Return the newly added book object in the response
    res.status(201).json(newBook);
});

// Start the server
app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
