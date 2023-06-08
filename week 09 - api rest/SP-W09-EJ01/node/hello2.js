var http = require("http");
var fs= require("fs");
var manejador =function(solicitud, respuesta){

console.log ("Conexion recibida");
fs.readFile("./login2.html",null, function(error,data){
if (error){
	respuesta.writehead(404);
	respuesta.write("Archivo no encontrado");
} else {
respuesta.write(data);
}
respuesta.end();
} );
}
var servidor=http.createServer(manejador);
servidor.listen(8080);