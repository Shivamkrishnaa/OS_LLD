package Solid.SOLID_8_DECORATOR_HTML.components;

import Solid.SOLID_8_DECORATOR_HTML.Html;

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
