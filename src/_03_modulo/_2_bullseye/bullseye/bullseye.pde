
void setup() {
 
  // set the size of your sketch
  size(600,600);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i=0;i<8;i++){
   if (i%2==0){
   fill(#F51616);
   }else{
    fill (0);
   }
    ellipse(300,300,400-50*i,400-50*i);
    
    
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
