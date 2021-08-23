package com.company;

class Q
{
    int num;
    boolean valueSet = false;

    public synchronized void givenTasks(int num)
    {
        while(valueSet)
        {
            try{ wait(); } catch(Exception e){}
        }
        System.out.println("givenTasks: " + num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void TasksDone()
    {
        while(!valueSet)
        {
            try{ wait(); } catch(Exception e){}
        }
        System.out.println("Tasks Done: "+ num);
        valueSet = false;
        notify();
    }
}
class Surya implements Runnable
{
    Q q;

    public Surya(Q q)
    {
        this.q = q;
        Thread t = new Thread(this,"Surya");
        t.start();
    }
    public void run()
    {
        int i=0;
        while(true)
        {
            q.givenTasks(i++);
            try{ Thread.sleep(500); } catch(Exception e){}
        }
    }
}
class Hussain implements Runnable
{
    Q q;

    public Hussain(Q q)
    {
        this.q = q;
        Thread t = new Thread(this,"Hussain");
        t.start();
    }
    public void run()
    {
        while(true)
        {
            q.TasksDone();
            try{ Thread.sleep(5000); } catch(Exception e){}
        }
    }
}

public class InterThread {

    public static void main(String[] args)
    {
        Q q= new Q();
        new Surya(q);
        new Hussain(q);
    }
}
