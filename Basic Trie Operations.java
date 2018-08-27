//Trie Data Structure Implementation
//Time Comp of Tries->O(word length)
//Applications of Tries-> Auto Completeness in Searhing, Spell Checking, Pattern Matching
//Insertion, Deletetion, Searching, startsWith, Number of Words in Trie

class TrieNode
{
    char data;
    boolean isTerm;
    TrieNode children[];
    int childCount;
    
    public TrieNode(char data)
    {
        this.data=data;
        isTerm=false;
        children=new TrieNode[26];
        childCount=0;
    }
}

class Trie
{
    TrieNode root;
    private int NoOfWords=0;
    
    public Trie()
    {
        root=new TrieNode('\0');
    }
    
    public void add(String word)
    {
        addword(word,root);
    }
    
    private void addword(String word, TrieNode root)
    {
        if(word.length()==0)
        {
            root.isTerm=true;
            ++NoOfWords;
            return;
        }
        
        int index=word.charAt(0)-'A';
        TrieNode child=root.children[index];
        if(child==null)
        {
            child=new TrieNode(word.charAt(0));
            root.children[index]=child;
            ++root.childCount;
        }
        
        addword(word.substring(1),child);
    }
    
    public boolean search(String word)
    {
        return searchword(word,root);
    }
    
    private boolean searchword(String word,TrieNode root)
    {
        if(word.length()==0)
        {
            return root.isTerm;
        }
        
        int index=word.charAt(0)-'A';
        TrieNode child=root.children[index];
        if(child==null)
        return false;
        
        else
        {
            return searchword(word.substring(1),child);      
        }
    }
    
    public void delete(String word)
    {
        deleteword(word,root);
    }
    
    private void deleteword(String word,TrieNode root)
    {
        if(word.length()==0)
        {
            root.isTerm=false;
            --NoOfWords;
            return;
        }
        
        int index=word.charAt(0)-'A';
        TrieNode child=root.children[index];
        if(child==null)
        return;
        
        else
        {
           deleteword(word.substring(1),child);      
           
           if(child.isTerm==false && child.childCount==0)
           {
            root.children[index]=null;
            child=null;
            root.childCount--;
           }
        }
    }
    
    public boolean startsWith(String prefix) {
        
        return startsWithword(prefix,root);
    }
    
    private boolean startsWithword(String word,TrieNode root)
    {
        if(word.length()==0)
        {
            return true;
        }
        
        int index=word.charAt(0)-'A';
        TrieNode child=root.children[index];
        if(child==null)
        return false;
        
        else
        {
           return startsWithword(word.substring(1),child);      
        }
    }

	public int countWords() {
        return NoOfWords;	
	}
}

public class Main
{
	public static void main(String[] args) {
		
    Trie t=new Trie();
    t.add("ATE");
    t.add("GATE");
    t.add("NEW");
    t.add("NEWS");
    
	System.out.println(t.countWords());
	
	System.out.println(t.search("FATE"));
	System.out.println(t.search("ATE"));
	System.out.println(t.search("NEWS"));
	System.out.println(t.search("NEW"));
	
	t.delete("ATE");
	t.delete("NEWS");
	
	System.out.println(t.countWords());
	
	System.out.println(t.search("ATE"));
	System.out.println(t.search("NEWS"));
	System.out.println(t.search("NEW"));
	
	t.add("APPLE");
        t.add("APP");     
    
    System.out.println(t.startsWith("APP")); 
    
    System.out.println(t.countWords());
    
   }
}
