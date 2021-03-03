package veriYapilari1;

public class childList {

	Node ilk;
	Node son;
	public childList()
	{
		ilk=null;
		son=null;
	}
	public void idEkle(int sayi)
	{
		Node yeniNode=new Node(sayi);
		if(ilk!= null)
		{
			yeniNode.siradaki=ilk;
			ilk=yeniNode;
		}
		else
		{
			ilk=yeniNode;
			son=yeniNode;
		}
	}
	public void idYazdir()
	{
		Node isaretci=ilk;
		while(isaretci!=null)
		{
			System.out.print(isaretci.id+" ");
			isaretci=isaretci.siradaki;
			
		}
	}
}
