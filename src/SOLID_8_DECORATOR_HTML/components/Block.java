package SOLID_8_DECORATOR_HTML.components;

import SOLID_8_DECORATOR_HTML.Html;

public class Block implements Html{
    private Html html;
    public Block(Html html) {
        this.html = html;
    }
    @Override
    public String getElement() {
        return html.getElement()+"<Block>";
    }

    @Override
    public String getElementEndBlock() {
        return "</Block>"+ html.getElementEndBlock();
    }

}
