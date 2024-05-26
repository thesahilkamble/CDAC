buf = new Buffer.alloc(256); // to allocate buffer size 256 bytes

lendata = buf.write("This is data in buffer")
console.log("bytes written", lendata); 
console.log(buf) // gives output in ascci values
console.log(buf.toString()); //converted to string