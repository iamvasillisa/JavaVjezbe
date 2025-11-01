
public class GameObject {
	

private String ime;
private int x;
private int y;
private int width;
private int height;


 //KONSTRUKTOR
public void GameObject(String ime, int x, int y, int width, int height){
	this.ime = ime;
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
}

//GETERI I SETERI

 public String getIme() {
	return ime;
 }



 public void setIme(String ime) {
	this.ime = ime;
 }

 public int getX() {
	return x;
 }


 public void setX(int x) {
	this.x = x;
 }


 public int getY() {
	return y;
 }


 public void setY(int y) {
	this.y = y;
 }


 public int getWidth() {
	return width;
 }


 public void setWidth(int width) {
	this.width = width;
 }


 public int getHeight() {
	return height;
 }


 public void setHeight(int height) {
	this.height = height;
 }}
 

 