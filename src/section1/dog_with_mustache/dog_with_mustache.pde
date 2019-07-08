 PImage mustache;

PImage dog;






void setup(){ 
  size(800, 600);
  dog = loadImage("dog.png");
dog.resize(800,600);

}
void draw(){
  background(dog);

    mustache = loadImage("mustache.png");
    
    image(mustache, 400, 300);

}
