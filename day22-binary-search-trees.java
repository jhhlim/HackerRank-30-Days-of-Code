

	public static int getHeight(Node root){
      //Write your code here
      int heightleft=0;
      int heightright=0;
      if(root.left!=null){
          heightleft=getHeight(root.left)+1;
      }
      if(root.right!=null){
          heightright=getHeight(root.right)+1;
      }
      return (heightleft>heightright?heightleft:heightright);
    }

