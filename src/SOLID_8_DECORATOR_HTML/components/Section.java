package SOLID_8_DECORATOR_HTML.components;

import SOLID_8_DECORATOR_HTML.Html;

public class Section implements Html {
    private Html html;
    public Section(Html html) {
        this.html = html;
    }
    @Override
    public String getElement() {
        return html.getElement()+"<Section>";
    }
    @Override
    public String getElementEndBlock() {
        return "</Section>"+ html.getElementEndBlock();
    }
}
