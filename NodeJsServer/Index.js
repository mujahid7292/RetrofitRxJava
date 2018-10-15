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
    "Employee_List":{{
      "First_Name":"Saifullah Al",
      "Last_Name":"Mujahid"
    },
    {
      "First_Name":"Saifullah Al",
      "Last_Name":"Mujahid"
    },
    {
      "First_Name":"Saifullah Al",
      "Last_Name":"Mujahid"
    },
    {
      "First_Name":"Saifullah Al",
      "Last_Name":"Mujahid"
    },
  }};

  response.end(employeeList);

});


//Now we will create a listener/port for this server
server.listen(3000,'192.168.132.2');
//3000 = port number
//127.0.0.1 = localhost
console.log('Now listening to port 3000');

//Write "node Index.js" in terminal & Execute
//Now go to chrome browser and type 192.168.132.2:3000
