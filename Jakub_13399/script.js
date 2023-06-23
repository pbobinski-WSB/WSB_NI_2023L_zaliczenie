let body = document.querySelector('body');

body.addEventListener('keydown', (event) => {
  if(event.keyCode === 32) {
    color = 'rgb(' + Math.random()*255 + ',' + Math.random()*255 +','+ Math.random()*255 + ')';
    body.style.backgroundColor = color;
  }
})