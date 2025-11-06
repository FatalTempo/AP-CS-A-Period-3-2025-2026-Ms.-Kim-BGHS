public class BookstoreReceiptRunner
{
    public static void main(String[] args)
    {
        //Create 2 BookstoreReceipt objects
        BookstoreReceipt one = new BookstoreReceipt("hi",1,"why");
        BookstoreReceipt two = new BookstoreReceipt("jim",2,"ok");
        
        //Print out the receipts
        System.out.println(one.getReceipt());
        System.out.println(two.getReceipt());
    }
}