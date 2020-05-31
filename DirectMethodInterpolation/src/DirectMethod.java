import java.awt.*;

public class DirectMethod {
    public static void main(String[] args) {
        Point[] GunlerVeVakalar = new Point[12];
        for(int i=0;i<GunlerVeVakalar.length;i++){
            GunlerVeVakalar[i]=new Point();
        }
        GunlerVeVakalar[0].x=0;
        GunlerVeVakalar[0].y=1;
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
        int HedefGun = 34;
        int closestDayIndex1 =0;
        int closestDayIndex2 =0;
        for (int i=0;i<GunlerVeVakalar.length;i++){
            if(GunlerVeVakalar[i].getX()<HedefGun){
                closestDayIndex1=i;
            }
            else
                break;
        }
        for (int i=0;i<GunlerVeVakalar.length;i++){
            if(GunlerVeVakalar[i].getX()>HedefGun){
                closestDayIndex2=i;
                break;
            }
        }
        int x0=(int)GunlerVeVakalar[closestDayIndex1].getX();
        int y0=(int)GunlerVeVakalar[closestDayIndex1].getY();
        int x1=(int)GunlerVeVakalar[closestDayIndex2].getX();
        int y1=(int)GunlerVeVakalar[closestDayIndex2].getY();
        int TahminiVakalar = y0 + ((y1-y0) / (x1-x0)) * (HedefGun - x0);
        System.out.println("Interpolated value on day " + HedefGun + " is " + TahminiVakalar);
    }
}