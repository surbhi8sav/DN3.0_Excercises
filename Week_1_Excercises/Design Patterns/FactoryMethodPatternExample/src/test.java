abstract class WordDocument {
    public abstract void display();
}
abstract class PdfDocument {
    public abstract void display();
}
abstract class ExcelDocument {
    public abstract void display();
}
abstract class DocumentFactory {
    public abstract void createDocument();
}
class Word extends DocumentFactory{
	public void createDocument()
	{   ConcreteWord cw=new ConcreteWord();
	    cw.display();
		System.out.println("Word Document created");
	}
}
class ConcreteWord extends WordDocument {
    @Override
    public void display() {
        System.out.println("This is a Word Document");
    }
}
class ConcretePdf extends PdfDocument {
    @Override
    public void display() {
        System.out.println("This is Pdf Document");
    }
}
class Pdf extends DocumentFactory{
	public void createDocument()
	{   ConcretePdf cp=new ConcretePdf();
	    cp.display();
		System.out.println("Pdf Document created");
	}
}
class ConcreteExcel extends ExcelDocument {
    @Override
    public void display() {
        System.out.println("This is Excel Document");
    }
}
class Excel extends DocumentFactory{
	public void createDocument()
	{   ConcreteExcel ce=new ConcreteExcel();
	    ce.display();
		System.out.println("Excel Document created");
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Word w=new Word();
     w.createDocument();
     Pdf p=new Pdf();
     p.createDocument();
     Excel e=new Excel();
     e.createDocument();
	}

}
