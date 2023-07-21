package SOLID_8_DECORATOR_HTML.components;

import SOLID_8_DECORATOR_HTML.Html;

public class Body implements Html {

    public Body() { }
    @Override
    public String getElement() {
        return "<Body>";
    }

    @Override
    public String getElementEndBlock() {
        return "</Body>";
    }
}
