package Solid.SOLID_8_DECORATOR_HTML.components;

import Solid.SOLID_8_DECORATOR_HTML.Html;

public class Column implements Html{
    private Html html;
    public Column(Html html) {
        this.html = html;
    }
    @Override
    public String getElement() {
        return html.getElement()+"<Column>";
    }
    @Override
    public String getElementEndBlock() {
        return "</Column>"+ html.getElementEndBlock();
    }
}
