package com.company;


class Node
{
    String data;
    Node next;
}

class Garage
{
    Node head;
    public void CameIn(String data)
    {
        Node n = new Node();
        n.data = data;
        n.next = null;

        if (head==null)
        {
            head = n;
        }
        else
        {
            Node node = head;

            while(node.next != null)
            {
                node = node.next;
            }
            node.next = n;
        }
    }

    public void SuryaCameIn()
    {
        System.out.println("\n<<..Audi 0000 returned\n");
        CameIn("Audi 0000");
    }

    public void HussainCameIn()
    {
        System.out.println("\n<<..Mustang ford returned\n");
        CameIn("Mustang ford");
    }

    public void WentOut(String data)
    {
        Node node = head;
        Node dup = null;

        while(node.data == data)
        {
            node = node.next;
        }

        dup = node.next;
        try
        {
            if (dup.next == null)
            {
                node.next = null;
            }
            else
            {
                node.next = dup.next;
            }
        }
        catch(NullPointerException e)
        {
            node.next = null;
        }
    }
    public void SuryaWentOut()
    {
        System.out.println("\n..Surya went in Audi 0000 ..>>>\n");
        WentOut("Audi 0000");
    }
    public void HussainWentOut()
    {
        System.out.println("\n..Hussain went in Mustang ..>>>\n");
        WentOut("Mustang ford");
    }

    public void InGarage()
    {
        System.out.println("\n:....Available cars in garage....:\n");
        Node node =head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
public class Garageinfo
{

    public static void main(String[] args)
    {
        Garage g = new Garage();
        g.HussainCameIn();
        g.SuryaCameIn();
        g.CameIn("Mini Cooper");
        g.CameIn("jaguar");
        g.InGarage();
        g.WentOut("jaguar");
        g.InGarage();
        g.SuryaWentOut();
        g.HussainWentOut();
        g.InGarage();
        g.HussainCameIn();
        g.InGarage();
        g.SuryaCameIn();
        g.InGarage();
    }
}
