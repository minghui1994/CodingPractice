// Express library
const express = require('express');

const app = express();

// When app is run, and when running browser, Hi there is printed
app.get('/', (req, res) => {
    res.send('How are you doing');
});

app.listen(8080, () => {
    console.log('Listening on port 8080');
});