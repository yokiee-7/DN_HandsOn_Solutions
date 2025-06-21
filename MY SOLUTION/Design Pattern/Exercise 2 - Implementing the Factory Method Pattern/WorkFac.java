public class WorkFac extends DocFac {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
