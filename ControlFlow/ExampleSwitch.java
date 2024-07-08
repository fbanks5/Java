package ControlFlow;

public class ExampleSwitch {
    public static void main(String[] args) {
        String extension = "pdf";

        switch (extension) {
            case "jpeg":
            case "jpg":
            case "png":
                System.out.println("It is an image file.");
                break;
            case "doc":
            case "docx":
            case "pdf":
                System.out.println("It is a document or pdf file.");
                break;
            case "xls":
            case "xlsx":
                System.out.println("It is a spreadsheet file.");
                break;
            default:
                System.out.println("Unknown file type.");
        }

        int month = 4;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month.");
        }
    }
}
