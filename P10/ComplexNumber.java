public class ComplexNumber{
  double real, img;
  //constructor to initialize the complex numb
  ComplexNumber(double r,double i) {
  this.real = r;
  this.img = i;
  }
  public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2){
  //creating a temporary complex number to hold the sum of two numbers
  ComplexNumber temp = new ComplexNumber(0,0);
  temp.real = c1.real + c2.real;
  temp.img = c1.img + c2.img;
  //returning the output complex number
  return temp;
  }public static void main(String args[]){
  ComplexNumber c1 = new ComplexNumber(5.5, 5);
  ComplexNumber c2 =new ComplexNumber(2.2,2.2);
  ComplexNumber temp = sum(c1, c2);
  System.out.printf("Sum is: "+ temp.real + " + " +temp.img +"i");
  }
  }
  