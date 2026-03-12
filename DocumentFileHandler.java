// จัดการไฟล์ประเภท "document" และส่งต่อประเภทอื่นไปยัง handler ถัดไป
public class DocumentFileHandler implements Handler {
    private Handler nextHandler;
    private final String handlerName = "DocumentFileHandler";

    @Override
    public void process(File file) {
        if ("document".equalsIgnoreCase(file.fileType)) {
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