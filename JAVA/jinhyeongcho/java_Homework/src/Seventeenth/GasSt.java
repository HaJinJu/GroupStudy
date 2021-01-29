package Seventeenth;



public class GasSt {
     float dis;
     float x,y;

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void myCoordinates(){
         int x = (int)(Math.random()*50);
         int y = (int)(Math.random()*50);
         System.out.printf("나의 좌표는 %d, %d ",x,y);
    }
    public void gasStCoordinates(){

            int x = (int)(Math.random()*50);
            int y = (int)(Math.random()*50);
            System.out.printf("주유소의 좌표는 %d, %d \n",x,y);
    }
    public void distanceCal(GasSt gas){
        double m = Math.pow(this.getX() -x,2);
        double n =Math.pow(this.getY() -y,2);
        System.out.println("getx" + this.getX());
        System.out.println("x" + x);
        System.out.println("getx" + this.getY());
        System.out.println("y" + y);
        System.out.println("m,n "+ m +n);
    }



}
