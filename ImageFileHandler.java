public class ImageFileHandler implements Handler { // จัดการไฟล์ประเภท "image" และส่งต่อประเภทอื่นไปยัง handler ถัดไป
    private Handler nextHandler;
    private final String handlerName = "ImageFileHandler";

    @Override
    public void process(File file) {
        if ("image".equalsIgnoreCase(file.fileType)) {
            System.out.println(handlerName + ": Processing " + file);
        } else if (nextHandler != null) {
            // ไม่ใช่ประเภทของเรา — ส่งต่อไป
            System.out.println(handlerName + ": Forwarding " + file);
            nextHandler.process(file);
        } else {
            System.out.println(handlerName + ": File not supported: " + file);
        }
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}