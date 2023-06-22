from flask import Flask, render_template, session, g
from flask_sqlalchemy import SQLAlchemy
from flask_login import UserMixin

# Define main application
app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'sqlite:///EventMonitor.db'
app.config['SECRET_KEY'] = "JEBANIEDISAPOWIEKSZAPENISA"

db = SQLAlchemy(app)


class User(db.Model, UserMixin):
    id = db.Column(db.Intiger, primary_key=True)
    username = db.Column(db.String(20), nullable=False)
    email = db.Column(db.String(50), nullable=False)
    password = db.Column(db.String(100), nullable=False)
