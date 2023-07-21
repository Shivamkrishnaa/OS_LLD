package SOLID_8_DECORATOR_HTML;

import SOLID_8_DECORATOR_HTML.components.Block;
import SOLID_8_DECORATOR_HTML.components.Body;
import SOLID_8_DECORATOR_HTML.components.Column;
import SOLID_8_DECORATOR_HTML.components.Section;

public class Client {
    public static void main(String[] args) {
        Html h = new Block(new Column(new Section(new Body())));
        System.out.println(h.getElement()+h.getElementEndBlock());
    }
}
