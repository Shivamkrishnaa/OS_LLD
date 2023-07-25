package Solid.SOLID_8_DECORATOR_HTML;

import Solid.SOLID_8_DECORATOR_HTML.components.Block;
import Solid.SOLID_8_DECORATOR_HTML.components.Body;
import Solid.SOLID_8_DECORATOR_HTML.components.Column;
import Solid.SOLID_8_DECORATOR_HTML.components.Section;

public class Client {
    public static void main(String[] args) {
        Html h = new Block(new Column(new Section(new Body())));
        System.out.println(h.getElement()+h.getElementEndBlock());
    }
}
