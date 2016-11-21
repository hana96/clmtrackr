// meshblu
var meshblu = require('meshblu');
var request = require('request');

var uuid = "86f608e4-8c44-4b8c-ad7c-482854ad8968";
var token = "69ab3a54";
var suuid = "86f608e4-8c44-4b8c-ad7c-482854ad8968";
var server = "210.129.18.160";
var port = "80";

var conn = meshblu.createConnection({
 "uuid": uuid,
 "token": token,
 "server": server,
 "port": port
});

conn.on('notReady', function(data){
    console.log('UUID FAILED AUTHENTICATION!');
    console.log(data);
});

conn.on('ready', function(data){
 //console.log('UUID AUTHENTICATED!');
 //console.log(data);

 conn.on('message', function(data){
   //console.log('message received');
   //console.log(data);
   var json = data;
   if (json.payload != null){
     var payload=JSON.parse(json.payload)
     console.log(payload);
     //console.log('\n');
   }
 });
conn.status(function (data) {
 });
});
