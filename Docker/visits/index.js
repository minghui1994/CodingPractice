const express = require('express')
const redis = require('redis');
const process = require('process');

const app = express();

// Connection to redis server
const client = redis.createClient({
    host: 'redis-server', // usually is some address, i.e. https://www.google.com
    port: 6379 // default port of redis
});
client.set('visits', 0);

app.get('/', (req, res) => {
    // process.exit(0); // Forcibly exit, 0 means nothing went wrong, no error whatsoever.
    client.get('visits', (err, visits) => {
        res.send('Number of visits is ' + visits);
        client.set('visits', parseInt(visits) + 1);
    });
});

app.listen(8081, () => {
    console.log('Listening on port 4001');
});