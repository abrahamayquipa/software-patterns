import flask 

app = flask.Flask(__name__)
app.config["DEBUG"]=True


@app.route("/", methods=['GET'])	
def home():
	return "<h1>Bienvenido a un ejemplo python</h1>"

app.run()	