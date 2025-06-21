public class PdfFac extends DocFac {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
