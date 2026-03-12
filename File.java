public class File { // คลาสแทนไฟล์ที่มีชื่อ ประเภท และตำแหน่งที่อยู่
    String fileName;
    String fileType;
    String filePath;

    public File(String fileName, String fileType, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "File{name='" + fileName + "', type='" + fileType + "', path='" + filePath + "'}";
    }
}