package ast;

public class Return extends Stmt {
 	public Expr ret;
 	public FunDecl fun;
 	public Return(){ret = null;}
  	public Return(Expr e){ ret = e; }
    public <T> T accept(ASTVisitor<T> v) {
         return v.visitReturn(this);
     }
}