/**
 * @author 
 * @version 
 */
public class Test
{
   private BinaryTree<Integer> tree;
   
    public Test()
    {
        tree = new BinaryTree<Integer>(15);
        tree.getLeftTree().setContent(12);
        tree.getRightTree().setContent(16);
        tree.getLeftTree().getLeftTree().setContent(10);
        tree.getLeftTree().getRightTree().setContent(13);
        
    }
    
    public void einfuegen (int a){
        einfuegen(tree, a);        
    }      
    public void einfuegen(BinaryTree<Integer> b, int a) {
        if (b.getContent() < a){
            einfuegen(b.getRightTree);

        }

        else if(b.getContent() > a){
            einfuegen(b.getLeftTree);

        }

        else if(b.getContent() == a){
            System.out.Println("Nope");

        }

        b.setContent(a);
       

    }
    
    public boolean suche (int zahl){
        return suche(tree,zahl);
    }
    public boolean suche (BinaryTree<Integer> b, int a){
        boolean exists = false;
        if(!b.isEmpty()){
            if(e.getContent() == a){
                exists = true;
            }
            else if(b.getContent() < a){
                exists = suche(e.getRightTree(), a);
            }
            else if(b.getContent() > a){
                exists = suche(e.getLeftTree(), a);
            }
        }
        return exists;
    }
    
    
    public void ausgabePreOrder(){
        preOrder(tree);
    }
    public void preOrder (BinaryTree<Integer> e){
        //Ausgabe des Baums nach Preorder.  
        
    }
    
    
    public void ausgabeInOrder(){
        inOrder(tree);
    }
    public void inOrder (BinaryTree<Integer> e){               
        //Ausgabe des Baums nach Inorder. 
        
    }    
    
    
    
    public void ausgabePostOrder(){
        postOrder(tree);
    }
    public void postOrder (BinaryTree<Integer> e){
        //Ausgabe des Baums nach Postorder.
        
    }

public int count() {
    return count(tree);
}

private int count(BinaryTree<Integer> b) {
    if (b == null || b.isEmpty()) {
        return 0; 
    }
    return 1 + count(b.getLeftTree()) + count(b.getRightTree());
}

}
