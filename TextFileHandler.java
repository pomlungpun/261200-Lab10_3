public class TextFileHandler implements Handler { // จัดการไฟล์ประเภท text และส่งต่อประเภทอื่นไปยัง handler ถัดไป
    private Handler nextHandler;
    private final String handlerName = "TextFileHandler";

    @Override
    public void process(File file) {
        if ("text".equalsIgnoreCase(file.fileType)) {
            System.out.println(handlerName + ": Processing " + file);
        } else if (nextHandler != null) {
            // ถ้าไม่ใช่ประเภทนี้ — ส่งต่อไป
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