public interface Handler {
    public void process(File file);           // ประมวลผลหรือส่งต่อไฟล์
    void setNextHandler(Handler nextHandler); // กำหนด handler ถัดไป
}