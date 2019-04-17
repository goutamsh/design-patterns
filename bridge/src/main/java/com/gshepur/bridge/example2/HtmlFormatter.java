package com.gshepur.bridge.example2;

import java.util.List;

public class HtmlFormatter implements Formatter {
    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html>\n")
                .append("<body>\n");
        stringBuilder.append(header);
        stringBuilder.append("[")
                .append("\n");
        for (Detail d : details){
            stringBuilder.append(d.getLabel())
                    .append(":")
                    .append(d.getValue());
        }
        stringBuilder.append("\n").append("]");
        stringBuilder.append("</body>\n</html>");
        return stringBuilder.toString();
    }
}
