package ru.job4j.oop.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        HtmlReport report2 = new HtmlReport();
        String text2 = report2.generate("Report's name", "Report's body");
        System.out.println(text2);

        JSONReport report3 = new JSONReport();
        String text3 = report3.generate("Отчет об ошибках", "Каждый совершает ошибки");
        System.out.println(text3);
    }
}
