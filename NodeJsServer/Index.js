//Command For Running server "node Index.js"
//Run this command in cmd on file location "C:File/Index.js"
var http = require("http");

var server = http.createServer((request,response)=>{
  //First Check The Requested url
  console.log("EndPoint: " + request.url);
  //First we will create our response header
  response.writeHead(200,{"Content-Type":"application/json"});
  //Create data, which will be send with response
  //in this case it is json

  var employeeList = {
    "Employee_List":[
      {"First_Name":"John", "Last_Name":"Doe"}, 
      {"First_Name":"Anna", "Last_Name":"Smith"},
      {"First_Name":"Peter", "Last_Name":"Jones"},
      {"First_Name":"John", "Last_Name":"Doe"}, 
      {"First_Name":"Anna", "Last_Name":"Smith"},
      {"First_Name":"Peter", "Last_Name":"Jones"}
  ]
    
  };

  response.end(JSON.stringify(employeeList));

});


//Now we will create a listener/port for this server
server.listen(3000,'192.168.99.106');
//3000 = port number
//192.168.99.106 = this is my windows 10 computer IP address
console.log('Now listening to port 3000');

//Write "node Index.js" in terminal & Execute
//Now go to chrome browser and type 192.168.132.2:3000
