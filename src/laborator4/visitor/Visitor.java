package laborator4.visitor;

public interface Visitor {
    void visit(Element[] e);
    void visit(Book e);
    void visit(Video e);
    void visit(Audio e);
}
