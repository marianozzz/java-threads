package com.utn;

public class TH extends  Thread
{
    private  int n;
    @Override
    public void run() {

        try
        {
           Thread.sleep((long)(Math.random()*5)*1000 ) ;
           System.out.println("Termino en :"+n);
        }
        catch (Exception e)
        {
          System.out.println(e);
        }

        super.run();
    }
    public TH(int n)
    {
        this.setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "TH{" +
                "n=" + n +
                '}';
    }
}
