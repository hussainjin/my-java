package com.company;

import java.util.ArrayList;
import java.util.Collection;

class info
{
    public void inGarage(Collection garage)
    {
        System.out.println("\n>---: Available Cars in garage :---<\n");
        for(Object s: garage)
        {
            System.out.println(s);
        }
    }

    public void SuryaRide(Collection garage)
    {
        System.out.println("\nSurya took Audi..>>\n");
        garage.remove("Audi 0000");
        try{wait(1000); } catch (Exception e){}
    }

    public void HussainRide(Collection garage)
    {
        System.out.println("\nHussain took Mustang..>>\n");
        garage.remove("Mustang ford");
        try{wait(1000); } catch (Exception e){}
    }

    public void SuryaReturn(Collection garage)
    {
        System.out.println("\n.<<..Audi 0000 returned\n");
        garage.add("Audi 0000");
        try{wait(1000); } catch (Exception e){}
    }

    public void HussainReturn(Collection garage)
    {
        System.out.println("\n.<<..Mustang returned\n");
        garage.add("Mustang ford");
        try{wait(1000); } catch (Exception e){}
    }
}
public class collection
{
    public static void main(String[] args) throws Exception
    {
        Collection Garage = new ArrayList();
        Garage.add("BMW car");
        Garage.add("Audi 0000");
        Garage.add("miniCooper WV");
        Garage.add("Mustang ford");


        info a = new info();
        a.inGarage(Garage);
        a.SuryaRide(Garage);
        a.inGarage(Garage);
        a.HussainRide(Garage);
        a.inGarage(Garage);
        a.SuryaReturn(Garage);
        a.inGarage(Garage);
        a.HussainReturn(Garage);
        a.inGarage(Garage);
    }
}
