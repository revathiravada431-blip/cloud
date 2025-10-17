import java.io.*;
abstract class Vechile
{
abstract void run();
}
class Car extends Vechile
{
void run()
{
System.out.println("the vechile runs safely");
}
}
class AC 
{
public static void main(String arg[])
{
Car c=new Car();
c.run();
}
}