package com.tintachina.chapter_02;

public class HtmlExporter implements Exporter {
    @Override
    public String export(final SummaryStatistics summaryStatistics) {
//        String result = "<!doctype html>";
//        result += "<html lang='en'>";
//        result += "<head><title>Bank Transaction Report</title></head>";
//        result += "<body>";
//        result += "<ul>";
//        result += "<li><strong>The sum is</strong>: " + summaryStatistics.getSum() + "</li>";
//        result += "<li><strong>The average is</strong>: " + summaryStatistics.getAverage() + "</li>";
//        result += "<li><strong>The max is</strong>: " + summaryStatistics.getMax() + "</li>";
//        result += "<li><strong>The min is</strong>: " + summaryStatistics.getMin() + "</li>";
//        result += "</ul>";
//        result += "</body>";
//        result += "</html>";
//        return result;
        return """
                <!doctype html>
                <html lang='en'>
                    <head><title>Bank Transaction Report</title></head>
                    <body>
                        <ul>
                            <li><strong>The sum is</strong>: %s</li>
                            <li><strong>The average is</strong>: %s</li>
                            <li><strong>The max is</strong>: %s</li>
                            <li><strong>The min is</strong>: %s</li>
                        </ul>
                    </body>
                </html>""".formatted(
                summaryStatistics.getSum(),
                summaryStatistics.getAverage(),
                summaryStatistics.getMax(),
                summaryStatistics.getMin()
        );
    }
}
