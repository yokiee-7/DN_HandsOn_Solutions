
public class Main {
    public static void main(String[] args) {
        DocFac wordFactory = new WorkFac();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();

        DocFac pdfFactory = new PdfFac();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();

        DocFac excelFactory = new ExcelFac();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
