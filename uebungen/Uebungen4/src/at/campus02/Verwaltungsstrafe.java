package at.campus02;


public class Verwaltungsstrafe {
    protected String vorname;
    protected String nachname;
    protected String kennzeichen;
    protected int strafnummer;
    protected double strafe;
    protected int anzahl;



    public void strafe(int geschwindigkeitsueberschreitung)
    {
        anzahl += 1;
        if(geschwindigkeitsueberschreitung < 20)
        {
            strafe += 30;
        }
        else
        {
            if(geschwindigkeitsueberschreitung < 30)
            {
                strafe  += 50;
            }
            else
            {
                if(geschwindigkeitsueberschreitung < 50)
                {
                    strafe += 100;
                }
                else
                {
                    if(geschwindigkeitsueberschreitung < 100)
                    {
                        strafe += 500;
                    }
                    else
                    {
                        strafe += 1500;
                    }
                }
            }
        }
    }
    public void alkohol(double wert)
    {
        if(wert >= 0.5)
        {
            anzahl += 1;
            if (wert < 1.0)
            {
                strafe += 100;
            }
            else
            {
                if(wert < 2.0)
                {
                    strafe += 400;
                }
                else
                {
                    if (wert < 3.0)
                    {
                        strafe += 1000;
                    }
                    else
                    {
                        strafe += 5000;
                    }
                }
            }

        }
    }
    public void sonstiges(double wert)
    {
        anzahl += 1;
        strafe += wert;
    }

    public double getStrafe() {
        if (anzahl == 1)
        {
            return strafe * 0.7;
        }
        if(anzahl == 2)
        {
            return strafe * 0.8;
        }
        if(anzahl == 3)
        {
            return strafe * 0.9;
        }
        return strafe;
    }

}