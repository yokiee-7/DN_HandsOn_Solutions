public class ExcelFac extends DocFac {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
