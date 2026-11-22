package com.ctu.app;

public class MainApplication {
	private static final String APP_NAME = "Technical Documentation CLI";
	private static final String VERSION = "1.0.0";
	
	public static void main(String[] args) {
		// Xử lý tham số dòng lệnh
		if (args.length > 0) {
			switch(args[0]) {
			case "--version": 
				System.out.println(APP_NAME + " v" + VERSION);
				return;
			case "--help":
				showHelp();
				return;
			default: 
				System.out.println("Tham số không hợp lệ: " + args[0]);
				showHelp();
				return;
			}
		}
		// Hiển thị thông tin mặc định
		System.out.println("========================================");
        System.out.println("       TECHNICAL DOCUMENTATION CLI      ");
        System.out.println("========================================");

        System.out.println("Sinh viên: Trần Minh Thư");
        System.out.println("MSSV: B2303851");

        System.out.println("----------------------------------------");

        System.out.println("Tên hệ thống: " + APP_NAME);
        System.out.println("Phiên bản: " + VERSION);
        System.out.println("Phiên bản Java: " + System.getProperty("java.version"));

        System.out.println("Trạng thái: RUNNING");

        System.out.println("========================================");
	}
	// Hiển thị hướng dẫn sử dụng
	private static void showHelp() {
        System.out.println("CÁCH SỬ DỤNG:");
        System.out.println("java -jar doc-cli-app.jar [options]");
        System.out.println();
        System.out.println("Các tham số hỗ trợ:");
        System.out.println("--version : Hiển thị phiên bản hệ thống");
        System.out.println("--help    : Hiển thị hướng dẫn sử dụng");
    }
}
