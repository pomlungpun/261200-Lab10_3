public class Lab10_3 {
    public static void main(String[] args) {
        // สร้าง handler แต่ละตัว
        TextFileHandler textHandler = new TextFileHandler();
        DocumentFileHandler documentHandler = new DocumentFileHandler();
        ImageFileHandler imageHandler = new ImageFileHandler();

        // เชื่อม text -> document -> image
        textHandler.setNextHandler(documentHandler);
        documentHandler.setNextHandler(imageHandler);

        // สร้างไฟล์ทดสอบแต่ละประเภท
        File textFile = new File("README.txt", "text", "/home/docs");
        File docFile = new File("Document.doc", "document", "/home/docs");
        File imageFile = new File("Picture.jpg", "image", "/home/images");
        File audioFile = new File("Song.mp3", "audio", "/home/audio"); // ประเภทที่ไม่รองรับ

        System.out.println("Processing text file:");
        textHandler.process(textFile);

        System.out.println("\nProcessing document file:");
        textHandler.process(docFile);

        System.out.println("\nProcessing image file:");
        textHandler.process(imageFile);

        System.out.println("\nProcessing audio file:");
        textHandler.process(audioFile);
    }
}