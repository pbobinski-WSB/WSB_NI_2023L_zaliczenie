class User(db.Model, UserMixin):
    id = db.Column(db.Intiger, primary_key=True)
    username = db.Column(db.String(20), nullable=False)
    email = db.Column(db.String(50), nullable=False)
    password = db.Column(db.String(100), nullable=False)

@app.route('/')
def main():
    return render_template('index.html')


@app.route('/<username>')
def main():
    if 'username' in session:
        username = session['username']
        return render_template('main_app.html')
    else:
        return render_template('index.html')


if __name__ == '__main__':
    app.run(debug=True)

