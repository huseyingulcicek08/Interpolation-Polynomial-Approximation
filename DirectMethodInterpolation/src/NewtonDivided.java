import java.awt.*;

public class NewtonDivided {
    public static void main(String[] args) {
        Point[] GunlerVeVakalar = new Point[12];
        for(int i=0;i<GunlerVeVakalar.length;i++){
            GunlerVeVakalar[i]=new Point();
        }
        GunlerVeVakalar[0].x=0;
        GunlerVeVakalar[0].y=1;    //declaring days and cases
        GunlerVeVakalar[1].x=4;
        GunlerVeVakalar[1].y=47;
        GunlerVeVakalar[2].x=8;
        GunlerVeVakalar[2].y=670;
        GunlerVeVakalar[3].x=11;
        GunlerVeVakalar[3].y=1529;
        GunlerVeVakalar[4].x=14;
        GunlerVeVakalar[4].y=3629;
        GunlerVeVakalar[5].x=17;
        GunlerVeVakalar[5].y=9217;
        GunlerVeVakalar[6].x=22;
        GunlerVeVakalar[6].y=20921;
        GunlerVeVakalar[7].x=27;
        GunlerVeVakalar[7].y=38226;
        GunlerVeVakalar[8].x=32;
        GunlerVeVakalar[8].y=61049;
        GunlerVeVakalar[9].x=37;
        GunlerVeVakalar[9].y=82329;
        GunlerVeVakalar[10].x=39;
        GunlerVeVakalar[10].y=90980;
        GunlerVeVakalar[11].x=40;
        GunlerVeVakalar[11].y=95591;


        int HedefGunler = 34;     //değiştirilebilir


        int closestDayIndex1 =0;
        int closestDayIndex2 =0;
        for (int i=0;i<GunlerVeVakalar.length;i++){
            if(GunlerVeVakalar[i].getX()<HedefGunler){
                closestDayIndex1=i;
            }
            else
                break;
        }
        for (int i=0;i<GunlerVeVakalar.length;i++){
            if(GunlerVeVakalar[i].getX()>HedefGunler){
                closestDayIndex2=i;
                break;
            }
        }
        double x0=(int)GunlerVeVakalar[closestDayIndex1].getX();
        double y0=(int)GunlerVeVakalar[closestDayIndex1].getY();
        double x1=(int)GunlerVeVakalar[closestDayIndex2].getX();
        double y1=(int)GunlerVeVakalar[closestDayIndex2].getY();
        double b0=y0;
        double b1=(y1-y0)/(x1-x0);
        int TahminiVakaSayisi= (int)(b0 + b1*(HedefGunler-x0));
        System.out.println("Interpolated value on day " + HedefGunler + " is " + TahminiVakaSayisi);
    }
}