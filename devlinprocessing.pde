
int x=0;
int y=0;
int x2=360;
int y2= 200;
int count = 0;
int x3=0;
int y3=10;
float t=0;
int x4=0;
int y4=90;
int r=0;
color c;
int lives=1000;
 PFont f; //<>//
void setup() {
 
  f = createFont("Arial",35,true);
  size (400,400);
}

void draw() {
background( 250 );
 fill(255,200,200);
  circle(mouseX, mouseY, 100);
  line(mouseX, mouseY+50, mouseX, 400);

  c = color(0, 250, 0);
  fill(c);
  rect(70,10,lives/5,20);
  
  
  c = color(250);
  fill(c);
  
  rect( x, y, 80, 0.7*(80+x) );
  x = x + 2;
  
    c = color(100);
  fill(c);
  triangle(x,y,x+80,y,x+40,0.7*(x+80));
  
    c = color(250);
  fill(c);

  rect( x2, y2, 80, 200 );
  x2 = x2 - 2;
  
  c = color(100);
  fill(c);
triangle(x2,y2+200,x2+40,y2,x2+80,y2+200);


  if ( x > width ) {
    x = 0;
    
    count= count +1;
  }
  if ( x2+100 < 0 ) {
    x2 = 360;
  } //<>//

if (count<4){
  background( #0000ff );
textFont(f,18);
 fill(250);
  text("Welcome to Devlin's Multimedia project #2 ...",20,100);
  text("Control the balloon with your mouse.. ",30,160);
  text("Avoid the spikes.. ",30,210);
  text("Survive 10 Cycles to win..",90,260);
  text("Game starts in...",210,300);
  text(4-count,350,300);
  //text("HINT: START HERE",75,300);
  fill(255,200,200);
  circle(mouseX, mouseY, 100);
    line(mouseX, mouseY+50, mouseX, 400);
}

  if (count>=4){
    
text("level 1",300,100);
text("health",130,50);
text("Cycle:",150,100);
text(count-4,200,100);
    if (mouseX+50 > x2 && mouseX+50 < x2+100 && mouseY+50 > y2 //&& mouseY+50 > y2-200
    ||mouseX-50 > x2 && mouseX-50 < x2+100 && mouseY+50 > y2 //&& mouseY-50 > y2 && mouseY-50 < y2+200 ) 
    )
    {
      lives=lives-10;
      background( #ff0000 );
    }
    //hit test top rect
    if (mouseX+50 > x && mouseX+50 < x+80 && mouseY-50 < 0.7*(x+80)
       || mouseX-50 > x && mouseX-50< x+80  && mouseY-50 < 0.7*(x+80) ) {

      lives=lives-10;
      background( #ff0000 );
    }
    println("count=", count);
 


 
} 



if (count>=8){
text("level 2",300,100);
    if (mouseX+50 > x2 && mouseX+50 < x2+100 && mouseY+50 > y2 //&& mouseY+50 > y2-200
    ||mouseX-50 > x2 && mouseX-50 < x2+100 && mouseY+50 > y2 //&& mouseY-50 > y2 && mouseY-50 < y2+200 ) 
    )
    {
      lives=lives-10;
      background( #ff0000 );
    }
    //hit test top rect
    if (mouseX+50 > x && mouseX+50 < x+80 && mouseY-50 < 0.7*(x+80)
       || mouseX-50 > x && mouseX-50< x+80  && mouseY-50 < 0.7*(x+80) ) {

      lives=lives-10;
      background( #ff0000 );
    }
    println("count=", count);
    c = color(100);
  fill(c);
   triangle(0,0,t,50,0,150);
   if(t<=100){
     t=t+0.5;}
triangle(0,150,t,200,0,250);
   if(t<=100){
     t=t+0.5;}
     triangle(0,250,t,300,0,350);
   if(t<=100){
     t=t+0.5;}
     
      if (mouseX-50 < t
        ) {

      lives=lives-10;
      background( #ff0000 );
    }
     
if (count>=15&& lives>0){
  background( #0000ff );
  fill(250);
 text("yay you win!",10,100);
 text("Press any key to Restart",100,300);
 lives=1000;
  
}
 
}
   if (lives<=0){
 background( #0000ff );
 fill(250);
 text("Game over...",10,100);
 text("Press any key to Restart",100,300);
 lives =0;
 }
  
      }
      void keyPressed(){count=0;
    lives=1000;}
  
  
  
 


//void mouseMoved() {
