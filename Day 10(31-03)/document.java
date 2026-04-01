class DocumentEditor{
    public void textdoc(String text ){
        if(text!=null){
            System.out.println("Text added in document");     
            save();
            create();
                                         
        }
        else{
            System.out.println("Error in opening");
        
        }
    }
}

public class document{

}

/* 

Design Document editor where user create different types of docuument like textdoc,image doc,spreadsheet doc.

Requirement:
1.each document should open ,save,close
2.diff document types behaves differently 
text -> shows text contents 
image -> renders image
Spreadsheet -> calculate cells.
rules:
user shuld not know interva logic
documment must be protected
System should allow adding new document type.
rules1: abstracction
rules2: encapsulation
rules3: inheritance
 */