//Problem-> https://leetcode.com/problems/implement-trie-prefix-tree/description/#

class Trie 
{
    char data;
    boolean isTerm;
    Trie children[];
    int childCount;
    
    public Trie(char data)
    {
        this.data=data;
        isTerm=false;
        children=new Trie[26];
        childCount=0;
    }
    
    Trie root;
    
    public Trie()
    {
        root=new Trie('\0');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        addword(word,root);
    }
    
    private void addword(String word, Trie root)
    {
        if(word.length()==0)
        {
            root.isTerm=true;
            return;
        }
        
        int index=word.charAt(0)-'a';
        Trie child=root.children[index];
        if(child==null)
        {
            child=new Trie(word.charAt(0));
            root.children[index]=child;
            ++root.childCount;
        }
        
        addword(word.substring(1),child);
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
     
       return searchword(word,root); 
    }
    
    private boolean searchword(String word,Trie root)
    {
        if(word.length()==0)
        {
            return root.isTerm;
        }
        
        int index=word.charAt(0)-'a';
        Trie child=root.children[index];
        if(child==null)
        return false;
        
        else
        {
            return searchword(word.substring(1),child);      
        }
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
     
        return startsWithword(prefix,root);
    }
    
    private boolean startsWithword(String word,Trie root)
    {
        if(word.length()==0)
        {
            return true;
        }
        
        int index=word.charAt(0)-'a';
        Trie child=root.children[index];
        if(child==null)
        return false;
        
        else
        {
           return startsWithword(word.substring(1),child);      
        }
    }
}
