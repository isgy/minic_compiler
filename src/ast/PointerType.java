package ast;

public class PointerType implements Type {

	   public Type ptype;
       public PointerType(Type t){ptype = t;}
       public <T> T accept(ASTVisitor<T> v) {
           return v.visitPointerType(this);
       }

}
