from flask import Flask, render_template, session, g
from flask_sqlalchemy import SQLAlchemy
from flask_login import UserMixin

# Define main application
app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///EventMonitor.db'
app.config['SECRET_KEY'] = "JEBANIEDISAPOWIEKSZAPENISA"

db = SQLAlchemy(app)
